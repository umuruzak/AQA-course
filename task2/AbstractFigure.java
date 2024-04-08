package task2;
import java.util.Locale;

public abstract class AbstractFigure {
    private String innerColor;
    private String borderColor;

    public AbstractFigure(String innerColor, String borderColor) {
        this.innerColor = innerColor;
        this.borderColor = borderColor;
    }
    public abstract double findPerimeter();
    public abstract double findArea();
    public void displayInfo(){
        System.out.printf(Locale.US,"[ %.2f, %.2f, %s, %s ]\n", findPerimeter(), findArea(), innerColor, borderColor);
    }
}
