package Oblig1;

import static javax.swing.JOptionPane.*;

public class OPG3 {

    public static void main(String[] args) {

    String ntall = showInputDialog("Skriv et heltall som er større enn 0");

    int n = Integer.parseInt(ntall);
    long fakultet = 1;

    if (n <=0) {
        System.out.println("Ugyldig verdi for n");
        }else {
       for (int i = 1; i <= n; i++) {
            fakultet *= i;
        }
        System.out.println("Fakultet av n = "+ fakultet);
        }

    }
}




