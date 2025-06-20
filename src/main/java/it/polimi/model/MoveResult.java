package it.polimi.model;

public class MoveResult {
    private final MoveType moveType;
    private final Piece piece;

    public MoveType getMoveType() {
        return moveType;
    }

    public Piece getPiece() {
        return piece;
    }

    public MoveResult(MoveType moveType) {
        this(moveType, null);
    }

    public MoveResult(MoveType moveType, Piece piece) {
        this.moveType = moveType;
        this.piece = piece;
        }
    }
