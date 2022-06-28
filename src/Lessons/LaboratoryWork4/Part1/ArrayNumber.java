package Lessons.LaboratoryWork4.Part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayNumber {
    static Integer[] array = new Integer[7];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int a = 0; a < 7; a++) {
            System.out.println("Number " + (a + 1) + ": ");
            array[a] = Integer.parseInt(reader.readLine());
        }

        if (array[0] == 3 || array[array.length - 1] == 3) {
            System.out.println("Your answer is: " + true);
        } else {
            System.out.println("You're wrong");
        }
    }
}
