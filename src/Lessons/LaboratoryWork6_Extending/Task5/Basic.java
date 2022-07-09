package Lessons.LaboratoryWork6_Extending.Task5;

import java.util.Scanner;

public class Basic {
    Scanner scanner = new Scanner(System.in);
    private Integer age = scanner.nextInt();

    public void setAge(Integer age) {
        this.age = age;
    }

    public void userInformation() {
        System.out.println("Enter user age");
        setAge(age);
    }

    public String toString(Integer age) {
        return "Basic:" +
                " age = '" + age + '\'' +
                '}';
    }
}
