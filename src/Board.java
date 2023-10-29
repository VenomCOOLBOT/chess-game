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

    public void setPieces() {
        // Write code to set pieces to their correct positions
    }

    public int pieceAmount() {
        return pieces.size();
    }
}
