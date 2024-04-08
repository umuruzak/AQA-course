package task2;

public class Circle extends AbstractFigure{
    private double radius;
    public Circle(double radius, String innerColor, String borderColor) {
        super(innerColor, borderColor);
        this.radius = radius;
    }

    @Override
    public double findPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }
}
