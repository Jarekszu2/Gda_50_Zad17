package packZad17;

import java.util.Scanner;

public class ScannerWork {
    Scanner scanner = new Scanner(System.in);

    public int getInt(int min, int max) {
        boolean flag = false;
        int result = 0;
        String intString = "";
        do {
//            System.out.println();
            System.out.println("Podaj liczbę:");
            intString = scanner.next();
            try {
                result = Integer.valueOf(intString);
            } catch (NumberFormatException e) {
                System.err.println("To nie jest liczba.");
            }
            if (result > min && result < max) {
                flag = true;
            } else {
                System.err.println("Liczba spoza zakresu.");
            }
        } while (!flag);
        return result;
    }
}
