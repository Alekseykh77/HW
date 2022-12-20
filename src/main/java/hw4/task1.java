package hw4;

import java.util.LinkedList;

/*Пусть дан LinkedList с несколькими элементами.
Реализуйте метод, который вернет “перевернутый” список.*/

public class task1 {

    public static void main(String[] args) {

        int[] listMas = {7, 6, 5, 6, 4, 3, 2, 1, 0};
        LinkedList<Integer> linkList = new LinkedList<>();

        for (Integer temp : listMas) {
            linkList.add(temp);
        }

        int temp = 0;
        while (temp != linkList.size() - 1) {
            linkList.add(linkList.size() - temp, linkList.getFirst());
            linkList.removeFirst();
            temp++;
        }


        System.out.println("linkList = " + linkList);


    }
}