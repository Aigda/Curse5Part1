import java.io.File;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Запрашиваем путь в консоли
        String path ;
        // Проверяем, чо файл существует
        File file ;
        boolean fileExists ;
        // Это файл, а не директория
        boolean isDirectory;

        int count = 0;

        // проверки
        for (;;){
            // Запрашиваем путь в консоли
            path = new Scanner(System.in).nextLine();

            // Проверяем, чо файл существует
            file = new File(path);
            fileExists = file.exists();

            // Это файл, а не директория
            isDirectory = file.isDirectory();

            if ((!fileExists) | isDirectory )
            {
                System.out.println("файл не существует или указанный путь является путём к папке: " + path);
                continue;
            }
            else {
                count++;
                System.out.println("Путь указан верно: " + path);
                System.out.println("Это файл номер: " + count);

            }

        }
    }
}