package Week_One;

/*
   This program will compute the hypotenuse of a right triangle
   using the Pythagorean theorem:
   (a*a)+(b*b)=(c*c)
   where a, b are the two shorter sides of the triangle and c is
   the longest side.

   When you run the program, pass the lengths of the two shorter
   sides of the triangle in as parameters on the command line.
   For example:
      java Hypot 7 12

   This code does contain a few errors that will be detected by the
   compiler.
*/

import java.lang.Math;
import java.lang.Double;

public class Hypot{
    public static void main(String [] args){
        double hypotenuse;
        double d1 = 0.0;
        double d2 = 0.0;

        // Following replaced for ysing Scanner in Hypot1.java

        // verify that two argyments were entered on the command line
        if (args.length !=2){
            System.out.println("You need to enter two args");
            System.exit(1);
        }

        // assuming the two string values entered are really numbers,
        // try to convert them to doubles.

        try{
            d1 = Double.parseDouble(args[0]);
            d2 = Double.parseDouble(args[1]);
        }  // Non numbers entered, catch the error and gracefully exit
        catch(NumberFormatException nfe){
            System.out.println("Arguments need to be numbers.");
            System.exit(2);
        }

        hypotenuse = Math.sqrt((d1*d1)+(d2*d2));
        System.out.print("The hypotenuse of a right triangle with sides of ");
        System.out.println(d1 + " and " + d2);
        System.out.println(" is " + hypotenuse);

    }
}
