package Lessons;

public class Calculator {

    public static double sum(double a, double b) {
        return a + b;
    }

    public static long sum(long a, long b) {
        return a + b;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double increase(double a, double b) {
        return a * b;
    }

    public static long increase(long a, long b) {
        return a * b;
    }

    public static int increase(int a, int b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static double division(long a, long b) {
        return (double) a / b;
    }

    public static double division(int a, int b) {
        return (double) a / b;
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static long minus(long a, long b) {
        return a - b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println(division(5.1, 2.1));
        System.out.println(division(500000000L, 200000000L));
        System.out.println(division(9, 3));
    }
}
