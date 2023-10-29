public class Chess {
    private final Board board;

    public Chess() {
        // Game initializations

        board = new Board();
        board.initializeBoard();
        board.setPieces();

        runEventLoop();
    }

    public void runEventLoop() {
        // Game logic code

    }

    public static void main(String[] args) {
        Chess chess = new Chess();
    }

}
