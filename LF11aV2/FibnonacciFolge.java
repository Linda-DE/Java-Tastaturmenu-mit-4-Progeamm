package LF11aV2;
import java.util.Scanner;
import java.util.InputMismatchException;
public class FibnonacciFolge {
    Scanner scanner = new Scanner(System.in);
    public void berechneFibonacciSequenz() {
        while (true){
            //Abfangen von Tastatureingabefehlern des Benutzers
            try {
                System.out.println("Bitte geben Sie eine Zahl ein:  ");
                System.out.println("  *wenn Sie 0 geben, dann Pojekt wird zu ende.");
                int n = scanner.nextInt();
                //Einstellung der Art und Weise, wie der Zyklus endet (wenn der Gesamthaushalt als 0 eingegeben wird)
                if (n <= 0) {
                    System.out.println("Chao,Chao!");
                    break;
                }

                //Die ersten beiden Zahlen der Fibonacci-Reihe werden auf 0 und 1 festgelegt.
                long a = 0, b = 1;
                System.out.print("FibonacciFolge: " + a + ", " + b);
                //Beginnend bei der dritten Zahl der Fibonacci-Reihe und in einer Schleife bis zur n-1ten Zahl
                for (int i = 2; i < n; i++) {
                    long next = a + b;
                    System.out.print(", " + next);
                    a = b;
                    b = next;
                }

                // Neue Zeile für das Endergebnis
                System.out.println();
                System.out.println("Das Ergebnis der FibonacciFolge mit " + n + " Zahlen ist: " + b);
            }catch(InputMismatchException e){
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine Zahl ein.");
                // Clear the scanner buffer
                scanner.next();
            }
        }
    }
}

