/**
 * Circle shape defined by a radius.
 */
public class Circle extends Shape {
    private double radius;

    /**
     * Creates a circle with the given radius.
     *
     * @param radius circle radius
     */
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    /**
     * Computes the perimeter using 2pi*r.
     *
     * @return perimeter of the circle
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Computes the area using pi*r^2.
     *
     * @return area of the circle
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Scales the radius by the provided factor.
     *
     * @param factor multiplicative scale factor
     */
    @Override
    public void scale(double factor) {
        radius *= factor;
    }
}
