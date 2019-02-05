/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carte;

import java.util.Random;

/**
 *
 * @author campus
 */
public class JeuDe32CartesPourLaBataille {
    
    Carte[] jeu;
    
    public JeuDe32CartesPourLaBataille()
    {
        jeu=new Carte[32];
        String coul="Coeur";
        String fig="7";
        int val=0;
        for(int i=0;i<32;i++)
        {
            if(i%4==0)
            {coul="Pique";}
            if(i%4==1)
            {coul="Coeur";}
            if(i%4==2)
            {coul="Carreau";}
             if(i%4==3)
            {coul="Trèfle";}
            if(i%8==0)
            {fig="7"; val=i%8;}
            if(i%8==1)
            {fig="8";val=i%8;}
            if(i%8==2)
            {fig="9";val=i%8;}
             if(i%8==3)
            {fig="10";val=i%8;}
             if(i%8==4)
            {fig="Valet";val=i%8;}
             if(i%8==5)
            {fig="Dame";val=i%8;}
             if(i%8==6)
            {fig="Roi";val=i%8;}
              if(i%8==7)
            {fig="As";val=i%8;}
             
            jeu[i]=new Carte(fig,coul,val);
            }
            
        }
    public void battre()
    {
        Random random = new Random();
        int nombrePermut = random.nextInt(33)+32;
        for (int i=0;i<nombrePermut;i++)
        {int premierIndice =random.nextInt(33);
        int deuxiemeIndice =random.nextInt(33);
        Carte tempo= new Carte(jeu[premierIndice].getFigure(),jeu[premierIndice].getCouleur(), jeu[premierIndice].getValeur());
        jeu[premierIndice]=new Carte(jeu[deuxiemeIndice].getFigure(),jeu[deuxiemeIndice].getCouleur(), jeu[deuxiemeIndice].getValeur());
        jeu[deuxiemeIndice]=new Carte(tempo.getFigure(),tempo.getCouleur(), tempo.getValeur());
        }
    }
    public void couper()
    {
        Random random = new Random();
        int nombrePermut = random.nextInt(31);
        
    }
    
    }
    

