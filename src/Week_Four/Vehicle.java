package Week_Four;

import java.awt.*;
import java.util.Scanner;

/**
 * Created by Panebianco on 9/7/16.
 */
public class Vehicle {

    // private variables
    private String _model  = "";
    private String _color  = "";
    private double _cost   = 0.0;

    public Vehicle(){
        Scanner vehicleInput = new Scanner(System.in);
        System.out.println("Entering Order");
        System.out.print("Model: ");
        set_model(vehicleInput.nextLine());
        System.out.print("Color: ");
        set_color(vehicleInput.nextLine());
        System.out.print("Cost: ");
        set_cost(vehicleInput.nextDouble());
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

    public int showMenu(String prompt, String [] choices){
        Scanner menuInput = new Scanner(System.in);
        System.out.println(prompt);
        for(int i = 1; i <= choices.length; i++){
            System.out.println("\t" + i + ") " + choices[i-1]);
        }
        System.out.println();
        System.out.print("Please enter: ");

        return menuInput.nextInt();
    }

}
