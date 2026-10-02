package lesson7;

public class MathOperations {

    public long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Число должно быть неотрицательным");
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public double triangleArea(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Стороны должны быть больше нуля");
        }
        return 0.5 * base * height;
    }

    public int sum(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Деление на ноль невозможно");
        return (double) a / b;
    }

    public int compare(int a, int b) {
        return Integer.compare(a, b);
    }
}
