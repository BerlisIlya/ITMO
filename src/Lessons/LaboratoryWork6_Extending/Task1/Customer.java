package Lessons.LaboratoryWork6_Extending.Task1;

import java.util.Scanner;

public class Customer extends Human {

    Scanner scanner = new Scanner(System.in);
    private String bank;

    public Customer(String firstName, String lastName, String bank) {
        super(firstName, lastName);
        this.bank = bank;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bank='" + bank + '\'' +
                '}';
    }

    @Override
    public void information() {
        System.out.println(this);
    }

}
