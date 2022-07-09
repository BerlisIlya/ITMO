package Lessons.LaboratoryWork6_Extending.Task3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1.8, "Toyota", "Black", 240f);
        car.outPut();
        Truck truck = new Truck(5.2, "Volvo", "Grey", 220f, 6, 12.0);
        truck.outPut();
        System.out.println();
        truck.newWheels(8);
        truck.outPut();
    }
}
