package lesson18;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/evgeniy/Downloads/Zoom.pkg"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("New.pkg"));

            int c = 0;
            while (true) {
                c = bis.read();
                if (c != -1)
                    bos.write(c);
                else
                    break;
            }
            bis.close();
            bos.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
            bos.close(); //закрываем поток записи (обязательно!)
        }
        catch (java.io.IOException e) {
            System.out.println(e.toString());
        }
    }

}
