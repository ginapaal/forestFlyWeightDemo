import java.awt.*;

public class TreeType {

    private String name;
    private Color color;
    private String otherTreeData;

    public TreeType(String name,
                    Color color,
                    String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(Graphics graphics, int xCoordinate, int yCoordinate) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(xCoordinate - 1, yCoordinate, 3, 5);
        graphics.setColor(color);
        graphics.fillOval(xCoordinate - 5, yCoordinate - 10, 10, 10);
    }
}
