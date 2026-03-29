public class Board {

    private Piece[][] grid = new Piece[8][8];

    public Piece getPiece(int row, int col) {
        return grid[row][col];
    }

    public void setPiece(int row, int col, Piece piece) {
        grid[row][col] = piece;
    }

    public static Board createStartingPosition() {
    Board board = new Board();

    // Pawns
    for (int col = 0; col < 8; col++) {
        board.setPiece(1, col, new Piece(PieceType.PAWN, PieceColor.BLACK));
        board.setPiece(6, col, new Piece(PieceType.PAWN, PieceColor.WHITE));
    }

    // Rooks
    board.setPiece(0, 0, new Piece(PieceType.ROOK, PieceColor.BLACK));
    board.setPiece(0, 7, new Piece(PieceType.ROOK, PieceColor.BLACK));
    board.setPiece(7, 0, new Piece(PieceType.ROOK, PieceColor.WHITE));
    board.setPiece(7, 7, new Piece(PieceType.ROOK, PieceColor.WHITE));

    // Knights
    board.setPiece(0, 1, new Piece(PieceType.KNIGHT, PieceColor.BLACK));
    board.setPiece(0, 6, new Piece(PieceType.KNIGHT, PieceColor.BLACK));
    board.setPiece(7, 1, new Piece(PieceType.KNIGHT, PieceColor.WHITE));
    board.setPiece(7, 6, new Piece(PieceType.KNIGHT, PieceColor.WHITE));

    // Bishops
    board.setPiece(0, 2, new Piece(PieceType.BISHOP, PieceColor.BLACK));
    board.setPiece(0, 5, new Piece(PieceType.BISHOP, PieceColor.BLACK));
    board.setPiece(7, 2, new Piece(PieceType.BISHOP, PieceColor.WHITE));
    board.setPiece(7, 5, new Piece(PieceType.BISHOP, PieceColor.WHITE));

    // Queens
    board.setPiece(0, 3, new Piece(PieceType.QUEEN, PieceColor.BLACK));
    board.setPiece(7, 3, new Piece(PieceType.QUEEN, PieceColor.WHITE));

    // Kings
    board.setPiece(0, 4, new Piece(PieceType.KING, PieceColor.BLACK));
    board.setPiece(7, 4, new Piece(PieceType.KING, PieceColor.WHITE));

    return board;
}
}