package hw2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Repeated {
    public static void main(String[] args) throws IOException {
        String str = "TEST";
        String repeated = str.repeat(100);
        repeated.equals("");
            System.out.print(repeated);
            String content = repeated;
            String path = "repeated.txt";
            Files.write( Paths.get(path), content.getBytes());
        }
    }
