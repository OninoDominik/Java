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
public class Colonne {

    private int capacite;
    private Bloc[] blocs;
    private int nbBlocs;
    private int nbCases;

    public int getCapacite() {
        return capacite;
    }

    public int getNbCases() {
        return nbCases;
    }

    public Colonne(int capacite) {
        if (capacite < 4) {
            this.capacite = 4;
        } else if (capacite > 9) {
            this.capacite = 9;
        } else {
            this.capacite = capacite;
        }
        nbBlocs = 0;
        nbCases = 0;
        blocs = new Bloc[this.capacite];

    }

    public boolean ajoute(Bloc b) {
        boolean results = false;
        blocs[nbBlocs] = b;
        nbBlocs++;
        this.nbCases += b.getNbCases();

        if (this.nbCases == this.capacite) {
            results = true;
            nbBlocs = 0;
            nbCases = 0;
            blocs = new Bloc[this.capacite];
        }
        return results;
    }

    public boolean estRemplissable() {
        boolean results = true;
        if (nbCases >= capacite) {
            results = false;
        }
        return results;
    }

    public String toString() {
        String chaineResults = "";
        for (int i = 0; i < nbBlocs; i++) { //nb de case de bloc p-e
            for (int j = 0; j < this.blocs[i].getNbCases(); j++) {
                chaineResults += (i + 1);
            }
            
        }
        if (capacite-nbCases>0)
         for (int k = 0; k <capacite-nbCases ; k++)
         {
             chaineResults +="_";
         }
        return chaineResults;
    }

    public static void main(String[] args) {
        Colonne col = new Colonne(7);
        System.out.println("capacite= " + col.getCapacite());
        System.out.println("nbcases= " + col.getNbCases());
        Bloc b = new Bloc();
        System.out.println("nbcases du bloc= " + b.getNbCases());
        col.ajoute(b);
        System.out.println("capacite= " + col.getCapacite());
        System.out.println("nbcases= " + col.getNbCases());
        Bloc c = new Bloc();
        System.out.println("nbcases du bloc= " + c.getNbCases());
        col.ajoute(c);
        System.out.println("capacite= " + col.getCapacite());
        System.out.println("nbcases= " + col.getNbCases());
        Bloc d = new Bloc();
        System.out.println("nbcases du bloc= " + d.getNbCases());
        col.ajoute(d);
        System.out.println("capacite= " + col.getCapacite());
        System.out.println("nbcases= " + col.getNbCases());
    }
}
