package Lessons.LaboratoryWork6_Extending.Task3;

public class Truck extends Car {
    private int wheels;
    private double maxWeight;

    public Truck(double weight, String model, String color, float speed, int wheels, double maxWeight) {
        super(weight, model, color, speed);
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }

    public void newWheels(Integer newWheels) {
        System.out.println(model + " has " + wheels + " wheels but it was change on " + newWheels);
        wheels = newWheels;
    }

    public void outPut() {
        System.out.println("Weight " + model + " is " + weight + "kg");
        System.out.println("Max weight " + maxWeight + ", whells" + wheels);
        System.out.println("Color of the car is " + color
                + " and the speed is " + speed);
    }
}
