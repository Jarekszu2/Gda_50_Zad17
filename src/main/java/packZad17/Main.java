package packZad17;

import java.util.List;

/*
17 Zadanie:
- Metoda zwracające listę wszystkich wielokrotności a, mniejszych od b.
- Metoda sprawdzająca, czy liczba jest pierwsza.

 */
public class Main {
    public static void main(String[] args) {
        System.out.println();
        Utilities utilities = new Utilities();
        ScannerWork scannerWork = new ScannerWork();

        // 1. Metoda zwracające listę wszystkich wielokrotności a, mniejszych od b.
        System.out.println("1.");
//        List<Integer> list = utilities.nr1wielokrotnoscAMniejszeOdB();
        System.out.println("Lista wielokrotności:");
//        list.forEach(System.out::println);

        // 2. Metoda sprawdzająca, czy liczba jest pierwsza.
        System.out.println();
        System.out.println("2.");
        System.out.println("Metoda sprawdza czy liczba jest liczbą pierwszą.");
        int liczba2 = scannerWork.getInt(0, 100);
        System.out.println("Liczba: " + liczba2 + " jest liczbą pierwszą: " + utilities.nr2czyLiczbaJestLiczbąPierwsza(liczba2));
    }
}
