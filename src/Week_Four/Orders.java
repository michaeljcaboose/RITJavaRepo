package Week_Four;

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
                           "Homework 4 ");
        boolean moreToEnter = true;
        Scanner orderInput = new Scanner(System.in);
        List<Object> orders = new ArrayList<>();

        while(moreToEnter == true){
            System.out.println("Do you want to order a Truck (T/t),  Car (C/c), or Boat(B/b) ?");
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
