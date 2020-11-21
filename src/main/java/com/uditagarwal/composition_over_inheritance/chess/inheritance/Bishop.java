package com.uditagarwal.composition_over_inheritance.chess.inheritance;

import com.uditagarwal.composition_over_inheritance.chess.Cell;

public class Bishop extends Piece {

    @Override
    boolean canMove(Cell source, Cell destination) {
        // Check if source and destination in diagonal
        return true;
    }
}
