package Lessons.LaboratoryWork6_Extending.Task5;

public class User extends Basic {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void userInformation() {
        System.out.println("Enter the name");
        setName(super.scanner.nextLine());
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
