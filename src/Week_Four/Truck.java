package Week_Four;

import java.util.Scanner;

/**
 * @author Matthew Panebianco
 * @version 0.0.1
 *
 *
 */
public class Truck extends Vehicle{

    private String _bodyType = "";
    private String _engine = "";

    // private constants
    final private String [] BODY_SIZE   = {"Half-ton", "Full ton"};
    final private String [] ENGINE     = {"Really big", "Not so big"};


    public Truck(){
        super();
        Scanner truckInput = new Scanner(System.in);
        System.out.print("What size truck is this? \n" +
                "1. Half-ton \n" +
                "2. Full ton \n" +
                "Choice: ");
        set_bodyType(truckInput.nextInt());

        System.out.print("How big is the trucks engine? \n" +
                "1. Really big \n" +
                "2. Not so big \n" +
                "Choice: ");
        set_engine(truckInput.nextInt());
    }

    public String get_bodyType() {
        return _bodyType;
    }

    public void set_bodyType(int _bodyType) {

        switch(_bodyType) {
            case 1:
                this._bodyType = "Half-ton";
                break;
            case 2:
                this._bodyType = "Full ton";
                break;
        }
    }

    public String get_engine() {
        return _engine;
    }

    public void set_engine(int _engine){
        switch(_engine) {
            case 1:
                this._engine = "Half-ton";
                break;
            case 2:
                this._engine = "Full ton";
                break;
        }
    }

    @Override
    public String toString(){
        return  getClass()+  "\n" +
                "\tModel: " + get_model() + "\n" +
                "\tColor: " + get_color()+ "\n" +
                "\tCost: " + get_cost()+ "\n" +
                "\tType: " + get_bodyType()+ "\n" +
                "\tTowing: " + get_engine()+ "\n";
    }

}
