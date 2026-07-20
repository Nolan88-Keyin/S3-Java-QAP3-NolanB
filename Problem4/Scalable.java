/**
 * Interface for objects that can scale by a numeric factor.
 */
public interface Scalable {
    /**
     * Scales object dimensions by the provided factor.
     *
     * @param factor multiplicative scale factor
     */
    void scale(double factor);
}