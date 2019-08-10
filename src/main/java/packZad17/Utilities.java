package packZad17;

import java.util.ArrayList;
import java.util.List;

public class Utilities {
    ScannerWork scannerWork = new ScannerWork();

    public List<Integer> nr1wielokrotnoscAMniejszeOdB() {
        List<Integer> list = new ArrayList<Integer>();
        System.out.println("Podaj liczbę z przedziału 3 - 20:");
        int liczbaA = scannerWork.getInt(3, 20);
        System.out.println("Podaj liczbę z przedziału 10 - 100:");
        int liczbaB = scannerWork.getInt(10, 100);

        if (liczbaA > liczbaB) {
            System.out.println("Liczba: " + liczbaB + " nie zawiera wielokrotności " + liczbaA + ".");
        } else {
            int iloscPowtorzenA = liczbaB / liczbaA;
            for (int i = 1; i < (iloscPowtorzenA + 1); i++) {
                list.add(liczbaA * i);
            }
        }
        return list;
    }

    public boolean nr2czyLiczbaJestLiczbąPierwsza(int liczba) {
        int counter = 0;
        for (int i = 1; i <= liczba; i++) {
            if ((liczba % i) == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            return true;
        } else {
            return false;
        }
    }
}
