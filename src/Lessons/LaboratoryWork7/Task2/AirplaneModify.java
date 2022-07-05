package Lessons.LaboratoryWork7.Task2;

public class AirplaneModify {

    static class Wing1 {
        private double weightWing1;

        private void setWeightWing1() {
            this.weightWing1 = 220.358;
        }

        public void shouWeight1() {
            setWeightWing1();
            System.out.println(weightWing1 + " kg");
        }
    }

    static class Wing2 {
        private double weightWing2;

        private void setWeightWing2(double weightWing2) {
            this.weightWing2 = weightWing2;
        }

        public void shouWeight2() {
            setWeightWing2(220.348);
            System.out.println(weightWing2 + " kg");
        }
    }

    public static void main(String[] args) {
        AirplaneModify.Wing1 airWing1 = new AirplaneModify.Wing1();
        airWing1.shouWeight1();

        AirplaneModify.Wing2 airWing2 = new AirplaneModify.Wing2();
        airWing2.shouWeight2();
    }
}
