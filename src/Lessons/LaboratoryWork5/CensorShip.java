package Lessons.LaboratoryWork5;

import java.util.Scanner;

public class CensorShip {

    public static void censor() {
        StringBuilder builder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");

        String str = scanner.nextLine();
        String[] word = str.split(" ");

        for (String w : word) {
            if (w.equalsIgnoreCase("бяка")) builder.append(" [вырезано цензурой]");
            else builder.append(String.format(" %s", word));
        }

        System.out.println(builder.replace(0, 1, ""));
    }

    public static void main(String[] args) {
        CensorShip censorShip = new CensorShip();
        censorShip.censor();
    }
}
