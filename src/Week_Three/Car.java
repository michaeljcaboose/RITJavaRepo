package Week_Three;

import java.util.Scanner;
import java.lang.System;
/**
 * @author Matthew Panebianco
 * @version 0.0.1
 *
 */
public class Car {

    private String _model  = "";
    private String _color  = "";
    private double _cost   = 0.0;
    private String _type   = "";
    private String _towing = "";

    public Car() {
        Scanner carInput = new Scanner(System.in);
        System.out.println("Entering Car Order");
        System.out.print("Model: ");
        set_model(carInput.next());
        System.out.print("Color: ");
        set_color(carInput.next());
        System.out.print("Cost: ");
        set_cost(carInput.nextDouble());

        System.out.print("What type of car is this? \n" +
                            "1. Sedan \n" +
                            "2. Coupe \n" +
                            "3. Wagon \n" +
                            "Choice: ");
        set_type(carInput.nextInt());

        System.out.print("Does this car have a towing package? \n" +
                "1. Yes \n" +
                "2. No \n" +
                "Choice: ");
        set_towing(carInput.nextInt());
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

    public String get_towing() {
        return _towing;
    }

    public String get_type() {
        return _type;
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

    public void set_towing(int _towing) {
        switch (_towing) {
            case 1:
                this._towing = "Sedan";
                break;
            case 2:
                this._towing = "Coupe";
                break;
        }
    }

    public void set_type(int _type) {
        switch (_type) {
            case 1:
                this._type = "Sedan";
                break;
            case 2:
                this._type = "Coupe";
                break;
            case 3:
                this._type = "Wagon";
                break;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
