package LF11aV2;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Tastaturmenu {
    public void tastaturmenu(){
        //Creating Instance Objects
        Schaltjahrberechnung schaltjahrberechnung = new Schaltjahrberechnung();
        GrößterGemeinsameTeiler größterGemeinsameTeiler = new GrößterGemeinsameTeiler();
        Kapitalverdoppelung kapitalverdoppelung = new Kapitalverdoppelung();
        FibnonacciFolge fibnonacciFolge = new FibnonacciFolge();
        Scanner scanner = new Scanner(System.in);

        while (true){
            //Abfangen von Tastatureingabefehlern des Benutzers
            try {
                //Druckt eine Liste von Menüs für die Benutzerauswahl
                System.out.println("Bitte wahlen Sie eine Funktion aus:  ");
                System.out.println("  *wenn Sie 0 geben, dann Project wird zu ende.");
                System.out.println("1. Schaltjahr berechnung");
                System.out.println("2. Größter Gemeinsame Teiler");
                System.out.println("3. Kapitalverdoppelung");
                System.out.println("4. FibonacciFolge");

                int n = scanner.nextInt();
                //Einrichten des Benutzer-Exit-Schleifenmechanismus
                if(n==0){
                    System.out.println("Chao,Chao!");
                    break;
                }
                //switch Kommissionierer
                switch (n) {
                    case 1:
                        schaltjahrberechnung.isLeapYear();
                        break;
                    case 2:
                        größterGemeinsameTeiler.großterRechnen();
                        break;
                    case 3:
                        kapitalverdoppelung.kapitalverdoppeln();
                        break;
                    case 4:
                        fibnonacciFolge.berechneFibonacciSequenz();
                        break;
                    default:
                        break;
                }
            }catch(InputMismatchException e){
                    System.out.println("Ungültige Eingabe. Bitte geben Sie eine Zahl ein.");
                    // Clear the scanner buffer
                    scanner.next();
            }
        }
    }
}
