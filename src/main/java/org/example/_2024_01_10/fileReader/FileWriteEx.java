package org.example._2024_01_10.fileReader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {
    public static void main(String[] args) throws IOException {

        //абсолютный и относительный путь
        String s = "Eyewitnesses said it fell onto adjacent homes, " +
                "which is where most of the victims are thought " +
                "to have been. It is not known how many people are still under the debris.";
        String s1 = "!!!";

        try (FileWriter writer = new FileWriter("E:\\_2628M\\222.txt")) {
            //сам может создать файл в корне
            //writer = new FileWriter("333.txt", true); - присоединяем к тексту
            for (int i = 0; i < s.length(); i++) {
                writer.write(s.charAt(i));// запишем каждый символ в наш файл//принимает int как так
                //writer.write(s);
                //writer.write(s1); //перепишет
            }
            System.out.println("DONE");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //без закрытия не запишется
    }
}