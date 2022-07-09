package Lessons.LaboratoryWork5_Methods;

import java.util.Scanner;

public class SubString {

    public void sub(String first, String second) {

        char[] array = first.toCharArray();
        String comp;
        int conut = 0;

        for (int a = 0; a < array.length; a++) {

            if (array[a] == second.charAt(0)) {
                comp = first.substring(a, a + second.length());

                if (comp.equals(second)) {
                    conut++;
                }
            }

            System.out.println("В введенном строке обнаружено " + conut + " вхождений");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first text");
        String first = scanner.nextLine();
        System.out.println("Enter your second text");
        String second = scanner.nextLine();

        SubString subString = new SubString();
        subString.sub(first, second);
    }
}
