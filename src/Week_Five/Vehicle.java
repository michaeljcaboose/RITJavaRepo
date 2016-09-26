package Week_Five;

import com.sun.tools.doclets.internal.toolkit.util.DocFinder;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Panebianco on 9/7/16.
 */
public class Vehicle{

    // private variables
    private String _model;
    private String _color;
    private double _cost;

    int count = 0;
    int maxTries = 3;

    public Vehicle(){
        Scanner vehicleInput = new Scanner(System.in);
        System.out.println("Entering Order");
        System.out.print("Model: ");
        set_model(vehicleInput.nextLine());
        System.out.print("Color: ");
        set_color(vehicleInput.nextLine());
        System.out.print("Cost: ");
        // loops to handle in-proper input
        while(true){
            try{
                set_cost(vehicleInput.nextDouble());
                break;
            }
            catch (InputMismatchException e){
                vehicleInput.nextLine();
                if(++count == maxTries) throw e;
                System.out.println("Please insert a valid number (ex: 1000.00). Try: " + count);
            }
        }


    }

    public double get_cost() {
        return _cost;
    }

    public String get_color() {
        return _color;
    }

    public String get_model() {
        return _model;
    }

    public void set_color(String _color) {
        this._color = _color;
    }

    public void set_cost(double _cost) {
        this._cost = _cost;
    }

    public void set_model(String _model) {
        this._model = _model;
    }

    /**
     *
     * Accepts prompt and choices, asks question, prints out choices, and
     * receives the proper choice from User. If user fails to enter a number
     * within the range, else will rerun showMenu. Exception will be caught
     * if user inputs anything other than number, and will rerun showMenu.
     *
     * @param prompt String that contains the question asked by the child class
     * @param choices Array of answers to the prompt question
     * @return An integer received from user scanner input
     */
    public int showMenu(String prompt, String [] choices){
        Scanner menuInput = new Scanner(System.in);
        System.out.println(prompt);
        for(int i = 1; i <= choices.length; i++){
            System.out.println("\t" + i + ") " + choices[i-1]);
        }
        System.out.println();
        System.out.print("Please enter: ");
        try{
            int menuChoice = menuInput.nextInt();
            if (menuChoice >= 1 && menuChoice <= choices.length){
                return menuChoice;
            }
            else{
                System.out.println("Please insert a number within the choice range");
                return showMenu(prompt, choices);
            }

        }
        catch (InputMismatchException e){
            System.out.println("Please insert a properly formatted number (1, 2,.., etc)" + e.getMessage());
            return showMenu(prompt, choices);
        }

    }

    @Override
    public String toString() {
        return "\n\tModel:\t"+ get_model()+
                "\n\tColor:\t"+ get_color()+
                "\n\tCost:\t"+ get_cost();
    }
}
