package Lessons.LaboratoryWork3;

public class House {
    private Integer numberOfFloors;
    private Integer yearOfBuilding;
    private String name;

    public void information(Integer numberOfFloors, Integer yearOfBuilding, String name) {
        this.numberOfFloors = numberOfFloors;
        this.yearOfBuilding = yearOfBuilding;
        this.name = name;
    }

    public String output(String str, String str1, String name) {
        return String.format("numberOfFloors: %s\n yearOfBuilding: %s\n name: %s", numberOfFloors, yearOfBuilding, name);
    }

    public void age(Integer yearOfBuilding) {
        this.yearOfBuilding = yearOfBuilding;
    }

    public static void main(String[] args) {
        House house = new House();

        house.information(3, 2011, "Cottege");
        System.out.println(house);

        house.output("25", "1998", "skyscraper");
        System.out.println(house);

        house.age(2011);
        System.out.println(house);
    }
}
