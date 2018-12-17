/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exoalgo.Scrabble;

import exoalgo.Clavier;

/**
 *
 * @author campus
 */
public class Reglet {

    private Jeton[] reglet = new Jeton[7];
    private short n;
    private Jeton[] regletTempo= new Jeton[7];
    private short nTempo =0;

    public short getN() {
        return n;
    }

    public Reglet() {
        this.reglet[0] = null;
        this.n = 0;
    }

    public boolean ajoute(char c) {
        if ((c >= 'A') && (c <= 'Z') && (n<7)) {
            reglet[n] = new Jeton(c);
            n++;
            return true;
        } else {
            return false;
        }
    }
    public void ajouteTempo(char c) {
        
            regletTempo[nTempo] = new Jeton(c);
            nTempo++;
        
    }

    public int position(char c) {
        int position = -1;
        for (int i = 0; i <= n; i++) {
            if (reglet[i].getLettre() == c) {
                position = i;
                break;
            }
        }
        return position;
    }

    public boolean retire(char c) {
        for (int i = 0; i <= n; i++) {
            if (reglet[i].getLettre() == c) {
                for (int j = i; j < n; j++) {
                    if (j==(n-1)){
                        reglet[j].setLettre('1');
                        n--;
                    }else{
                    
                    reglet[j].setLettre(reglet[j + 1].getLettre());}
                }
return true;
            }
            
           
        }
        
        return false;
    }
    public boolean secrit(String s) {
        char test;
        boolean[] testEcrit = new boolean[s.length()];
        for(int i=0;i<s.length();i++)
        {
            testEcrit[i]=false;
        }
        for(int i=0;i<n;i++)
        {
        this.ajouteTempo(reglet[i].getLettre());
        }
        for (int i=0;i<s.length();i++)
        {
            
                if (this.retire(s.charAt(i)))
                {
                    testEcrit[i]=true;
                }
  
        }
        for (int i=0; i<s.length();i++)
        {
            if (testEcrit[i]==false)
            { 
                n=0;
                for (int j=0;j<nTempo;j++)
        {
            
             this.ajoute(regletTempo[j].getLettre());
        }
                return false;}
        }
        n=0;
        for (int j=0;j<nTempo;j++)
        {
             this.ajoute(regletTempo[j].getLettre());
        }
        return true;
      
    } // finsecrit
    
    public static void main(String[] args) {
        Reglet jeu =new Reglet();
        char entree;
        boolean stop =true;
        String entreeString;
        for (int i=0;i<7;i++)
        {
            System.out.println("ajoute lettre dans ta reglette");
        entree= Clavier.readChar();
        jeu.ajoute(entree);}
        
        System.out.println("mot a tester ");
        entreeString=Clavier.readString();
        if (jeu.secrit(entreeString))
        { 
            System.out.println("ok ");
        }
        else
        {
            System.out.println("pas ok ");
        }
        for (int i=0;i<jeu.getN();i++)
        {
            jeu.reglet[i].affiche(); 
        }
        
        
   
    }
    
}

    
    

