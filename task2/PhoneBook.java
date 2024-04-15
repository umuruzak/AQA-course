package task2;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phone){
        if(phoneBook.containsKey(lastName)){
            phoneBook.get(lastName).add(phone);
        }
        else {
            ArrayList<String> tempList = new ArrayList<>();
            tempList.add(phone);
            phoneBook.put(lastName, tempList);
        }
    }

    public ArrayList<String> get(String lastName){
        return phoneBook.get(lastName);
    }
}
