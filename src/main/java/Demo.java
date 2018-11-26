import java.awt.*;

public class Demo {

    private static final int CANVAS_SIZE = 500;
    private static final int TREES_TO_DRAW = 500000;
    private static final int TREE_TYPES = 2;

    public static void main(String[] args) {
        Forest forest = new Forest();
        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Summer Oak", Color.GREEN, "Oak texture");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Autumn Oak", Color.ORANGE, "Autumn oak texture");
        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);
        forest.setDefaultCloseOperation(1);
        forest.setTitle("FOREST");

        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES);
        System.out.println("---------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
    }

    private static int random(int i, int CANVAS_SIZE) {
        return i + (int) (Math.random() * ((CANVAS_SIZE - i) -1));
    }
}
