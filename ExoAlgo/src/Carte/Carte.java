/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carte;

/**
 *
 * @author campus
 */
public class Carte {
    
    private String couleur="";
    private String figure;
    private int valeur=0;
    
    public Carte(String figure)
    { 
        this.figure=figure;
    }
    public Carte(String figure,String couleur)
    { 
        this.figure=figure;
        this.couleur=couleur;
    }
    public Carte(String figure,String couleur,int valeur)
    { 
        this.figure=figure;
        this.couleur=couleur;
        this.valeur=valeur;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getFigure() {
        return figure;
    }

    public int getValeur() {
        return valeur;
    }
    
    
}
