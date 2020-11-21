package com.uditagarwal.composition_over_inheritance.chess.composition;

import com.uditagarwal.composition_over_inheritance.chess.Cell;

import java.util.List;

public class Piece {
    List<Move> allowedMoves;

    public Piece(List<Move> allowedMoves) {
        this.allowedMoves = allowedMoves;
    }

    boolean canMove(Cell source, Cell destination) {
        for (Move allowedMove: allowedMoves) {
            if (allowedMove.canMove(source, destination)) {
                return true;
            }
        }

        return false;
    }
}
