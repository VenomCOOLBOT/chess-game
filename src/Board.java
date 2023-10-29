import java.util.ArrayList;
import java.util.List;

public class Board {
    List<Piece> pieces;

    Board() {
        pieces = new ArrayList<Piece>();
    }

    public void initializeBoard() {
        int[] pieceCounts = {1, 1, 2, 2, 2, 8};
        String[] names = {"King", "Queen", "Bishop", "Knight", "Rook", "Pawn"};
        String[] colors = {"Black", "White"};

        for (String color : colors) {
            for (int i = 0; i < names.length; i++) {
                for (int j = 0; j < pieceCounts[i]; j++) {
                    Piece piece = new Piece(color, names[i]);
                    pieces.add(piece);
                }
            }
        }
    }

    public Piece getPiece(int index) {
        return pieces.get(index);
    }

    public void setPieces() {

        // Initialize and place the white pieces
        pieces.get(0).setX(3);
        pieces.get(0).setY(0);
        pieces.get(1).setX(4);
        pieces.get(1).setY(0);
        pieces.get(2).setX(2);
        pieces.get(2).setY(0);
        pieces.get(3).setX(1);
        pieces.get(3).setY(0);
        pieces.get(4).setX(0);
        pieces.get(4).setY(0);
        pieces.get(5).setX(5);
        pieces.get(5).setY(0);
        pieces.get(6).setX(6);
        pieces.get(6).setY(0);
        pieces.get(7).setX(7);
        pieces.get(7).setY(0);
        pieces.get(8).setX(3);
        pieces.get(8).setY(1);
        pieces.get(9).setX(4);
        pieces.get(9).setY(1);
        pieces.get(10).setX(2);
        pieces.get(10).setY(1);
        pieces.get(11).setX(1);
        pieces.get(11).setY(1);
        pieces.get(12).setX(0);
        pieces.get(12).setY(1);
        pieces.get(13).setX(5);
        pieces.get(13).setY(1);
        pieces.get(14).setX(6);
        pieces.get(14).setY(1);
        pieces.get(15).setX(7);
        pieces.get(15).setY(1);

        // Initialize and place the black pieces
        pieces.get(16).setX(3);
        pieces.get(16).setY(7);
        pieces.get(17).setX(4);
        pieces.get(17).setY(7);
        pieces.get(18).setX(2);
        pieces.get(18).setY(7);
        pieces.get(19).setX(1);
        pieces.get(19).setY(7);
        pieces.get(20).setX(0);
        pieces.get(20).setY(7);
        pieces.get(21).setX(5);
        pieces.get(21).setY(7);
        pieces.get(22).setX(6);
        pieces.get(22).setY(7);
        pieces.get(23).setX(7);
        pieces.get(23).setY(7);
        pieces.get(24).setX(3);
        pieces.get(24).setY(6);
        pieces.get(25).setX(4);
        pieces.get(25).setY(6);
        pieces.get(26).setX(2);
        pieces.get(26).setY(6);
        pieces.get(27).setX(1);
        pieces.get(27).setY(6);
        pieces.get(28).setX(0);
        pieces.get(28).setY(6);
        pieces.get(29).setX(5);
        pieces.get(29).setY(6);
        pieces.get(30).setX(6);
        pieces.get(30).setY(6);
        pieces.get(31).setX(7);
        pieces.get(31).setY(6);

        printBoard();
    }

    private void printBoard() {
        // Write code to print board
    }

    public int pieceAmount() {
        return pieces.size();
    }

}
