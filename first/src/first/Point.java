/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

/**
 *
 * @author campus
 */
public class Point {
    private int x;
    private int y;
    private static int Ox =0;
    private static int Oy =0;
    private static int nbrInstance=0;
    
    public Point(int x,int y) {
    this.x=x;
    this.y=y;
    this.nbrInstance++;
    }
    public int getX(){
        return this.x;
}
    public int getY(){
        return this.y;
}
    public static int getOx(){
    return Ox;
}
    static public int getOy(){
    return Oy;
}
    static public int getNbrInstance(){
        return nbrInstance;
}
}
