/**
 * Equilateral triangle where all three sides are equal.
 */
public class EquilateralTriangle extends Triangle {
    private double sideLength;

    /**
     * Creates an equilateral triangle with one side length.
     *
     * @param sideLength length of each side
     */
    public EquilateralTriangle(double sideLength) {
        super("EquilateralTriangle", sideLength, sideLength, sideLength);
        this.sideLength = sideLength;
    }

    /**
     * Computes perimeter as three times the side length.
     *
     * @return perimeter of the equilateral triangle
     */
    @Override
    public double getPerimeter() {
        return 3 * sideLength;
    }

    /**
     * Computes the area using sqrt(3)/4 * side^2.
     *
     * @return area of the equilateral triangle
     */
    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * sideLength * sideLength;
    }

    /**
     * Scales the side length by the provided factor.
     *
     * @param factor multiplicative scale factor
     */
    @Override
    public void scale(double factor) {
        sideLength *= factor;
        super.scale(factor);
    }
}
