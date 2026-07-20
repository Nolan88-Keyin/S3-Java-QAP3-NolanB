/**
 * Demo of shape scaling through the Scalable interface.
 */
public class Demo {
    /**
     * Creates shapes, prints them, scales them, and prints again with the scaling factor applied.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Shape[] shapes = {
            new Ellipse(8.0, 5.0),
            new Circle(5.0),
            new Triangle(3.0, 4.0, 5.0),
            new EquilateralTriangle(4.0)
        };

        System.out.println("Before scaling:");
        printShapes(shapes);

        scaleAll(shapes, 2.0);

        System.out.println();
        System.out.println("After scaling:");
        printShapes(shapes);
    }

    /**
     * Applies one scaling factor to all scalable objects in the array.
     *
     * @param shapes array of scalable objects
     * @param factor multiplicative scale factor
     */
    public static void scaleAll(Scalable[] shapes, double factor) {
        for (Scalable shape : shapes) {
            shape.scale(factor);
        }
    }

    private static void printShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
