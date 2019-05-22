package lesson19.practice;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CopyFileTaskImpl copyFileTask1 = new CopyFileTaskImpl("/Users/evgeniy/Documents/testdata/test1.txt",
                                                            "/Users/evgeniy/IdeaProjects/EasyUm/test1.txt");

        CopyFileTaskImpl copyFileTask2 = new CopyFileTaskImpl("/Users/evgeniy/Documents/testdata/test2.txt",
                                                            "/Users/evgeniy/IdeaProjects/EasyUm/test2.txt");

        CopyFileTaskImpl copyFileTask3 = new CopyFileTaskImpl("/Users/evgeniy/Documents/testdata/test3.txt",
                                                            "/Users/evgeniy/IdeaProjects/EasyUm/test3.txt");

        CopyFileTaskImpl copyFileTask4 = new CopyFileTaskImpl("/Users/evgeniy/Documents/testdata/test4.txt",
                                                            "/Users/evgeniy/IdeaProjects/EasyUm/test4.txt");

        CopyFileTaskImpl copyFileTask5 = new CopyFileTaskImpl("/Users/evgeniy/Documents/testdata/test5.txt",
                                                            "/Users/evgeniy/IdeaProjects/EasyUm/test5.txt");

        FindFilesTaskImpl findFilesTask1 = new FindFilesTaskImpl();
        findFilesTask1.setDirectory("/Users/evgeniy/Documents/testdata");
        findFilesTask1.setFileNameSearchString("test");

        FindFilesTaskImpl findFilesTask2 = new FindFilesTaskImpl();
        findFilesTask2.setDirectory("/Users/evgeniy/Documents/testdata");
        findFilesTask2.setFileNameSearchString("test");

        FindFilesTaskImpl findFilesTask3 = new FindFilesTaskImpl();
        findFilesTask3.setDirectory("/Users/evgeniy/Documents/testdata");
        findFilesTask3.setFileNameSearchString("test");

        FindFilesTaskImpl findFilesTask4 = new FindFilesTaskImpl();
        findFilesTask4.setDirectory("/Users/evgeniy/Documents/testdata");
        findFilesTask4.setFileNameSearchString("test");

        FindFilesTaskImpl findFilesTask5 = new FindFilesTaskImpl();
        findFilesTask5.setDirectory("/Users/evgeniy/Documents/testdata");
        findFilesTask5.setFileNameSearchString("test");
    }
}
