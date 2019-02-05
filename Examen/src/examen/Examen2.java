/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author campus
 */
public class Examen2 {

    public static void main(String[] args) {
        int n;
        int t = 1;
        System.out.println("Entrez la valeur de N");
        n = Clavier.readInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("-");
            }
            for (int k = 0; k < t+i*2; k++) {
                System.out.print("+");
            }
             for (int j = 0; j < n-i-1; j++) {
                System.out.print("-");
            }
             System.out.println("-");

        }
         for (int i = 0; i < n-2; i++)
         {for (int j = 0; j < n; j++) {
                System.out.print("-");
            }
            for (int k = 0; k < t; k++) {
                System.out.print("+");
            }
             for (int j = 0; j < n-1; j++) {
                System.out.print("-");
            }
             System.out.println("-");
         }
         for (int j = 0; j < n-1; j++) {
                System.out.print("-");
            }
            for (int k = 0; k < t+2; k++) {
                System.out.print("+");
            }
             for (int j = 0; j < n-2; j++) {
                System.out.print("-");
            }
             System.out.println("-"); 
         
        

    }

}
