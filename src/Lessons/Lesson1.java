package Lessons;

import java.util.Scanner;

public class Lesson1 {

    public void number1() {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");
    }

    public void number2() {
        double a = 46;
        double b = 10;
        double c = 3;
        double d = 29;
        double e = 4;
        double f = -15;
        double result1 = (a + b) * (b / c);
        double result2 = d * e * f;

        System.out.println(result1);
        System.out.println(result2);
    }

    public void number3() {
        int number = 10500;
        double result = (double) number / 10 / 10;

        System.out.println(result);
    }

    public void number4() {
        double a = 3.6;
        double b = 4.1;
        double c = 5.9;
        double result = a * b * c;

        System.out.println("Задание 4:\n" + result);
    }

    public void number5() {
        Scanner input = new Scanner(System.in);

        System.out.println("First number: ");
        int a = input.nextInt();
        System.out.println("Second number: ");
        int b = input.nextInt();
        System.out.println("Third number: ");
        int c = input.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public void number6() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number:");
        int b = input.nextInt();

        if (b % 2 != 0) {
            System.out.println("Число нечетное!");
        } else if (b > 100) {
            System.out.println("Выход за пределы диапозона!");
        } else {
            System.out.println("Число четное!");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Lesson1 les = new Lesson1();
        les.number1();
        les.number2();
        les.number3();
        les.number4();
        les.number5();
        les.number6();
    }
}
