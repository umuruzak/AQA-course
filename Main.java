import task1.*;
import task2.*;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        Dog dog = new Dog("Оди");
        Cat cat = new Cat("Гарфилд");
        dog.run(200);
        dog.swim(12);
        cat.run(100);
        cat.swim(5);
        System.out.println("Всего животных " + Animal.getCount());
        System.out.println("Всего собак " + Dog.getCount());
        System.out.println("Всего котов " + Cat.getCount());
        Dish dish = new Dish(8);
        Cat[] catArr = {cat, new Cat("Снежок"), new Cat("Оранджи"), new Cat("Чеширский кот")};
        for(int i = 0; i < catArr.length; i++){
            catArr[i].eat(dish, i+1);
            System.out.println("Кот " + catArr[i].getName() + " сыт? " + catArr[i].isFull());
        }
        System.out.println("В миске осталось " + dish.getFoodAmount());

        //Задание 2
        //Если это не возбраняется, то вместо интерфейсов использовался абстрактный класс
        AbstractFigure[] figures = {new Rectangle(6, 5, "Белый", "Черный"),
                                    new Triangle(3, 4, 5, "Белый", "Фиолетовый"),
                                    new Circle(3, "Белый", "Зеленый")};
        for(AbstractFigure figure : figures){
            figure.displayInfo();
        }
    }
}