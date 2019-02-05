/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exo1;

/**
 *
 * @author campus
 */
public class CompletementBidon {

    //private static int tableDes737[]=new int [100];
    private static int[] tableDes737;

   

    static {
        tableDes737 = new int[100];
        for (int i = 0; i < tableDes737.length; i++) {
            tableDes737[i] = i * 737;
        }

    }
     public static int getIntDeTableDes737(int i) {
        return tableDes737[i];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i+"*737= "+getIntDeTableDes737(i));
        }
    }
}
