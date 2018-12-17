/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo;

/**
 *
 * @author campus
 */
public class ALGO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        double temperature=0;
//        
//        System.out.println("entrer la temperature");
//        temperature=Clavier.readDouble();
//        
//        if (temperature<0)
//        {
//          System.out.println("Solide");  
//        } 
//        
//        else if (temperature>100) 
//                {
//                System.out.println("Gazeuse");  
//                }   
//            else 
//                {
//                    System.out.println("Liquide"); 
//                }

//        double nbr=0;
//        System.out.println("entrer un nombre");
//        nbr=Clavier.readDouble();
//         if (nbr<0)
//        {
//          System.out.println("Negatif");  
//        } 
//        
//        else  
//                {
//                System.out.println("Positif");  
//                }
//        double chiffre1;
//        double chiffre2;
//        double chiffre3;
//        double temp;
//
//        System.out.println("entrer le nombre n°1 ");
//        chiffre1=Clavier.readDouble();
//        System.out.println("entrer le nombre n°2 ");
//        chiffre2=Clavier.readDouble();
//        System.out.println("entrer le nombre n°3 ");
//        chiffre3=Clavier.readDouble();
//        
//        if (chiffre1>chiffre2)
//        {
//            temp=chiffre1;
//            chiffre1=chiffre2;
//            chiffre2=temp;
//        }
//        if (chiffre1>chiffre3)
//            {
//            temp=chiffre1;
//            chiffre1=chiffre3;
//            chiffre3=temp;
//            } 
//       if (chiffre2>chiffre3)
//            {
//             temp=chiffre2;
//             chiffre2=chiffre3;
//             chiffre3=temp;
//             }
//        System.out.println(chiffre1 + " , "+ chiffre2 + " , " + chiffre3);
//        double A,B,C,D,resultat;
//        System.out.println("entrer le nombre A ");
//        A=Clavier.readDouble();
//        System.out.println("entrer le nombre B ");
//        B=Clavier.readDouble();
//        System.out.println("entrer le nombre C ");
//        C=Clavier.readDouble();
//        System.out.println("entrer le nombre D ");
//        D=Clavier.readDouble();
//        
//        if (B<=C)
//        {  { resultat = 0;}
//             if (B<=D)
//            { resultat = ;}
//                else if (C<=B)
//                {
//                    if (C<=A)
//                    {resultat=B-A;}
//                    else 
//                    { resultat=B-C;}
//                }
//        }
        //     Question 4
//        int n;
//        n=Clavier.readInt();
//        
//        {for(int j=0;j<n;j++)
//        {System.out.print("*");}
//        System.out.print("\n");
//         for(int k=0;k<n-2;k++)
//         {System.out.print("*");
//            for(int l=0;l<n-2;l++)
//                {System.out.print("-");}
//            
//        System.out.println("*");
//         
//                 
//        
//                }
//        }
//        for(int j=0;j<n;j++)
//        {System.out.print("*");
//       }
//        System.out.println("");
        //Question 6
//         int n;
//        n=Clavier.readInt();
//        int j;
//        int k;
//        
//        for( j=0;j<n-1;j++)         // 1ere ligne
//            {System.out.print("-");}
//        {System.out.print("*");}
//            for( j=0;j<n-1;j++)
//            {System.out.print("-");}
//        System.out.println(""); 
//
//        for( k=0;k<n-2;k++) // les x lignes du milieu
//        {   for( j=0;j<n-2-k;j++)
//                {System.out.print("-");}
//            {System.out.print("*");}
//            for( j=0;j<2*k+1;j++)
//                {System.out.print("-");}
//            {System.out.print("*");}
//            for( j=0;j<n-k-2;j++)
//                {System.out.print("-");}
//            System.out.println("");  
//        }
//        
//         for( j=0;j<2*n-1;j++) //la derniere lignes
//            {System.out.print("*");}
//         System.out.println("");
//         
//    
//   j=0;
//   k=0;
//   int i=0;
//   int x=0;
//   int y=0;
//   double m=0;
//   m=n;
//   for(y=0;y<n;y++)
//   {
//   for(i=y%2;i<n+y%2;i++)
//   {
//       j=0;
//      k=0;
//   for(k=0+i%2;k<n+i%2;k++)
//   {
//       
//       for(j=k;j%2>0;j++)
//   {
//        for(x=0;x<n;x++)
//       {
//       {System.out.print("+");}
//       }
//       }
//   for(j=k;j%2<1;j++)
//   {
//       for(x=0;x<n;x++)
//       {
//       {System.out.print("*");}
//       }
//       }
//   
//   }
//   
//   
//   System.out.println("");
//   }
//    
//   
//}
//for(y=0;y<n;y++)
//{
//for(x=1;x<=n*n;x++)
//{for(y=x%(2*n);y%(2*n)<n;y++)
//    {
//for(i=0;i<n;i++)
//{
//    for(j=i%2;j%2<1;j++)
//    {for(k=0;k<n;k++)
//    {
//        System.out.print("*");
//    }
//    }
//    for(j=i%2;j%2>0;j++)
//    {for(k=0;k<n;k++)
//    {
//        System.out.print("z");
//    }
//    }
//{
//    
//}
//}
//System.out.println("");
//}
//}
        double note = 1;
        double moyenne = 0;
        double min=20;
        double max=0;
        int tailleTableau = 1;
        System.out.println("Entrer la taille du tableau  :");
        tailleTableau = Clavier.readInt();

        double[] tab = new double[tailleTableau];
        int i = 0;

        do {
            do {
                System.out.println("Entrer une Note (entre 0 et 20) :");
                note = Clavier.readDouble();
            } while (note > 20 || note < 0);
            tab[i] = note;
            i++;
        } while (i < tailleTableau);

        for (int j = 0; j < tailleTableau; j++) {
            if (min>tab[j])
            {
                min=tab[j];
            }
            if (max<tab[j])
            {
                max=tab[j];
            }
            moyenne = moyenne + tab[j];
        }

        moyenne = moyenne / tab.length;
        System.out.println("la moyenne est :" + moyenne);
        System.out.println("Min : " + min + "Max : "+ max);
    }

}
