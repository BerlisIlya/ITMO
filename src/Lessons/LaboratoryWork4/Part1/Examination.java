package Lessons.LaboratoryWork4.Part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Examination {
    static Integer[] array = new Integer[5];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int a = 0; a < 5; a++) {
            System.out.println("Number " + (a + 1) + ": ");
            array[a] = Integer.parseInt(reader.readLine());

            if (array[a] == 1 || array[a] == 3) {
                System.out.println("Your answer is: " + true);
            } else {
                System.out.println("You're wrong");
            }
        }
    }
}
