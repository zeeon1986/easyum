package lesson19;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileCopyWithJava7 implements FileCopyUtils{


    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        File fileFrom = new File(source);
        File fileTo = new File(destination);

        if (fileTo.exists()) {
            throw new FileAlreadyExistsException("file already exist");
        }
        try {
            Files.copy(Paths.get(source), new FileOutputStream(destination));
        } catch (Exception e) {
            throw new FileCopyFailedException(e.getMessage());
        }
    }
}
