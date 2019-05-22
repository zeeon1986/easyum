package lesson19;

public class Main {
    public static void main(String[] args) {
        FileCopyWithChannel fcwc = new FileCopyWithChannel();
        FileCopyWithJava7 fcwj7 = new FileCopyWithJava7();
        try {
            fcwc.copyFile("/Users/evgeniy/Downloads/test2.txt", "/Users/evgeniy/IdeaProjects/EasyUm/tstx1.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            fcwj7.copyFile("/Users/evgeniy/Downloads/test.txt", "/Users/evgeniy/IdeaProjects/EasyUm/tstx.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
