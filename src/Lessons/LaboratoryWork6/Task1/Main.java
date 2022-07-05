package Lessons.LaboratoryWork6.Task1;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Berlis", "Ikya", "TransNational");
        customer.information();

        System.out.println("");

        Worker worker = new Worker("Spanch", "Bob", "HomeCredit");
        worker.information();
    }
}
