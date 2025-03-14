package BT1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        // Đường dẫn tới file nguồn và file đích
        String sourceFile = "source.txt";
        String destFile = "destination.txt";

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            int byteContent;
            // Đọc nội dung từ file nguồn và ghi vào file đích
            while ((byteContent = fis.read()) != -1) {
                fos.write(byteContent);
            }
            System.out.println("Copy file thành công!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
