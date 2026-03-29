import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ChessBoardPanel extends JPanel {

    private static final int TILE_SIZE = 80;
    private Board board;

    public ChessBoardPanel() {
        board = Board.createStartingPosition();
        setPreferredSize(new Dimension(8 * TILE_SIZE, 8 * TILE_SIZE));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        drawBoard(g);
        drawPieces(g);
    }

    private void drawBoard(Graphics g) {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                boolean isLight = (row + col) % 2 == 0;
                g.setColor(isLight ? Theme.LIGHT : Theme.DARK);
                g.fillRect(col * TILE_SIZE, row * TILE_SIZE, TILE_SIZE, TILE_SIZE);
            }
        }
    }

    private void drawPieces(Graphics g) {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Piece piece = board.getPiece(row, col);
                if (piece != null) {
                    BufferedImage img = ImageLoader.getPieceImage(piece);
                    g.drawImage(
                            img,
                            col * TILE_SIZE,
                            row * TILE_SIZE,
                            TILE_SIZE,
                            TILE_SIZE,
                            null
                    );
                }
            }
        }
    }
}