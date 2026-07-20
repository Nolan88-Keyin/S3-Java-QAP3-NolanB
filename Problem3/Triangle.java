/**
 * Triangle shape defined by three side lengths.
 */
public class Triangle extends Shape {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    /**
     * Creates a triangle with the default shape name.
     *
     * @param sideA length of side A
     * @param sideB length of side B
     * @param sideC length of side C
     */
    public Triangle(double sideA, double sideB, double sideC) {
        this("Triangle", sideA, sideB, sideC);
    }

    /**
     * Creates a triangle with a custom name after validation.
     *
     * @param name display name for the shape
     * @param sideA length of side A
     * @param sideB length of side B
     * @param sideC length of side C
     */
    protected Triangle(String name, double sideA, double sideB, double sideC) {
        super(name);

        if (!isValidTriangle(sideA, sideB, sideC)) {
            System.err.println("Error: the provided sides do not form a valid triangle.");
            System.exit(1);
        }

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    private static boolean isValidTriangle(double sideA, double sideB, double sideC) {
        return sideA > 0 && sideB > 0 && sideC > 0
            && sideA + sideB > sideC
            && sideB + sideC > sideA
            && sideC + sideA > sideB;
    }

    /**
     * Computes perimeter by summing side lengths.
     *
     * @return perimeter of the triangle
     */
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    /**
     * Computes area using Heron's formula.
     *
     * @return area of the triangle
     */
    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}