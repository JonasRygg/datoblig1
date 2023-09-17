package Oblig1;

import static javax.swing.JOptionPane.*;

public class OPG2 {

    public static void main(String[] args) {

    String poengsum = showInputDialog("Skriv din poengsum");

    int poeng = Integer.parseInt(poengsum);

    if (poeng < 0 || poeng > 1000) {
        System.out.println("Ugyldig poengsum. Skriv et tall mellom 0-100");
    } else {
        if (poeng <= 39) {
            System.out.println("Din karakter = F");
        } else if (poeng <= 49) {
            System.out.println("Din karakter = E");
        } else if (poeng <= 59) {
            System.out.println("Din karakter = D");
        } else if (poeng <= 79) {
            System.out.println("Din karakter = C");
        } else if (poeng <= 89) {
            System.out.println("Din karakter = B");
        } else if (poeng <= 100) {
            System.out.println("Din karakter = A");
        }
    }

    }


}
