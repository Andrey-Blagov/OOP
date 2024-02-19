package patterns.structural.wrappers.decorator.task.util;

/**
 Valid Mathematical Operations.
 */
public enum Operators {
    PLUS("+"), MINUS("-"), MULTI("*"), DIVIDE("/");

    private final String operator;

    Operators(String operator) {
        this.operator = operator;
    }

    public String operator() {
        return operator;
    }
}
