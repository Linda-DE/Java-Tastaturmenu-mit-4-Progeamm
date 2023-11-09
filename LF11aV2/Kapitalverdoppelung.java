package LF11aV2;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Kapitalverdoppelung {
    public void kapitalverdoppeln(){
        Scanner scanner = new Scanner(System.in);

        while(true) {
            //Abfangen von Tastatureingabefehlern des Benutzers
            try {
                System.out.println("Geben Sie das Anfangskapital ein: ");
                System.out.println("  *wenn Sie 0 oder negativ geben, dann Pojekt wird zu ende.");
                double ursprungskapital = scanner.nextDouble();
                if(ursprungskapital<=0){
                    System.out.println("Chao,Chao!");
                    break;
                }

                System.out.println("Geben Sie den jährlichen Zinssatz in Prozent ein z.b. 5: ");
                System.out.println("  *wenn Sie 0 oder negativ geben, dann Pojekt wird zu ende.");
                double zinssatzProzent = scanner.nextDouble();
                if(zinssatzProzent<=0){
                    System.out.println("Chao,Chao!");
                    break;
                }

                double zinssatzDezimal = zinssatzProzent / 100.0;
                int jahre = 0;
                //Vom Anfangskapital aus berechnen
                double kapital = ursprungskapital;
                //Iteration mit while-Schleifen
                while (kapital < 2 * ursprungskapital) {
                    kapital += kapital * zinssatzDezimal;
                    jahre++;
                }
                System.out.println("Es dauert " + jahre + " Jahre, um das Kapital zu verdoppeln.");
            }catch(InputMismatchException e) {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine Zahl ein.");
                scanner.next(); // Clear the scanner buffer
            }
        }
    }

}

