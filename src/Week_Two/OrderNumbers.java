package Week_Two;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Matthew Panebianco
 *
 * OrderNumbers asks for 3 numbers from the user,
 * either from the command line or from the System
 * scanner. The three numbers are then sorted from
 * smallest value to largest value, and printed
 * to the user
 *
 */
public class OrderNumbers {

    public static void main(String [] args){

        // If you feel like using the command line
        if(args.length > 0){
            sortInput(Integer.parseInt(args[0]),
                    Integer.parseInt(args[1]),
                    Integer.parseInt(args[2]));
        }
        // If you enjoy using Scanners
        else{
            System.out.println("Ordering 3 whole numbers,"
                    + " by <Matthew Panebianco>");

            // Instantiate Scanner
            Scanner read = new Scanner(System.in);

            // Get variables
            System.out.print("First variable: ");
            int first = read.nextInt();
            System.out.println();
            System.out.print("Second variable: ");
            int second = read.nextInt();
            System.out.println();
            System.out.print("Third variable: ");
            int third = read.nextInt();
            System.out.println();

            // Sort input
            sortInput(first,second,third);
        }
    }

    /*
    *
    * sortInput
    *
    * Receives three integers from Main
    *
    * Through a series of if statements, determines the ascending
    * order of the three integers
    *
    * */

    private static void sortInput(int firstInt, int secondInt, int thirdInt){

        if(firstInt > secondInt){
            if(firstInt > thirdInt){
                if(thirdInt > secondInt){
                    System.out.printf("Ordered numbers are %d, %d, %d\n",
                            secondInt, thirdInt, firstInt);
                }
                else{
                    System.out.printf("Ordered numbers are %d, %d, %d\n",
                            thirdInt, secondInt, firstInt);
                }
            }
            else{
                System.out.printf("Ordered numbers are %d, %d, %d\n",
                        secondInt, firstInt, thirdInt);
            }
        }
        else{
            if(secondInt > thirdInt){
                if(thirdInt > firstInt){
                    System.out.printf("Ordered numbers are %d, %d, %d\n",
                            firstInt, thirdInt, secondInt);
                }
                else{
                    System.out.printf("Ordered numbers are %d, %d, %d\n",
                            thirdInt, firstInt, secondInt);
                }
            }
            else{
                System.out.printf("Ordered numbers are %d, %d, %d\n",
                        firstInt, secondInt, thirdInt);
            }
        }
    }

}

