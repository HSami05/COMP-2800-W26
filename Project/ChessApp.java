import javax.swing.*;

public class ChessApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Chess Puzzle Trainer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(640, 640);

            ChessBoardPanel boardPanel = new ChessBoardPanel();
            frame.add(boardPanel);

            frame.setVisible(true);
        });
    }
}