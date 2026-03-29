import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageLoader {

    public static BufferedImage getPieceImage(Piece piece) {
        String color = piece.getColor() == PieceColor.WHITE ? "white" : "black";
        String type = piece.getType().name().toLowerCase();

        String path = "Project/assets/pieces/" + color + "_" + type + ".png";

        try {
            return ImageIO.read(new File(path));
        } catch (IOException e) {
            System.err.println("Failed to load image: " + path);
            return null;
        }
    }
}
