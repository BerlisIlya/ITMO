package Lessons.LaboratoryWork10;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Concatenation {
    public static  List<Path> list = Arrays.asList(
            Paths.get("C:\\Users\\User\\Desktop\\Home work.txt"),
            Paths.get("C:\\Users\\User\\Desktop\\New home work.txt")
    );
    public static Path outPut = Paths.get("C:\\Users\\User\\Desktop\\Common file.txt");
    public static  Charset charset = StandardCharsets.UTF_8;

    public static void concat(){
        for (Path path : list) {
            List<String> line = null;

            try {
                line = Files.readAllLines(path,charset);
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }

            try {
                Files.write(outPut, line, charset, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args){
        concat();
    }
}
