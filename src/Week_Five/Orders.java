package Week_Five;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Matthew Panebianco
 *
 * Collects user input to create vehicle objects for
 * order submission
 *
 * @version 0.0.1
 *
 */
public class Orders {

    public static void main(String [] args){
        System.out.println("Matthew Panebianco's Ordering System\n" +
                           "Java for Programmers ISTE-200 2016 Fall\n" +
                           "Homework 5");
        boolean moreToEnter = true;
        Scanner orderInput = new Scanner(System.in);
        List<Object> orders = new ArrayList<>();

        while(moreToEnter == true){
            System.out.println("Do you want to order a: \n\tTruck (T/t)" +
                                "\n\tCar (C/c)\n\tZamboni (Z/z)\n\tBoat(B/b)" +
                                "\n\tBlimp(L/l\n\tScooter(S/s)");
            String orderType = orderInput.next();

            switch(orderType){
                case "T":
                case "t":
                    Truck truckOrder = new Truck();
                    orders.add(truckOrder);
                    break;

                case "C":
                case "c":
                    Car carOrder = new Car();
                    orders.add(carOrder);
                    break;

                case "B":
                case "b":
                    Boat boatOrder = new Boat();
                    orders.add(boatOrder);
                    break;
                case "Z":
                case "z":
                    Zamboni zamboniOrder = new Zamboni();
                    orders.add(zamboniOrder);
                    break;
                case "S":
                case "s":
                    Scooter scooterOrder = new Scooter();
                    orders.add(scooterOrder);
                    break;
                case "L":
                case "l":
                    Blimp blimpOrder = new Blimp();
                    orders.add(blimpOrder);
                    break;
            }
            System.out.print("Do you want to order another vehicle? (y/n)");
            String yesNo = orderInput.next();
            if (yesNo.equals("n") || yesNo.equals("N")){
                moreToEnter = false;
            }
            System.out.println("\n");
        }

        // Prints out the toString of each object located in orders
        for (Object order: orders){ System.out.println(order.toString()); }

        System.out.println("Thank you for using Matthew Panebianco's Ordering System");

        System.exit(0);
    }
}
