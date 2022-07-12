package Lessons.LaboratoryWork9_Collections.Set;

import java.util.*;

public class GetAndReturn {

    public static void gettingCollection() {
        List<String> stringList = new ArrayList<>();

        stringList.add("Berlis");
        stringList.add("Ilya");
        stringList.add("Berlis");
        stringList.add("berlis");
        stringList.add("Saint-Petersburg");
        stringList.add("Saint-Petersburg");
        stringList.add("Saint-Petersburg");
        stringList.add("Saint-Petersburg");
        stringList.add("Russian Federation");
        stringList.add("world");
        stringList.add("Ilya");
        stringList.add("death");
        stringList.add("nothing");
        stringList.add("nothing");
        stringList.add("nothing");
        stringList.add("street");

        System.out.println("Full collection: " + stringList);

        Set<String> strings1 = new HashSet<>(stringList);
        System.out.println("Collection without duplicate: " + strings1);
    }

    public static void main(String[] args) {
        gettingCollection();
    }
}
