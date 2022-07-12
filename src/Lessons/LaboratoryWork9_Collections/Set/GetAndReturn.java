package Lessons.LaboratoryWork9_Collections.Set;

import java.util.*;


public class GetAndReturn {

    static class Information{
        String fistname;
        String lastname;

        public Information(String fistname, String lastname){
            this.fistname = fistname;
            this.lastname = lastname;
        }
    }

    public static HashSet<Information> cleanCollection(List<Information> enterList){
        HashSet<Information> info = new HashSet<Information>();
        info.addAll(enterList);
        return info;
    }

    public static void gettingCollection() {
        List<Information> stringList = new ArrayList<Information>();

        stringList.add(new Information("Berlis", "Ilya"));
        stringList.add(new Information("Chupahina", "Elena"));
        stringList.add(new Information("Berlis", "Ilya"));
        stringList.add(new Information("Mask", "Ilon"));
        stringList.add(new Information("Packard", "Hewlett"));
        stringList.add(new Information("Spears", "Britney"));

        System.out.println("Full collection: " + stringList);

        System.out.println("Collection without duplicate: " + cleanCollection(stringList));
    }

    public static void main(String[] args) {
        gettingCollection();
    }
}
