package Lessons.LaboratoryWork5;

import java.util.Scanner;

public class LongestWord {
    public void findWord() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your text: ");
        String text = scanner.nextLine();

        String[] word = text.split(" ");
        int length = 0;
        String longest = "";

        for (String w : word) {
            if (w.length() > length) {
                length = word.length;
                longest = w;
            }
        }
        System.out.println("The longest word in text is: " + longest.trim());
    }

    public static void main(String[] args) {
        LongestWord longer = new LongestWord();
        longer.findWord();

    }
}
