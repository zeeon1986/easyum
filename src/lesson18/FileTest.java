package lesson18;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File dirFrom = new File("/Users/evgeniy/Downloads");

        File[] filesFromDir = dirFrom.listFiles(pathname -> {
            if (pathname.isDirectory()){
                return true;
            }

            if (pathname.getAbsolutePath().endsWith(".png") || pathname.getAbsolutePath().endsWith(".jpg")) {
                return true;
            }
            return false;
        });

        for (File file: filesFromDir) {
            System.out.println(file.getAbsolutePath());
        }


    }

}
