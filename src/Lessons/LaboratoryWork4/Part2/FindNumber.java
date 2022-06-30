package Lessons.LaboratoryWork4.Part2;

public class FindNumber {
    public void uniqueNumber(int[] array, int number) {
        int numberUnique = 0;
        int count = 0;

        for (int a = 0; a < array.length; a++) {

            if (array[a] == number) {
                count = a;
                numberUnique = array[a];
                break;
            }
        }

        if (numberUnique == number) {
            System.out.println("Unique number: " + numberUnique);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 4};
        int number = 2;

        FindNumber find = new FindNumber();
        find.uniqueNumber(array, number);
    }
}
