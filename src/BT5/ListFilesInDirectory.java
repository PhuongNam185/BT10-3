package BT5;


import java.io.File;

public class ListFilesInDirectory {
    public static void main(String[] args) {
        // Đường dẫn tới thư mục cần liệt kê
        String directoryPath = "path/to/your/directory";

        File directory = new File(directoryPath);

        // Kiểm tra xem đường dẫn có phải là thư mục không
        if (directory.isDirectory()) {
            // Lấy danh sách các file và thư mục trong thư mục chỉ định
            File[] filesList = directory.listFiles();

            // Kiểm tra xem thư mục có rỗng không
            if (filesList != null && filesList.length > 0) {
                System.out.println("Danh sách các file trong thư mục \"" + directoryPath + "\":");

                for (File file : filesList) {
                    // Kiểm tra xem đối tượng File có phải là file không
                    if (file.isFile()) {
                        System.out.println("File: " + file.getName());
                    } else if (file.isDirectory()) {
                        System.out.println("Thư mục: " + file.getName());
                    }
                }
            } else {
                System.out.println("Thư mục rỗng.");
            }
        } else {
            System.out.println("Đường dẫn không phải là thư mục.");
        }
    }
}
