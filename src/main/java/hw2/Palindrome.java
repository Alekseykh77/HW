package hw2;

public class Palindrome {
    public static boolean isPalindrome(String text) {
        String replaced = text.toLowerCase().replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        String reversed = new StringBuffer(replaced).reverse().toString();
        return reversed.equals(replaced);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Лев осовел"));
    }
}