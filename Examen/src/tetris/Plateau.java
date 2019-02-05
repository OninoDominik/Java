package tetris; 

import java.util.Scanner;

public class Plateau { // Dominik Grobecker

    private Ligne[] plateau;
    private int score;
    
    public Plateau(int nbLignes, int nbColonnes)
    {
        
        plateau =new Ligne[nbLignes];
        Ligne ligne= new Ligne(nbColonnes);
        for(int i=0;i<nbLignes;i++)
        {plateau[i]=ligne;}
        
    }

    public int getScore() {
        return score;
    }
    
    
   private boolean insertable(Bloc b, int colonne, int ligne) {
        boolean stuck = false;
        if (ligne == 0) {
            if (b.getCase(2) || b.getCase(3)) {
                stuck = true;
            }
        }
        else {
            Ligne l = plateau[ligne - 1];
            stuck = b.getCase(2) && l.getCase(colonne + 1) ||
                    b.getCase(3) && l.getCase(colonne);
        }
        Ligne l = plateau[ligne];
        stuck = stuck || b.getCase(0) && l.getCase(colonne) ||
                b.getCase(1) && l.getCase(colonne + 1);
        return !stuck;
    }
    
    private boolean crush(int ligne) {
        if (plateau[ligne].estPleine()) {
            for (int i = ligne; i < plateau.length - 1; i++) {
                plateau[i] = plateau[i + 1];
            }
            plateau[plateau.length - 1] = new Ligne(plateau[ligne].getCapacite());
            score++;
            return true;
        }
        return false;
    }
    
    private void grow(Ligne[] p, int ligne, int colonne) {
        if (ligne < p.length && colonne >= 0 &&
                colonne < p[ligne].getCapacite() &&
                !p[ligne].getCase(colonne) &&
                plateau[ligne].getCase(colonne)) {
            p[ligne].setCase(colonne);
            grow(p, ligne, colonne - 1);
            grow(p, ligne, colonne + 1);
            grow(p, ligne + 1, colonne);
        }
    }
    
    private boolean crushAll() {
        boolean crushed = false;
        Ligne base = plateau[0];
        Ligne[] p = new Ligne[plateau.length];
        for (int i = 0; i < p.length; i++) {
            p[i] = new Ligne(base.getCapacite());
        }
        for (int i = 0; i < base.getCapacite(); i++) {
            grow(p, 0, i);
        }
        for (int i = 1; i < p.length; i++) {
            Ligne cible = p[i];
            Ligne source = plateau[i];
            for (int j = 0; j < cible.getCapacite(); j++) {
                if (source.getCase(j) && !cible.getCase(j)) {
                    p[i - 1].setCase(j);
                    crushed = true;
                }
            }
        }
        plateau = p;
        return crushed;
    }
    
    private void insert(Bloc b, int colonne, int ligne) {
        int top = plateau.length - 1;
        boolean crushed = false;
        Ligne l = plateau[ligne];
        if (b.getCase(0)) {
            l.setCase(colonne);
        }
        if (b.getCase(1)) {
            l.setCase(colonne + 1);
        }
        if (crush(ligne)) {
            top--;
            crushed = true;
        }
        if (ligne > 0) {
            l = plateau[ligne - 1];
            if (b.getCase(2)) {
                l.setCase(colonne + 1);
            }
            if (b.getCase(3)) {
                l.setCase(colonne);
            }
            if (crush(ligne - 1)) {
                top--;
                crushed = true;
            }
        }
        while (crushed) {
            do {
                crushed = crushAll();
            } while (crushed);
            for (int i = top; i >= 0; i--) {
                if (crush(i)) {
                    top--;
                    crushed = true;
                }
            }
        }
    }
    
    public boolean insert(Bloc b, int colonne) {
        int ligne = 0;
        for (int i = plateau.length - 1; i >= 0; i--) {
            if (!insertable(b, colonne, i)) {
                ligne = i + 1;
                break;
            }
        }
        if (ligne < plateau.length) {
            insert(b, colonne, ligne);
            return true;
        }
        return false;
    }
    
    public void affiche() {
        for (int i = plateau.length - 1; i >= 0; i--) {
            Ligne l = plateau[i];
            for (int j = 0; j < l.getCapacite(); j++) {
                if (l.getCase(j)) {
                    System.out.print("X");
                }
                else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int nbLignes = 5;
        int nbColonnes = 4;
        Scanner sc = new Scanner(System.in);
        Plateau p = new Plateau(nbLignes, nbColonnes);
        try {
            Bloc b;
            int colonne;
            do {
                p.affiche();
                b = new Bloc();
                System.out.println("Nouveau bloc :");
                boolean pivoter = true;
                while (pivoter) {
                    b.affiche();
                    System.out.print("Pivoter ce bloc ? ");
                    String reponse = sc.nextLine();
                    if (reponse.equalsIgnoreCase("o")) {
                        b.pivoter();
                    }
                    else {
                        pivoter = false;
                    }
                }
                do {
                    System.out.print("Dans quelle colonne placer ce bloc : ");
                    colonne = Integer.parseInt(sc.nextLine());
                    if (colonne == nbColonnes - 1 && (b.getCase(1) || b.getCase(2))) {
                        colonne = -1;
                    }
                } while (colonne < 0 || colonne >= nbColonnes);
            } while (p.insert(b, colonne));
        }
        catch (NumberFormatException ex) {
            System.out.println("Partie interrompue");
        }
        System.out.println("Votre score : " + p.getScore());
    }
}
