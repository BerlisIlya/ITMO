package Lessons.LaboratoryWork4.Part2;

import java.util.Arrays;

public class SotrArray {
    int[] array = {10, 252, 54, 79, 8, 420, 28, 33, 61, 3, 12};
    int num;

    public void sorting() {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int a = 0; a < array.length - 1; a++) {

                if (array[a] > array[a + 1]) {
                    isSorted = false;

                    num = array[a];
                    array[a] = array[a + 1];
                    array[a + 1] = num;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static boolean isSort(int[] array) {
        for (int a = 0; a < array.length - 1; a++) {
            if (array[a] > array[a + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SotrArray sotrArray = new SotrArray();
        sotrArray.sorting();
        System.out.println("Result of sort is: " + isSort(sotrArray.array));
    }
}
