package lesson18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class GetChannel {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws Exception {
        // Запись в файл:
        FileChannel fc = new FileOutputStream("data.txt").getChannel();
        fc.write(ByteBuffer.wrap("ываываыаав ".getBytes()));
        fc.close();
        // Добавление в конец файла:
        fc = new RandomAccessFile("data.txt", "rw").getChannel();
        fc.position(fc.size()); // Переходим в конец
        fc.write(ByteBuffer.wrap("Aыаваы ыва  asdad sdfdsf".getBytes()));
        fc.close();
        // Чтение файла:

        fc = new FileInputStream("data.txt").getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();
        while(buff.hasRemaining())
            System.out.print(StandardCharsets.UTF_8.decode(buff).toString());
    }
}
