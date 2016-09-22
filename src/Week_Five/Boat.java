package Week_Five;

/**
 * @author Matthew Panebianco
 */
public class Boat extends Vehicle implements Vinfo{

    //private variables
    private String _boatType = "";
    private String _material = "";

    // PRIVATE CONSTANTS
    final private String [] BOAT_TYPE = {"Pontoon", "PWC", "Sailboat"};
    final private String [] MATERIAL = {"Wood", "Fiberglass", "Steel"};
    final private double [] BOAT_MPG = {20.00, 12.00, 0.0};

    // class initializer
    public Boat(){
        super();
        set_boatType(showMenu("What type of boat is this?", BOAT_TYPE));
        set_material(showMenu("What is the boat made of?", MATERIAL));
    }

    // Getters
    public String get_boatType() {return _boatType;}
    public String get_material() {return _material;}


    // Setters
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

    public double gasMilage(){
        switch(get_boatType()){
            case "Pontoon":
                return BOAT_MPG[0];
            case "PWC":
                return BOAT_MPG[1];
            case "Sailboat":
                return BOAT_MPG[2];
            default:
                return 0.000;
        }
    }

    @Override
    public String toString(){
        return  getClass() + "\n"+
                "\tModel: " + get_model() + "\n" +
                "\tColor: " + get_color()+ "\n" +
                "\tCost: " + get_cost()+ "\n" +
                "\tMPG: " + gasMilage() + "\n" +
                "\tType: " + get_boatType()+ "\n" +
                "\tTowing: " + get_material()+ "\n";
    }
}
