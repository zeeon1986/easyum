package lesson19;

import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.nio.file.FileAlreadyExistsException;

public  class FileCopyWithChannel implements FileCopyUtils {

    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        File fileFrom = new File(source);
        File fileTo = new File(destination);

        if (fileTo.exists()) {
            throw new FileAlreadyExistsException("file already exist");
        }
        try {
            FileChannel src = new FileInputStream(fileFrom).getChannel();
            FileChannel dst = new FileInputStream(fileTo).getChannel();
            dst.transferFrom(src, 0, src.size());
        } catch (Exception e) {
            throw new FileCopyFailedException(e.getMessage());
        }
    }
}
