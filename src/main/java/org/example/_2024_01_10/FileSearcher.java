package org.example._2024_01_10;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSearcher {

    public static void main(String[] args) {
        File root = new File("E:\\");
        List<File> fileList = new ArrayList<>(50);
        String extension = ".pdf";

        searchFile(root, fileList, extension);

        for (File file : fileList) {
            System.out.println("**FOUND**: " + file.getAbsolutePath());
        }
    }

    private static void searchFile(File rootFile, List<File> fileList, String extension) {
        if(rootFile.isDirectory()) {
//            System.out.println("searching...... ... .. ." + rootFile.getAbsolutePath());
            File[] files = rootFile.listFiles();
            if(files != null) {
                for (File f : files) {
                    if(f.isDirectory()) {
                        searchFile(f, fileList, extension);
                    } else {
                        if(f.getName().toLowerCase().endsWith(extension)) {
                            fileList.add(f);
                        }
                    }
                }
            }
        }
    }
}