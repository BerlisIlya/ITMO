package Lessons.LaboratoryWork10_ReadWriteAndConcat;

import java.io.*;

public class ChangeSymbol{

    public static File file1 = new File("C:\\Users\\User\\Desktop\\Home work.txt");
    public static File file2 = new File("C:\\Users\\User\\Desktop\\Final file.txt");

    public static void processingFile(){

        try {
            file2.createNewFile();
        }catch (IOException e){
            System.err.println("Error " + e.getMessage());
        }

        StringBuilder string = new StringBuilder();

        try (InputStream is = new FileInputStream(file1)){
            int a = is.read();
            while (a != -1){
                string.append((char) a);
                a = is.read();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        String result = building(string.toString());

        try (FileOutputStream fos = new FileOutputStream(file2)){
            byte[] array = result.getBytes();
            fos.write(array);
        } catch (IOException e) {
            System.err.println("Error " + e.getMessage());
        }
    }

    private static String building(String str){
        StringBuilder sb = new StringBuilder();

        for (int a = 0; a < str.length(); a++){
            if (Character.isLetterOrDigit(str.charAt(a))){
                sb.append(str.charAt(a));
            }else {
                sb.append("|");
            }
        }
        return  sb.toString();
    }

    public static void main(String[] args) {
        processingFile();
    }
}
