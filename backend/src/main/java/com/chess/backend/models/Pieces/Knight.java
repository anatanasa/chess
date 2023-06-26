package com.chess.backend.models.Pieces;

import com.chess.backend.Types.PieceColor;
import com.chess.backend.models.Position;

public class Knight extends Piece {
    @Override
    public boolean isMovePossible(Position newPosition) {
        return false;
    }

    public Knight(PieceColor color) {
        this.color = color;
    }
}
