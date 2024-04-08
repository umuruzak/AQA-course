package task1;

public class Cat extends Animal{
    private boolean isFull = false;
    private static int count = 0;
    public Cat(String name) {
        super(name);
        count++;
    }
    @Override
    public void run(int distance) {
        if(distance > 200) System.out.println("Коту не под силу столько пробежать!");
        else super.run(distance);
    }
    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать!(");
    }
    public static int getCount() {
        return count;
    }
    public void eat(Dish dish, int foodAmount){
        isFull = dish.removeFood(foodAmount);
    }

    public boolean isFull() {
        return isFull;
    }
}
