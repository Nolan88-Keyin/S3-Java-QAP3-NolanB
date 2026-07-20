/**
 * A point that moves using x and y speed components.
 */
public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    /**
     * Creates a movable point at a position with speed variables.
     *
     * @param x starting x-coordinate
     * @param y starting y-coordinate
     * @param xSpeed movement speed along x-axis
     * @param ySpeed movement speed along y-axis
     */
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /**
     * Creates a movable point at the origin with speed variables.
     *
     * @param xSpeed movement speed along x-axis
     * @param ySpeed movement speed along y-axis
     */
    public MovablePoint(float xSpeed, float ySpeed) {
        super(0.0f, 0.0f);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /**
     * Moves this point by adding speed to its current coordinates.
     */
    public void move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
    }

    /**
     * Returns position and speed details for this movable point.
     *
     * @return formatted movable point details
     */
    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
