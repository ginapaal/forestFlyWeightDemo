import java.awt.*;

public class Tree {

    private int xCoordinate;
    private int yCoordinate;
    private TreeType treeType;

    public Tree (int xCoordinate, int yCoordinate, TreeType treeType) {

        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.treeType = treeType;
    }

    public void draw(Graphics graphics) {
        treeType.draw(graphics, xCoordinate, yCoordinate);
    }
}
