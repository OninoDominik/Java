/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen; //exercice 1

/**
 *
 * @author campus
 */
public class Examen { //exercice 1

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DOMINIK GROBECKER
        double u = 1;
        double v = 2;
        double pi;
        int n = 99;
        double test;
        System.out.println("Entrez la valeur de N");
        n = Clavier.readInt();
        for (int i = 0; i < n; i++) {
            u = (u + v) / 2;
            v = Math.sqrt(u * v);
        }
        pi = Math.sqrt(27) / v;
        System.out.println("Valeur de Pi " + pi);

        // TODO code application logic here
    }

}
