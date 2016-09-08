package Week_Three;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

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
        System.out.println("Matthew Panebianco's Ordering System\n");

        boolean moreToEnter = true;
        Scanner orderInput = new Scanner(System.in);
        List<Object> orders = new ArrayList<>();

        /* While loop is true, continue to ask for orders*/
        while(moreToEnter == true){
            System.out.println("Do you want to order a Truck (T/t) or a Car (C/c) ?");
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
            }
            System.out.print("Do you want to order another vehicle? (y/n)");
            String yesNo = orderInput.next();
            System.out.println("yesNo: " + yesNo);

            // no kicks user out of order loop
            if (yesNo.equals("n") || yesNo.equals("N")){
                moreToEnter = false;
            }

            System.out.println("moreToEnter: " + moreToEnter);
        } // end while

        for (Object order: orders){ System.out.println(order.toString()); }
        System.out.println("Thank you for using Matthew Panebianco's Ordering System");
        System.exit(0);
    }
}
