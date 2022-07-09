package Lessons.LaboratoryWork6_Extending.Task1;

public class Main {
    public static void main(String[] args) {
        Human customer = new Customer("Berlis", "Ikya", "TransNational");
//        customer.information();

        System.out.println("");

        Human worker = new Worker("Spanch", "Bob", "HomeCredit");
//        worker.information();

        print(customer);
        print(worker);
    }

    public static void print(Human human){
        human.information();
    }
}
