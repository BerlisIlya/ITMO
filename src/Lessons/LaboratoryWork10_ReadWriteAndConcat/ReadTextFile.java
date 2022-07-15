package Lessons.LaboratoryWork10_ReadWriteAndConcat;

import java.io.*;

public class ReadTextFile{
    public static void readerFile() {

        File file = new File("C:\\Users\\User\\Desktop\\Home work.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line = null;

            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.err.println("Error " + e.getMessage());
        }
    }

        public static void main(String[] args) {
        readerFile();
    }
}


