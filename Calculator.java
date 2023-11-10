package Calculator;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return (double) a / b;
    }
    public double calculateDiscount(int price, int discount) {
        double resultPrice;
        if (price > 0) {
            if (discount >= 0 && discount>=0 && discount<= 50) {
                resultPrice = (price * (100-discount)) / 100;
            } else {
                throw new ArithmeticException("Скидка должна быть от 0 до 50%");
            }
        } else {
            throw new ArithmeticException("Сумма покупки некорректна");
        }
        return resultPrice;
    }
}
