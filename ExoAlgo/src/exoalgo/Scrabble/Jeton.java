/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exoalgo.Scrabble;

/**
 *
 * @author campus
 */
public class Jeton {
    
    private char lettre;
    private int valeur;
    private int[] valeurLettreFrancaise = {1,2,2,2,1,4,2,4,1,8,10,1,2,1,1,2,8,1,1,1,1,4,10,10,10,10};

    public void setLettre(char lettre) {
        this.lettre = lettre;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public char getLettre() {
        return lettre;
    }

    public int getValeur() {
        return valeur;
    }
    
    public Jeton(char lettre) {
    this.lettre=lettre;
    this.valeur=valeurLettreFrancaise[lettre-'A'];   
}
    
    public Jeton(char lettre,int valeur) {
    this.lettre=lettre;
    this.valeur=valeur; 
}
    public Jeton() {
    this.lettre='*';
    this.valeur=0;
}
    public void affiche(){
        System.out.print("["+lettre+"]");
    }
    
}
