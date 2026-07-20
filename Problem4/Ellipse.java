/**
 * Ellipse defined by semi-major and semi-minor axes.
 */
public class Ellipse extends Shape {
    private double semiMajorAxis;
    private double semiMinorAxis;

    /**
     * Creates an ellipse and stores the larger axis as semi-major.
     *
     * @param axis1 first axis value
     * @param axis2 second axis value
     */
    public Ellipse(double axis1, double axis2) {
        super("Ellipse");

        if (axis1 >= axis2) {
            this.semiMajorAxis = axis1;
            this.semiMinorAxis = axis2;
        } else {
            this.semiMajorAxis = axis2;
            this.semiMinorAxis = axis1;
        }
    }

    /**
     * Computes perimeter using Ramanujan's approximation.
     *
     * @return perimeter of the ellipse
     */
    @Override
    public double getPerimeter() {
        return Math.PI * (
            3 * (semiMajorAxis + semiMinorAxis)
            - Math.sqrt((3 * semiMajorAxis + semiMinorAxis) * (semiMajorAxis + 3 * semiMinorAxis))
        );
    }

    /**
     * Computes area using pi, a, and b.
     *
     * @return area of the ellipse
     */
    @Override
    public double getArea() {
        return Math.PI * semiMajorAxis * semiMinorAxis;
    }

    /**
     * Scales both axes by the provided factor.
     *
     * @param factor multiplicative scale factor
     */
    @Override
    public void scale(double factor) {
        semiMajorAxis *= factor;
        semiMinorAxis *= factor;
    }
}
