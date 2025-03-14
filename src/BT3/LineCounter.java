package BT3;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCounter {
    public static void main(String[] args) {
        String filePath = "đường-dẫn-đến-tệp-của-bạn.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int lineCount = 0;
            while (reader.readLine() != null) {
                lineCount++;
            }
            System.out.println("Số dòng trong tệp: " + lineCount);
        } catch (IOException e) {
            System.err.println("Đã xảy ra lỗi khi đọc tệp: " + e.getMessage());
        }
    }
}
