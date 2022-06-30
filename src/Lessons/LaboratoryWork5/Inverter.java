package Lessons.LaboratoryWork5;

import java.util.Scanner;

public class Inverter {
    public static void invert(String text, StringBuilder builder1, StringBuilder builder2) {

        for (String word : text.split(" ")) {
            builder1.setLength(0);
            builder2.append(" ").append(builder1.append(word).reverse());
        }
        System.out.println(builder2.replace(0, 1, ""));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();

        System.out.println("Enter your text");
        String text = scanner.nextLine();

        invert(text, builder1, builder2);
    }
}
