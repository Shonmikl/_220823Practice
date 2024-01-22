package org.example._2024_01_17;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class T1 {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader("prog.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            assert reader != null;
            reader.close();
        }
    }
}

class T2 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("prog.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.println((char) c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
