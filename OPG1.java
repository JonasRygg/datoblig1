package Oblig1;

import static javax.swing.JOptionPane.*;

public class OPG1 {

    public static void main(String[] args) {

        String bruttoinntekt = showInputDialog("Skriv Din Bruttoinntekt");

        double brutto = Double.parseDouble(bruttoinntekt);

        double trinnskatt = 0;

        if (brutto <=164100.0){
            trinnskatt = (brutto * 0.0);
        } else if (brutto <=230950) {
            trinnskatt = (brutto * 0.0093);
        } else if (brutto <=580650) {
            trinnskatt = (brutto * 0.0241);
        } else if (brutto <=934050) {
            trinnskatt = (brutto * 0.1152);
        } else if (brutto >=934051) {
            trinnskatt = (brutto * 0.1452);
        }

        System.out.println("Trinnskatt = NOK " + trinnskatt);

    }


}
