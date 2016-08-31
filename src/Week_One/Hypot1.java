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
import java.util.*;

public class Hypot1{
    public static void main(String [] args){
        double hypotenuse;
        double d1 = 0.0;
        double d2 = 0.0;
        Scanner sc = new Scanner(System.in);
        // Following replaced for using Scanner in Hypot1.java

        try{
            System.out.println("first value of pythag theorem: ");
            d1 = sc.nextDouble();
            System.out.println("second value of pythag theorem: ");
            d2 = sc.nextDouble();
        }
        catch(InputMismatchException ime){
            System.out.println("Arguments need to be numbers.");
            System.exit(2);
        }

        // assuming the two string values entered are really numbers,
        // try to convert them to doubles.
        hypotenuse = Math.sqrt((d1*d1)+(d2*d2));
        System.out.print("The hypotenuse of a right triangle with sides of ");
        System.out.println(d1 + " and " + d2);
        System.out.println(" is " + hypotenuse);

    }
}
