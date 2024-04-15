import task2.PhoneBook;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        String[] array = new String[12];
        for(int i = 0; i < 12; i++){
            array[i] = i % 4 + "";
        }
        List<String> list = Arrays.asList(array);
        System.out.println("Массив слов: " + Arrays.toString(array));
        Set<String> set = new HashSet<>(list);
        System.out.println("Уникальные слова: " + set);
        for(String word : set){
            System.out.println(word + ": " + Collections.frequency(list, word));
        }

        //Задание 2
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Гамма", "+12345678");
        phoneBook.add("Гамма", "+11111111");
        phoneBook.add("Влиссидес", "+23232323");
        phoneBook.add("Хелм", "+12341234");
        phoneBook.add("Хелм", "+12345123");
        System.out.println("\nГамма: " + phoneBook.get("Гамма") + "\nВлиссидес: " + phoneBook.get("Влиссидес") + "\nХелм: " + phoneBook.get("Хелм"));
    }

}