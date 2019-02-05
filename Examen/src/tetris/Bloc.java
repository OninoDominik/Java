/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.util.Random;

/**
 *
 * @author campus
 */
public class Bloc {

    Random random = new Random();
    boolean[][] structure = new boolean[2][2];

    public Bloc() {
        int randomStructure;
        randomStructure = random.nextInt(3);
        //  System.out.println("random ="+randomStructure);
        if (randomStructure == 0) {
            structure[0][0] = true;
            structure[1][0] = true;
            structure[0][1] = false;
            structure[1][1] = false;
        }
        if (randomStructure == 1) {
            structure[0][0] = true;
            structure[1][0] = true;
            structure[0][1] = true;
            structure[1][1] = false;
        }
        if (randomStructure == 2) {
            structure[0][0] = true;
            structure[1][0] = true;
            structure[0][1] = true;
            structure[1][1] = true;
        }

    }

    public boolean getCase(int nb) {
        boolean resultat=false ;
        if (nb < 0) {
            nb = 0;
        } else if (nb > 3) {
            nb = 3;
        }
        if (nb == 0) {
            resultat = structure[0][0];
        }
        if (nb == 1) {
            resultat = structure[0][1];
        }
        if (nb == 2) {
            resultat = structure[1][1];
        }
        if (nb == 3) {
            resultat = structure[1][0];
        }
        return resultat;
    }

    public void pivoter() {
        boolean tempo;
        tempo = structure[0][0];
        structure[0][0] = structure[0][1];
        structure[0][1] = structure[1][1];
        structure[1][1] = structure[1][0];
        structure[1][0] = tempo;
    }

    public void affiche() {
        if (structure[0][0] == true) {
            System.out.print("x");
        } else {
            System.out.print(".");
        }
        if (structure[0][1] == true) {
            System.out.println("x");
        } else {
            System.out.println(".");
        }
        if (structure[1][0] == true) {
            System.out.print("x");
        } else {
            System.out.print(".");
        }
        if (structure[1][1] == true) {
            System.out.println("x");
        } else {
            System.out.println(".");
        }

    }

    
}
