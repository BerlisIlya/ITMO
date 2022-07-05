package Lessons.LaboratoryWork7.Task1;

import java.util.Scanner;

public class Airplane {

    static class Wing{
        Scanner scanner = new Scanner(System.in);

        private double weightWing1;
        private double weightWing2;

        private void setWeightWing1(double weightWing1){
            this.weightWing1 = scanner.nextDouble();
        }

        private void setWeightWing2(double weightWing2){
            this.weightWing2 = scanner.nextDouble();
        }

        public void shouWeight(){
            System.out.println("Enter weight the wing: ");
            setWeightWing1(weightWing1);

            System.out.println("Enter weight the wing: ");
            setWeightWing2(weightWing2);

            System.out.println("The weight wing is" + weightWing1 + " kg");
            System.out.println("The weight wing is" + weightWing2 + " kg");
        }
    }

    public static void main(String[] args) {
        Airplane.Wing airWing = new Airplane.Wing();
        airWing.shouWeight();
    }
}
