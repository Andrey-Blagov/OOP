package cal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ComplexCalculatorFacade {
    private ComplexCalculator calculator;
    private Logger logger = LoggerFactory.getLogger(ComplexCalculatorFacade.class);

    public ComplexCalculatorFacade(ComplexCalculator calculator) {
        this.calculator = calculator;
    }

    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = calculator.add(num1, num2);
        logOperation("Addition", num1, num2, result);
        return result;
    }

    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = calculator.multiply(num1, num2);
        logOperation("Multiplication", num1, num2, result);
        return result;
    }

    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = calculator.divide(num1, num2);
        logOperation("Division", num1, num2, result);
        return result;
    }

    private void logOperation(String operation, ComplexNumber num1, ComplexNumber num2, ComplexNumber result) {
        logger.info("{}: {} + {} = {}", operation, num1, num2, result);
    }
}

