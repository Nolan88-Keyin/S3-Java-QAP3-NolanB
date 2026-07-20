/**
 * Demo of Point and MovablePoint classes.
 */
public class Demo {
    /**
     * Creates sample points and shows movement updates.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Point and MovablePoint Demo ===\n");

        System.out.println("Static Points:");
        Point coord_1 = new Point(3.7f, 4.2f);
        System.out.println("Point 1: " + coord_1);
        Point coord_2 = new Point(5.3f, 6.8f);
        System.out.println("Point 2: " + coord_2);

        System.out.println("\nMovablePoint with Default Speed:");
        MovablePoint movableCoord = new MovablePoint(1.5f, 2.5f);
        System.out.println("Initial: " + movableCoord);
        movableCoord.move();
        System.out.println("After move: " + movableCoord);

        System.out.println("\nMovablePoint with Updated Speed:");
        movableCoord.setSpeed(0.5f, 1.0f);
        movableCoord.move();
        System.out.println("After move: " + movableCoord);
    }
}
        

