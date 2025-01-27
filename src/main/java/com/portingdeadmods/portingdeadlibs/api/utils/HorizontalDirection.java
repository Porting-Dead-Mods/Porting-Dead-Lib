package com.portingdeadmods.portingdeadlibs.api.utils;

import net.minecraft.core.Direction;
import org.jetbrains.annotations.Nullable;

public enum HorizontalDirection {
    NORTH,
    EAST,
    SOUTH,
    WEST;

    public Direction toRegularDirection() {
        return switch (this) {
            case NORTH -> Direction.NORTH;
            case EAST -> Direction.EAST;
            case SOUTH -> Direction.SOUTH;
            case WEST -> Direction.WEST;
        };
    }

    public static @Nullable HorizontalDirection fromRegularDirection(Direction direction) {
        return switch (direction) {
            case NORTH -> NORTH;
            case EAST -> EAST;
            case SOUTH -> SOUTH;
            case WEST -> WEST;
            default -> null;
        };
    }
}