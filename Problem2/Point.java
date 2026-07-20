/**
 * Represents a 2D point using coordinates x and y.
 */
public class Point {
    private float x;
    private float y;

    /**
     * Creates a point at the given x and y coordinates.
     *
     * @param x x-coordinate
     * @param y y-coordinate
     */
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns the point as a string.
     *
     * @return formatted coordinate pair
     */
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
