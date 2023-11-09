package LF11aV2;
import java.util.Scanner;
import java.util.InputMismatchException;

public class GrößterGemeinsameTeiler {
    Scanner scanner = new Scanner(System.in);
    public void großterRechnen() {
        while (true) {
            //Abfangen von Tastatureingabefehlern des Benutzers
            try {
                System.out.println("Bitte geben Sie der erst Nummer ein:   ");
                System.out.println("  *wenn Sie 0 oder negative geben, dann Project wird zu ende.");
                int m = scanner.nextInt();
                //Einstellung der Schleifenausgangsmethode
                if (m <= 0 ) {
                    System.out.println("Die Eingabe von 0 oder negativ führt zu einem Abbruch.");
                    return;
                }
                System.out.println("Bitte geben Sie die zweite Nummer ein: ");
                System.out.println("  *wenn Sie 0 oder negativ geben, dann Project wird zu ende.");
                int n = scanner.nextInt();
                //Einstellung der Schleifenausgangsmethode
                if (n <= 0) {
                    System.out.println("Die Eingabe von 0 führt zu einem Ende.");
                    return;
                }
                //Euklidischer Algorithmus
                while (n != 0) {
                    int temp = m % n;
                    m = n;
                    n = temp;
                }
                System.out.println("Größter gemeinsamer Teiler ist: " + m);
            }catch(InputMismatchException e) {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine Zahl ein.");
                // Clear the scanner buffer
                scanner.next();
            }
        }
    }
}



