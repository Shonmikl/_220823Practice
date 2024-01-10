package org.example._2024_01_10;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class FileSearcher {

    public static void main(String[] args) {
        File root = new File("E:\\");
        List<File> fileList = new ArrayList<>(50);
        String extension = ".pdf";

        searchFile1(root, fileList, extension);

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

    private static void searchFile1(File rootFile, List<File> fileList, String extension) {
        Path rootPath = rootFile.toPath();

        try {
            Files.walkFileTree(rootPath, new SimpleFileVisitor<>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                    if (file.toString().toLowerCase().endsWith(extension)) {
                        fileList.add(file.toFile());
                    }
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path file, IOException exc) {

                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            System.out.println("MISTAKE");
        }
    }
}