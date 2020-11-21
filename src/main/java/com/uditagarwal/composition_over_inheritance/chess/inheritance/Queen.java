package com.uditagarwal.composition_over_inheritance.chess.inheritance;

import com.uditagarwal.composition_over_inheritance.chess.Cell;

public class Queen extends Piece {

    @Override
    boolean canMove(Cell source, Cell destination) {
        // Check if source and destination in diagonal
        // Check if source and destination in horizontal
        // Check if source and destination in vertical
        return true;
    }
}
