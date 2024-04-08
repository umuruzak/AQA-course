package task1;

public class Dog extends Animal{
    private static int count = 0;
    public Dog(String name) {
        super(name);
        count++;
    }
    @Override
    public void run(int distance) {
        if(distance > 500) System.out.println("Собаке не под силу столько пробежать!");
        else super.run(distance);
    }
    @Override
    public void swim(int distance) {
        if(distance > 10) System.out.println("Собаке не под силу столько проплыть!");
        else super.swim(distance);
    }

    public static int getCount() {
        return count;
    }
}
