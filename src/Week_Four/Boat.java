package Week_Four;

import java.util.Scanner;

/**
 * Created by Panebianco on 9/8/16.
 */
public class Boat extends Vehicle {
    private String _boatType = "";
    private String _material = "";

    // PRIVATE CONSTANTS
    final private String [] BOAT_TYPE = {"Pontoon", "PWC", "Sailboat"};
    final private String [] MATERIAL = {"Wood", "Fiberglass", "Steel"};


    public Boat(){
        super();
        Scanner boatInput = new Scanner(System.in);
        showMenu("What type of boat is this?", BOAT_TYPE);
        set_boatType(boatInput.nextInt());
        showMenu("What is the boat made of?", MATERIAL);
        set_material(boatInput.nextInt());
    }

    public String get_boatType() {return _boatType;}
    public String get_material() {return _material;}

    public void set_boatType(int _boatType) {
        switch (_boatType) {
            case 1:
                this._boatType = "Pontoon";
                break;
            case 2:
                this._boatType = "PWC";
                break;
            case 3:
                this._boatType = "Sailboat";
                break;
        }
    }

    public void set_material(int _material) {
        switch (_material){
            case 1:
                this._material = "Wood";
                break;
            case 2:
                this._material = "Fiberglass";
                break;
            case 3:
                this._material = "Steel";
                break;
        }
    }

    @Override
    public String toString(){
        return getClass()+  "\n" +
                "\tModel: " + get_model() + "\n" +
                "\tColor: " + get_color()+ "\n" +
                "\tCost: " + get_cost()+ "\n" +
                "\tType: " + get_boatType()+ "\n" +
                "\tTowing: " + get_material()+ "\n";
    }
}
