package task2;

public interface Shape {
    double getArea();
    String getFillColor();
    String getBorderColor();
    double[] getSides();

    default double getPerimeter() {
        double perimeter = 0;
        for (double side : getSides()) {
            perimeter += side;
        }
        return perimeter;
    }

    default void printInfo() {
        System.out.printf("Фигура: %-12s | Периметр: %-6.2f | Площадь: %-6.2f | Цвет фона: %-7s | Цвет границ: %s%n",
                this.getClass().getSimpleName(), getPerimeter(), getArea(), getFillColor(), getBorderColor());
    }
}
