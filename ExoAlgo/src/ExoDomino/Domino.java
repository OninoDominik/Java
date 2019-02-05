/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExoDomino;

/**
 *
 * @author campus
 */
public class Domino {

    private int droite;
    private int gauche;

    public Domino(int gauche, int droite) {
        if (droite < 0) {
            droite = 0;
        }
        if (gauche < 0) {
            gauche = 0;
        }
        if (droite > 6) {
            droite = 6;
        }
        if (gauche > 6) {
            gauche = 6;
        }
        this.gauche = gauche;
        this.droite = droite;
        
        
    }

    public int getDroite() {
        return droite;
    }

    public int getGauche() {
        return gauche;
    }
    public String affiche() 
    {
        String affiche;
        affiche="["+gauche+"|"+droite+"]";
        return affiche;
    }
     public void inverser() 
    {
        int tempo;
        tempo=droite;
        droite=gauche;
        gauche=tempo;
        
    }
    public static void main(String[] args) {
        Domino A=new Domino(2,7);
        System.out.println(A.affiche());
        A.inverser();
        System.out.println(A.affiche());
        A.inverser();
        
    }
    }

