package Lessons.LaboratoryWork3;

import com.sun.source.tree.CaseTree;

import java.awt.*;

public class CharacterOfTheCar {

    private String name;
    private String color;
    private Double weight;

    public void information(String color, String name, Double weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    public CharacterOfTheCar(String color) {
        this.color = color;
    }

    public CharacterOfTheCar(String color, Double weight) {
        this.color = color;
        this.weight = weight;
    }

    public CharacterOfTheCar() {
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight = weight;
    }

    public String toString() {
        return "CharacterOfTheCar{" +
                "name=" + name + '\'' +
                "color=" + color + '\'' +
                "weight" + weight + '\'' +
                '}';
    }

    public static void main(String[] args) {
        CharacterOfTheCar character = new CharacterOfTheCar("black");
        CharacterOfTheCar character1 = new CharacterOfTheCar("white", 1.93);

        System.out.println(character);
        System.out.println(character1);

        character.information("blue", "Volvo", 2.1);

        System.out.println(character);
    }
}
