package com.chess.backend.models;

import com.chess.backend.Types.PieceColor;
import com.chess.backend.models.Pieces.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@Slf4j
public class GameBoard {

    private static final GameBoard INSTANCE = new GameBoard();
    private HashMap<Position, Piece> board;

    private GameBoard() {
        board = new HashMap<>();
    }

    public static GameBoard getInstance() {
        return INSTANCE;
    }

    public Piece getPieceAtPosition(Position position){
       return board.get(position);
    }
    public void setPieceAtPosition(Position position, Piece piece){
        board.put(position, piece);
    }

    public void removePieceAtPosition(Position position){
        board.remove(position);
    }

    public void startGame(){
        populateBoard();
        log.info("Game started successfully");
    }

    private void populateBoard(){
        // Generate white pieces
        board.put(new Position(1,1),new Rook(PieceColor.WHITE));
        board.put(new Position(2,1),new Knight(PieceColor.WHITE));
        board.put(new Position(3,1),new Bishop(PieceColor.WHITE));
        board.put(new Position(4,1),new Queen(PieceColor.WHITE));
        board.put(new Position(5,1),new King(PieceColor.WHITE));
        board.put(new Position(6,1),new Bishop(PieceColor.WHITE));
        board.put(new Position(7,1),new Knight(PieceColor.WHITE));
        board.put(new Position(8,1),new Rook(PieceColor.WHITE));

        // Generate white pawns
        for (int i=1; i<=8; i++){
            board.put(new Position(i,2),new Pawn(PieceColor.WHITE));
        }

        // Generate black pieces
        board.put(new Position(1,8),new Rook(PieceColor.WHITE));
        board.put(new Position(2,8),new Knight(PieceColor.WHITE));
        board.put(new Position(3,8),new Bishop(PieceColor.WHITE));
        board.put(new Position(4,8),new Queen(PieceColor.WHITE));
        board.put(new Position(5,8),new King(PieceColor.WHITE));
        board.put(new Position(6,8),new Bishop(PieceColor.WHITE));
        board.put(new Position(7,8),new Knight(PieceColor.WHITE));
        board.put(new Position(8,8),new Rook(PieceColor.WHITE));

        // Generate black pawns
        for (int i=1; i<=8; i++){
            board.put(new Position(i,7),new Pawn(PieceColor.WHITE));
        }
    }
}
