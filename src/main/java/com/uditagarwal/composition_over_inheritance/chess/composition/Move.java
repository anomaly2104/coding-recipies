package com.uditagarwal.composition_over_inheritance.chess.composition;

import com.uditagarwal.composition_over_inheritance.chess.Cell;

public interface Move {
    boolean canMove(Cell source, Cell destination);
}
