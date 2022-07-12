package Lessons.LaboratoryWork9_Collections.ArrayListAndLinkedList;

import java.util.*;

public class Collection {
    public static List<Integer> array = new ArrayList();
    public static List<Integer> linked = new LinkedList<>();

    public static void addInArray() {
        for (int a = 0; a < 1000000; a++) {
            array.add(1000000);
        }
        System.out.println("Size array will be: " + array.size());
    }

    public static void addInLinked() {
        linked.addAll(array);
        System.out.println("Size array will be: " + linked.size());
    }

    public static void leadTimeArray() {
        for (int a = 1; a < 1000000; a++) {
            int number = new Random().nextInt(1000);
            array.get(number);
        }
    }

    public static void leadTimeLinked() {
        for (int b = 1; b < 1000000; b++) {
            int number = new Random().nextInt(1000);
            linked.get(number);
        }
    }

    public static void main(String[] args) {
        addInArray();
        double until = System.currentTimeMillis();
        leadTimeArray();
        double next = System.currentTimeMillis();

        System.out.println("Lead time Array is: " + (next - until));
        System.out.println("");

        addInLinked();
        double before = System.currentTimeMillis();
        leadTimeLinked();
        double after = System.currentTimeMillis();

        System.out.println("Lead time Linked is: " + (after - before));
    }
}
