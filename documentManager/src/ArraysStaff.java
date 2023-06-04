import java.util.LinkedList;
import java.util.Scanner;

public class ArraysStaff {
    static Scanner scanner = new Scanner(System.in);
    public static void addElement(LinkedList<String> numbs) {
        System.out.print("Введите элемент для добавления: ");
        String addition = scanner.nextLine();
        numbs.add(addition);
    }

    public static void showElements(LinkedList<String> numbs) {
        for (String num : numbs) {
            System.out.println(num);
        }
    }

    public static void sizeElements(LinkedList<String> numbs) {
        System.out.println("В списке " + numbs.size() + " элементов.");
    }

    public static void stopLoop(LinkedList<String> numbs) {
        System.out.println("В списке " + numbs.size() + " элементов.");
        for (int i = 0; i < numbs.size(); i++) {
            System.out.println(i + 1 + " " + numbs.get(i));
        }
    }
}