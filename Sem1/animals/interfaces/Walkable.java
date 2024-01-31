package interfaces;

@FunctionalInterface
public interface Walkable {
    /**
     * public static final
     * constanta creation
     */
    double pi = 3.14;

    /**
     * public abstract method
     * required methods for
     */
    double walk();

    default void defaultWalk(double speed) {
        System.out.println("Object moving with " + speed);
    }
}