/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo;

/**
 *
 * @author campus
 */
public class Tableaux {
    public static void main(String[] args) {
        int[][] t = new int[3][];
        t[0] = new int[2];
        t[1] = new int[] {1, 2, 3};
        t[2] = new int[2];
        
        // ANCIENNE TECHNIQUE POUR PARCOURIR DES TABLEAUX
        for (int i = 0; i < t[1].length; i++) {
            System.out.print(" " + t[1][i]);
        }
        System.out.println();
        
        // NOUVELLE TECHNIQUE POUR PARCOURIR DES TABLEAUX
        for (int e : t[1]) {
            System.out.print(" " + e);
        }
        System.out.println();
        
        // AFFICHAGE DE TOUT LE TABLEAU
        for (int[] d1 : t) {
            for (int d2 : d1) {
                System.out.print(" " + d2);
            }
            System.out.println();
        }
    }
}