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
public class First {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
Point a=new Point (-5, -2);

Point b=new Point (2, 3);

Point c=new Point (6, 0);

System.out.println("x de a "+ a.getX());
System.out.println("y de a "+ a.getY());
System.out.println("x de b "+ b.getX());
System.out.println("y de b "+b.getY());
System.out.println("x de c "+ c.getX());
System.out.println("y de c "+c.getY());
System.out.println("0x= "+ Point.getOx());
System.out.println("0y= "+ Point.getOy());
System.out.println("Nbr d'instance = "+ Point.getNbrInstance());
    }
    
    
}