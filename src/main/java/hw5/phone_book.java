package hw5;

/*Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
Учесть, что под одной фамилией может находиться несколько телефонных номеров.*/

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class phone_book {
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addInPhoneBook();
        findInPhoneBook("Комаров");
    }

    public static void addInPhoneBook() {
        phoneBook.put("Волков", List.of("+7(905)123-45-67", "+7(916)123-56-78"));
        phoneBook.put("Комаров", List.of("+7(903)123-67-89", "+7(950)123-78-89"));
        phoneBook.put("Котов", List.of("+7(910)234-67-89", "+7(953)345-67-89"));
        phoneBook.put("Соловьев", List.of("+7(920)456-78-90", "+7(495)999-07-02"));
        phoneBook.put("Суслов", List.of("+7(965)555-56-92", "+7(495)555-55-21"));
    }

    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}

