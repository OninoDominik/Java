/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;
import java.util.Scanner;

/**
 *
 * @author campus
 */
public class Jeu {
    Colonne[] colonnes ;
    int points;
    
    public Jeu(int colone0, int colone1 ,int... colone2plus)
    {
        colonnes=new Colonne[2+colone2plus.length];
        
        this.colonnes[0]= new Colonne(colone0);
        this.colonnes[1]= new Colonne(colone1);
        int i=0;
        for (int col : colone2plus)
        {
            colonnes[i+2]= new Colonne(colone2plus[i]);
            i++;
        }
        
    }

    public int getPoints() {
        return points;
    }
    public void joueUnCoup() {
// Génération d’un nouveau bloc
Bloc b = new Bloc();
// Présentation du bloc et des colonnes au joueur
System.out.println("Nouveau bloc de " + b.getNbCases() + " case(s)");
System.out.println("Dans quelle colonne le placer ?");
int i = 1;
for (Colonne c : colonnes) {
System.out.println("capacité "+c.getNbCases()+"/"+c.getCapacite()+ " Colonne " + i + " : " + c ) ;
i++;
}
// Récupération du choix du joueur
Scanner lire = new Scanner(System.in);
i = lire.nextInt();
while ((i < 1) || (i > colonnes.length) || !colonnes[i - 1].estRemplissable()) {
System.out.println("Colonne inexistante ou non remplissable, reessayez !");
i = lire.nextInt();
}
// Ajout du bloc à la colonne choisie
if (colonnes[i - 1].ajoute(b)) {
// Ajout d’un point si la colonne se vide
points++;
}
// Affichage du nombre de points
System.out.println("Vous avez " + points + " points");
System.out.println();
}
    public void joueUnePartie()
    {
        boolean continuBoucle=true;
        boolean auMoinsUneColonneDispo=true;
        boolean test=false;
        while (continuBoucle)
        {continuBoucle=false;
            joueUnCoup();
            for(int i=0; i<colonnes.length;i++)
            {
                if(colonnes[i].estRemplissable())
                {continuBoucle=true;}
            }
        }
    }
    public static void main(String[] args) {
Jeu test=new Jeu(7,8,9);
test.joueUnePartie();
}
}


