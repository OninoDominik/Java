/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

/**
 *
 * @author campus
 */
public class Ligne {

    boolean ligne[];

    public Ligne(int capacite) {
        ligne = new boolean[capacite];
        for (int i = 0; i < capacite; i++) {
            ligne[i] = false;
        }
    }

    public int getCapacite() {
        return ligne.length;
    }
    public boolean getCase(int nb)
    {
        boolean resultat= ligne[nb];
        return resultat;
    }
     public void setCase(int nb)
     {
         ligne[nb]=true;
     }
     public boolean estPleine()
     {
         for(int i=0;i<(ligne.length);i++)
         {if (ligne[i]==false)
                 {return false;}
         }
         return true;
     }
     

}
