package Calculator;

public class Main {
    public static void main(String[] args) {
        ComplexCalculator calculator = new SimpleComplexCalculator();
        ComplexCalculatorFacade calculatorFacade = new ComplexCalculatorFacade(calculator);

        ComplexNumber num1 = new SimpleComplexNumber(2, 3);
        ComplexNumber num2 = new SimpleComplexNumber(1, 2);

        calculatorFacade.add(num1, num2);
        calculatorFacade.multiply(num1, num2);
        calculatorFacade.divide(num1, num2);
    }
}
