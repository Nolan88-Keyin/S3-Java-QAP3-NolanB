/**
 * Demo of multiple different shapes area and perimeter output.
 */
public class Demo {
    /**
     * Creates multiple shapes and prints each through Shape references.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Shape Polymorphism Demo ===\n");

        Shape[] shapes = {
            new Ellipse(8.0, 5.0),
            new Circle(5.0),
            new Triangle(3.0, 4.0, 5.0),
            new EquilateralTriangle(4.0)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
