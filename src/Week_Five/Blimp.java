package Week_Five;
/*
*  Purpose : this is the truck type vehicle class that contains the shared compononent
*  and allows access to the methods.
// the base class of ordered by blimp type
*  Date : 9/19/2016
*  Author : Alexandr Opalka
*/

import java.lang.*;
public class Blimp extends Vehicle{
   // Class Variables
   final String[] BLIMPSIZE = {"100 ","200 ","300 ","500 ","750"};
   final String[] BLIMPGAS = {"Helium" , "Hydrogen"};
   
   private String blimpSize;
   private String blimpGas;
   // Constructor that contains Menu
   public Blimp()
   {
      super();
      setSize(showMenu(" What size is this blimp? ( in FT. )", BLIMPSIZE));
      setGas(showMenu(" What gas is in this blimp ?" , BLIMPGAS));
      configureMPG();
   }

   // Mutators
   public void setSize( int t )
   {
      String t1 = BLIMPSIZE[t-1];
      blimpSize = t1;
   }
   public void setGas( int t )
   {
      String t1 = BLIMPGAS[t-1];
      blimpGas = t1;
   }
   // Accessors
   public String getSize()
   {
      return blimpSize;
   }
   public String getGas()
   {
      return blimpGas;
   }
      // Set up MPG
   public void configureMPG()
   {
     double m = 0;
     m = 50 -( Math.sqrt( get_cost() ) / 10.0 );
   }
   // To String used for printing the Blimp object.
   public String toString()
   {
      System.out.println("Blimp:");
      System.out.println("Size: "+ getSize());
      System.out.println("Gas Type: " + getGas());  
      System.out.println("");
      return "";
   }
   
}