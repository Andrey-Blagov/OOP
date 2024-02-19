package patterns.structural.wrappers.decorator.task;

/**
 Abstraction describing the behavior of computing objects.
 */
public interface Calculable {
    void sum(double a, double b);
    void multiply(double a, double b);
    void divide(double a, double b);
    void subtraction(double a, double b);
    double result();
    void clear();
}
