package Week_Four;


/**
 * @author Matthew Panebianco
 * @version 0.0.1
 *
 *
 */
public class Truck extends Vehicle{

    // private variables
    private String _bodyType = "";
    private String _engine = "";

    // private constants
    final private String [] BODY_SIZE   = {"Half-ton", "Full ton"};
    final private String [] ENGINE     = {"Really big", "Not so big"};

    // instantiated class
    public Truck(){
        super();
        set_bodyType(showMenu("What size truck is this?", BODY_SIZE));
        set_engine(showMenu("How big is the truck's engine?", ENGINE));
    }

    // Getters
    public String get_bodyType() {
        return _bodyType;
    }
    public String get_engine() {
        return _engine;
    }

    //Setters
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


    // override toString
    @Override
    public String toString(){
        return  getClass() + "\n"+
                "\tModel: " + get_model() + "\n" +
                "\tColor: " + get_color()+ "\n" +
                "\tCost: " + get_cost()+ "\n" +
                "\tType: " + get_bodyType()+ "\n" +
                "\tTowing: " + get_engine()+ "\n";
    }

}
