package Primer1;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.SQLOutput;

public class Primer1 {
    // Метод для чтения данных из потока по байтам с выводом
    public static void readALlByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read(); // читает 1 байт
            if (oneByte != -1) {     // признак отсутсвия конца файла
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
        public static void main(String[]args) throws IOException {
            try {

                // С потоком связан файл
                InputStream inFile = new FileInputStream("c:/tmp/text.txt");
                readALlByByte(inFile);
                System.out.print("\n\n\n");
                inFile.close();

                // С потомк связана интернет-страница
                InputStream inFile = new URL("htt://google.com").openStream();
                readALlByByte(inFile);
                System.out.print("\n\n\n");
                inUrl.close();

                // C потоком связан массив типа byte
                InputStream inArray = new ByteArrayInputStream(new byte[]{7, 9, 3, 7, 4});
                readALlByByte(inUrl);
                System.out.print("\n\n\n");
                inArray.close();
            } catch (IOException e) {
                System.out.println("Ошибка: " + e);
            }
        }
    }