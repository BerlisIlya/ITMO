package Lessons.LaboratoryWork5_Methods;

import java.util.Scanner;

public class Palindrome {
    public void reverse(String word, StringBuilder builder) {

        if (word.equalsIgnoreCase(builder.toString())) {
            System.out.println("This word is a palindrome");
        } else {
            System.out.println("This word is not palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your word: ");

        String word = scanner.nextLine();
        StringBuilder builder = new StringBuilder(word);
        builder.reverse();

        System.out.println(builder);
        System.out.println();

        Palindrome palindrome = new Palindrome();
        palindrome.reverse(word, builder);
    }
}
