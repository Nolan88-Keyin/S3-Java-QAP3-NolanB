/**
 * Abstract base type for shapes with area and perimeter.
 */
public abstract class Shape {
    private final String name;

    /**
     * Creates a shape with a display name.
     *
     * @param name shape name
     */
    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Computes the perimeter of this shape.
     *
     * @return perimeter of the shape
     */
    public abstract double getPerimeter();

    /**
     * Computes the area of this shape.
     *
     * @return area of the shape
     */
    public abstract double getArea();

    /**
     * Returns name, area, and perimeter in one formatted line.
     *
     * @return formatted shape summary
     */
    @Override
    public String toString() {
        return String.format(
            "%s: area = %.2f, perimeter = %.2f",
            name,
            getArea(),
            getPerimeter()
        );
    }
}

