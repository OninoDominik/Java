/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garbage;

/**
 *
 * @author campus
 */

public class PourVoirLeRM {

    private static int nbInstances ;
    private int numero;
    
    static {
    nbInstances =0;
    }

    public PourVoirLeRM() {
        nbInstances++;
        numero = nbInstances;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("L'instance détruite est la " + numero
                + " lorsque " + nbInstances + " ont été créées");
    }
}
