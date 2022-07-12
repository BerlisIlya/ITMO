package Lessons.LaboratoryWork9_Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class User {
    public static Scanner scanner = new Scanner(System.in);
    private static String name;
    private static final int shot = new Random().nextInt(100);



    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void point() {
        Map<User, Integer> map = new HashMap<>();

        map.put(new User("Berlis Ilya"), shot);
        map.put(new User("Gabriel"), shot);
        map.put(new User("Elizabeth queen"), shot);
        map.put(new User("Dracula"), shot);
        map.put(new User("Enrique Iglesias"), shot);
        map.put(new User("Anastasia Begunova"), shot);
        map.put(new User("No one"), shot);
        map.put(new User("Elizabeth queen"), shot);

        System.out.println("Enter player's name: ");
        String name = scanner.nextLine();

        for (var entry : map.entrySet()) {
            if (entry.getKey().getName().equalsIgnoreCase(name)) {
                System.out.printf("Player's result is: " + entry.getValue());
                return;
            }
        }
        System.out.println("Player not found");
    }

    public static void main(String[] args) {
        point();
    }
}
