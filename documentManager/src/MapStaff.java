import java.util.HashMap;
import java.util.Scanner;

public class MapStaff {
    static HashMap<String, String> files = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    public static void addToMap() {
        System.out.print("Введите ключ: ");
        String key = scanner.nextLine();
        System.out.print("Введите значение: ");
        String value = scanner.nextLine();

        files.put(key, value);
    }

    public static void showAllElements() {
        System.out.println(files.entrySet());
    }

    public static void showKeys() {
        System.out.println(files.keySet());
    }

    public static void showValues() {
        System.out.println(files.values());
    }

    public static void showByKey() {
        System.out.print("Введите ключ: ");
        String getKey = scanner.nextLine();
        try {
            System.out.println(files.get(getKey));
        } catch (Exception e) {
            System.out.println("Такого ключа нет");
            System.out.println(e.getMessage());
        }


    }

}
