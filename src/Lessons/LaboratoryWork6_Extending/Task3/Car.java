package Lessons.LaboratoryWork6_Extending.Task3;

public class Car {
    public double weight;
    public String model;
    public String color;
    public float speed;

    public Car(double w, String m, String c, float s) {
        weight = w;
        model = m;
        color = c;
        speed = s;
    }

    public void outPut() {
        System.out.println("Weight " + model + " is " + weight + "kg");
        System.out.println("Color of the car is " + color
                + " and the speed is " + speed);
    }

    public Car() {
    }
}
