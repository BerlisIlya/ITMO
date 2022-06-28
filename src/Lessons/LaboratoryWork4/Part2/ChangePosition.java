package Lessons.LaboratoryWork4.Part2;

public class ChangePosition {
    int[] array = {2, 15, 66, 9, 81, 37};
    int number;

    public void changePosition() {

        System.out.print("Array before change: ");

        for (number = 0; number < array.length; number++) {
            System.out.print(array[number] + " ");
        }

        number = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = number;

        System.out.println();
        System.out.print("Array after change: ");

        for (number = 0; number < array.length; number++) {
            System.out.print(array[number] + " ");
        }
    }

    public static void main(String[] args) {
        ChangePosition change = new ChangePosition();
        change.changePosition();
    }
}
