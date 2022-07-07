package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] cp = {ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK};

        for (ChessPiece s : cp) {
            System.out.print(s.getSymbol() + " ");
        }

    }
}