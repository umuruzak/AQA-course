package task1;

public class Animal {
    private String name;
    private static int count = 0;

    public Animal(String name) {
        this.name = name;
        count++;
    }
    public void run(int distance){
        if(distance < 0) System.out.println("Отрицательное расстояние.");
        else System.out.println(name + " пробежал " + distance + " м.");
    }
    public void swim(int distance){
        if(distance < 0) System.out.println("Отрицательное значение.");
        else System.out.println(name + " проплыл " + distance + " м.");
    }
    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }
}
