package Lessons.LaboratoryWork10_ReadWriteAndConcat;

import java.io.*;

public class WriteTextToFile {

    public static File file1  = new File("C:\\Users\\User\\Desktop\\Home work.txt");
    public static File file2  = new File("C:\\Users\\User\\Desktop\\New home work.txt");
    public static String str = "\nAnd I'll finish her successfully";

    public static void copy(){

        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(file1);
            os = new FileOutputStream(file2);

            while (is.available() > 0){
                os.write(is.read());
            }
        } catch (IOException e) {
            System.err.println("Error " + e.getMessage());
        }finally {
            try {
                if (is != null){
                    is.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }

            try {
                if (os != null){
                    os.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void writerFile() {

        try{ FileWriter writer = new FileWriter(file2, true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write(str);
            bw.close();

        } catch (IOException e) {
            System.err.println("Error " + e.getMessage());
        }
    }

    public static void main(String[] args){
        copy();
        writerFile();
    }
}
