package day17;

public class ChessBoard {

    private final ChessPiece[][] boardScheme;
    public ChessBoard(ChessPiece[][] boardScheme) {
        this.boardScheme = boardScheme;
    }

    public void print() {
        for(int i = 0; i<8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(boardScheme[i][j].getSymbol());
            }
            System.out.println();
        }
    }
}
