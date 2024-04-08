package task2;

public class Triangle extends AbstractFigure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c, String innerColor, String borderColor) {
        super(innerColor, borderColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double findPerimeter() {
        return a + b + c;
    }

    @Override
    public double findArea() {
        double halfPerimeter = findPerimeter()/2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }
}
