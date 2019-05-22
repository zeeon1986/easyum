package lesson19.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FindFilesTaskImpl extends TaskImpl implements FindFilesTask {
    private String directory;
    private String searchString;
    private PrintStream printStream;

    @Override
    public void setDirectory(String directory) throws NullPointerException, FileNotFoundException {
        File dir = new File(directory);
        if (directory == null) {
            new NullPointerException("Incorrect directory");
        }

        if (!dir.exists()) {
            throw new FileNotFoundException("Directory does not exist");
        }
        this.directory = directory;
    }

    @Override
    public void setFileNameSearchString(String searchString) throws IllegalArgumentException {
        if (searchString == null) {
            throw new IllegalArgumentException("Incorrect searchString");
        }
        this.searchString = searchString;
    }

    @Override
    public void setPrintStream(PrintStream out) {
        this.printStream = out;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        File dir = new File(directory);
        File[] filesFromDir = dir.listFiles(pathname -> {
            String fileName = pathname.getName();
            int getIndex = fileName.indexOf(searchString);
            if (getIndex == -1) {
                return false;
            }
            return true;
        });

       for (File file: filesFromDir) {
           printStream.println(file.getAbsolutePath());
       }
    }
}
