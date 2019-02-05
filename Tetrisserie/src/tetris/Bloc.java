/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tetris;
import java.util.Random ;

/**
 *
 * @author campus
 */
public class Bloc {
    
    private int nbCases;
    private static Random rand1 = new Random();
    
    public Bloc()
{
    int test = (rand1.nextInt(4))+1;
    nbCases= test;
}

    public int getNbCases() {
        return nbCases;
    }
    
}

