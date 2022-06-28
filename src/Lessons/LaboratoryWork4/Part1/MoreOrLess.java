package Lessons.LaboratoryWork4.Part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoreOrLess {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your first number: ");
        int number1 = Integer.parseInt(reader.readLine());
        System.out.println("Enter your second number: ");
        int number2 = Integer.parseInt(reader.readLine());
        System.out.println("Enter your third number: ");
        int number3 = Integer.parseInt(reader.readLine());


        System.out.println("Number one is: " + number1);
        System.out.println("Number two is: " + number2);
        System.out.println("Number three is: " + number3);

        if (number1 < number2 && number2 < number3) {
            System.out.println("Your result is: " + true);
        } else {
            System.out.println("Your result is: " + false);
        }
    }
}
