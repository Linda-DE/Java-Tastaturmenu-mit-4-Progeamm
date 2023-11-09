package LF11aV2;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Schaltjahrberechnung {
    Scanner scanner = new Scanner(System.in);
    public void isLeapYear(){
        while (true) {
            //Abfangen von Tastatureingabefehlern des Benutzers
            try {
                System.out.println("Bitte geben Sie ein Jahr ein: ");
                System.out.println("  *wenn Sie 0 geben, dann Pojekt wird zu ende.");
                int year = scanner.nextInt();
                //Einrichten eines Schleifenausgangsmechanismus
                if (year==0){
                    break;
                }
                //Einrichten des Schaltjahr rechners
                if(year % 4 == 0 && (year % 100 != 0 || (year % 100 == 0 && year % 400 == 0))) {
                    System.out.println("Das Jahr: " + year + " ist eine Schaltjahr.");
                }else {
                    System.out.println("Das Jahr: " + year + " ist kein Schaltjahr.");
                }
            }catch(InputMismatchException e) {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine Zahl ein.");
                // Clear the scanner buffer
                scanner.next();
            }
        }
    }
}
