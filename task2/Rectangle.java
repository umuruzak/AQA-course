package task2;

public class Rectangle extends AbstractFigure{
    private double a;
    private double b;

    public Rectangle(double a, double b, String innerColor, String borderColor) {
        super(innerColor, borderColor);
        this.a = a;
        this.b = b;
    }

    @Override
    public double findPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public double findArea() {
        return a * b;
    }
}
