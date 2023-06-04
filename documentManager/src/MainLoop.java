import java.util.LinkedList;
import java.util.Scanner;

public class MainLoop {
    public static void mainLoop() {
        LinkedList<String> numbs = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);


        boolean work = true;
        while (work) {
            System.out.print("Введите команду: ");
            String doing = scanner.nextLine();
            switch (doing) {
                case "add" -> ArraysStaff.addElement(numbs);
                case "show" -> ArraysStaff.showElements(numbs);
                case "size" -> ArraysStaff.sizeElements(numbs);
                case "stop" -> {
                    work = false;
                    ArraysStaff.stopLoop(numbs);
                }
                case "addMap" -> MapStaff.addToMap();
                case "entry" -> MapStaff.showAllElements();
                case "keys" -> MapStaff.showKeys();
                case "values" -> MapStaff.showValues();
                case "byKey" -> MapStaff.showByKey();
            }
        }
    }
}
