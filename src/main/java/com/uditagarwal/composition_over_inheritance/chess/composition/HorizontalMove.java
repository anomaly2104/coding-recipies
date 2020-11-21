package com.uditagarwal.composition_over_inheritance.chess.composition;

import com.uditagarwal.composition_over_inheritance.chess.Cell;

public class HorizontalMove implements Move {

    @Override
    public boolean canMove(Cell source, Cell destination) {
        // Check if source and destination in horizontal
        return false;
    }
}
