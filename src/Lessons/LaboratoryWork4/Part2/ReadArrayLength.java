package Lessons.LaboratoryWork4.Part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadArrayLength {

    public void readSizeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter size your array: ");
        int size = Integer.parseInt(reader.readLine());
        int[] array = new int[size];
        int number;

        for (number = 0; number < size; number++) {
            System.out.print("Enter number your array: ");
            array[number] = Integer.parseInt(reader.readLine());
        }

        System.out.print("Array's elements: ");
        for (number = 0; number < size; number++) {
            System.out.print(" " + array[number]);
        }

    }

    public static void main(String[] args) throws IOException {
        ReadArrayLength readArray = new ReadArrayLength();
        readArray.readSizeArray();
    }
}
