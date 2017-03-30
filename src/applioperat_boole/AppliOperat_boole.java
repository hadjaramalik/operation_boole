/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applioperat_boole;

/**
 *
 * @author bar
 */
public class AppliOperat_boole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
   int X=4,Y=8,Z=3,t=7,calcul=0;
   boolean booll;
   booll=X<Y;
   System.out.print("x<y="+booll);
   booll =(X<Y)&(Z==t);
   System.out.println("(x<y)&(z==t)="+booll);
   booll=(X<Y)|(Z==t);
   System.out.println("(X<Y)|(Z==t)="+booll);
   booll=(X<Y)&&(Z==t);
   System.out.println("(X<Y)&&(Z==t)="+booll);
   booll=(X<Y)||(Z==t);
   System.out.println("(X<Y)||(Z==t)="+booll);
   booll=(X<Y)||((calcul=Z)==t);
   System.out.println("(X<Y)||((calcul=Z)==t)="+booll+"**calcul="+calcul);
   booll=(X<Y)|((calcul=Z)==t);
   System.out.println("(X<Y)|((calcul=Z)==t)="+booll+"**calcul="+calcul);
   
   
   
   
   
   
   }
    
}
