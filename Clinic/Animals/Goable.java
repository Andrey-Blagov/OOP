package Clinic.Animals;

@FunctionalInterface
public interface Goable {
    /**
     * public static final
     * constanta creation
     */
    double pi = 3.14;

    /**
     * public abstract method
     * required methods for
     */
    double run();

    default void defaultWalk(double speed) {
        System.out.println("Object moving with " + speed);
    }
}