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
public class AssemblageDeDominos {

    String milieu;
    Domino gauche;
    Domino droite;

    public AssemblageDeDominos() {
        milieu = "";
        droite = null;
        gauche = null;
    }

    public String affiche() {
        String affichage;
        affichage = milieu;
        if (droite != null) {
            affichage = affichage + droite.affiche();
        }
        if (gauche != null) {
            affichage = gauche.affiche() + affichage;
        }
        return affichage;
    }

    public boolean ajouterGauche(Domino dominoGauche) {
        if (gauche != null) {
            if (dominoGauche.getDroite() == gauche.getGauche()) {
                milieu = gauche.affiche() + milieu;
                gauche = dominoGauche;
                return true;
            }
        } else {
            if (gauche == null && droite == null) {
                gauche = dominoGauche;
                return true;
            } else {
                if (droite.getGauche() == dominoGauche.getDroite()) {
                    gauche = dominoGauche;
                    return true;
                }
            }
            

        }

        return false;
    }

    public boolean ajouterDroite(Domino dominoDroite) {
        if (droite != null) {
            if (dominoDroite.getGauche() == droite.getDroite()) {
                milieu =  milieu + droite.affiche();
                droite = dominoDroite;
                return true;
            }
        } else {
            if (droite == null && gauche == null) {
                droite = dominoDroite;
                return true;
            } else {
                if (gauche.getDroite() == dominoDroite.getGauche()) {
                    droite = dominoDroite;
                    return true;
                }
            }
            

        } 

        return false;
    }

    public boolean ajouter(Domino d) {
        if (ajouterDroite(d)) {
            return true;
        } else {
            d.inverser();
            if (ajouterDroite(d)) {
                return true;
            } else {
                if (ajouterGauche(d)) {
                    {
                        return true;
                    }
                } else {
                    d.inverser();
                    if (ajouterGauche(d)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Domino testDomino;
        AssemblageDeDominos assemblage = new AssemblageDeDominos();
        int test;
        int test2;
        do {
            System.out.println(assemblage.affiche());
            test = (int) (Math.random() * ((6) + 1));
            test2 = (int) (Math.random() * ((6) + 1));
            testDomino = new Domino(test, test2);
            System.out.println("Nouveau domino = "+testDomino.affiche());

        } while (assemblage.ajouter(testDomino));
    }
}
