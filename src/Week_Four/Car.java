package Week_Four;

import java.util.Scanner;

/**
 * @author Matthew Panebianco
 * @version 0.0.1
 *
 */
public class Car extends Vehicle {

    private String _type   = "";
    private String _towing = "";

    // PUBLIC CONSTANTS
    // cars
    final private String [] TOWING = {"Towing package", "No towing package"};
    final private String [] CAR_TYPE = {"Sedan", "Coupe", "Wagon"};

    public Car() {
        super();
        Scanner carInput = new Scanner(System.in);
        showMenu("What type of car is this?", CAR_TYPE);
        set_type(carInput.nextInt());
        showMenu("Does this car have a towing package?", TOWING);
        set_towing(carInput.nextInt());
    }


    public String get_towing() {
        return _towing;
    }
    public String get_type() {return _type;}

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
        return  getClass() + "\n"+
                "\tModel: " + get_model() + "\n" +
                "\tColor: " + get_color()+ "\n" +
                "\tCost: " + get_cost()+ "\n" +
                "\tType: " + get_type()+ "\n" +
                "\tTowing: " + get_towing()+ "\n";
    }
}
