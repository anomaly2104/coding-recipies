package com.uditagarwal.composition_over_inheritance.chess.composition;

import com.uditagarwal.composition_over_inheritance.chess.Cell;

public class DiagonalMove implements Move {
    @Override
    public boolean canMove(Cell source, Cell destination) {
        // Check if source and destination in diagonal
        return false;
    }
}
