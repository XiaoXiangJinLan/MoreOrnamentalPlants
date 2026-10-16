package com.jinlan.moreornplants.worldgen.dimension;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.saveddata.SavedData;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PortalAnchorData extends SavedData {

    public static final String DATA_NAME = "more_orn_plants_portal_anchors";

    private final Map<UUID, BlockPos> qunfangAnchors   = new HashMap<>();
    private final Map<UUID, BlockPos> overworldAnchors = new HashMap<>();

    // ---------- 存取入口 ----------
    public static PortalAnchorData get(ServerLevel anyLevel) {
        ServerLevel overworld = anyLevel.getServer().overworld();
        return overworld.getDataStorage().computeIfAbsent(
                PortalAnchorData::load,          // 反序列化
                PortalAnchorData::new,           // 新建
                DATA_NAME);
    }

    // ---------- 序列化 ----------
    public static PortalAnchorData load(CompoundTag tag) {
        PortalAnchorData data = new PortalAnchorData();
        readMap(tag, "QunfangAnchors",   data.qunfangAnchors);
        readMap(tag, "OverworldAnchors", data.overworldAnchors);
        return data;
    }

    @Override
    public @NotNull CompoundTag save(@NotNull CompoundTag tag) {
        writeMap(tag, "QunfangAnchors",   qunfangAnchors);
        writeMap(tag, "OverworldAnchors", overworldAnchors);
        return tag;
    }

    private static void readMap(CompoundTag tag, String key, Map<UUID, BlockPos> out) {
        if (!tag.contains(key)) return;
        CompoundTag mapTag = tag.getCompound(key);
        for (String uuidStr : mapTag.getAllKeys()) {
            CompoundTag posTag = mapTag.getCompound(uuidStr);
            out.put(UUID.fromString(uuidStr),
                    new BlockPos(posTag.getInt("x"), posTag.getInt("y"), posTag.getInt("z")));
        }
    }

    private static void writeMap(CompoundTag tag, String key, Map<UUID, BlockPos> map) {
        CompoundTag mapTag = new CompoundTag();
        map.forEach((uuid, pos) -> {
            CompoundTag posTag = new CompoundTag();
            posTag.putInt("x", pos.getX());
            posTag.putInt("y", pos.getY());
            posTag.putInt("z", pos.getZ());
            mapTag.put(uuid.toString(), posTag);
        });
        tag.put(key, mapTag);
    }

    // ---------- 读写锚点 ----------
    public BlockPos getQunfangAnchor(UUID id)   { return qunfangAnchors.get(id); }
    public BlockPos getOverworldAnchor(UUID id) { return overworldAnchors.get(id); }

    public void setQunfangAnchor(UUID id, BlockPos pos) {
        qunfangAnchors.put(id, pos);
        setDirty();
    }

    public void setOverworldAnchor(UUID id, BlockPos pos) {
        overworldAnchors.put(id, pos);
        setDirty();
    }
}