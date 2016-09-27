package Week_Five;

/**
 * Created by Panebianco on 9/20/16.
 */
public class Zamboni extends Vehicle implements Vinfo {

    private String _engineType = "";
    private String _tractorPulled = "";
    private double _gasMilage = 0.0;

    // PUBLIC CONSTANTS
    // Zamboni
    final private String [] ENGINE_TYPE = {"Electric Powered", "Fuel Powered"};
    final private String [] TRACTOR = {"Yes", "No"};
    final private double [] ZAMBO_MPG = {0.0, 15.0};


    /**
     * Zamboni Constructor class
     */
    public Zamboni(){
        super();
        setEngineType(showMenu("What type of engine is needed?", ENGINE_TYPE));
        setTractorPulled(showMenu("Is the zamboni tractor pulled?", TRACTOR));
        setGasMilage();
    }

    // Getters
    public String getEngineType(){
        return _engineType;
    }

    public String getTractorPulled(){
        return _tractorPulled;
    }

    public double getGasMilage(){
        return _gasMilage;
    }

    // Setters
    public void setEngineType(int inEngineType){
        switch(inEngineType){
            case(1):
                _engineType = "Electric Powered";
                break;
            case(2):
                _engineType = "Fuel Powered";
                break;
        }
    }

    public void setTractorPulled(int inTractorPulled){
        switch(inTractorPulled){
            case(1):
                _tractorPulled = "Yes";
                break;
            case(2):
                _tractorPulled = "No";
                break;
        }
    }

    public void setGasMilage() {
        _gasMilage = gasMilage();
    }

    /**
     * gasMilage checks whether the engine is electric or if the zamboni is a tractor.
     * If it is either of those, there is no gas milage. Else, the zamboni has 15 mpg.
     * @return either 0.0 or 15.00
     */
    public double gasMilage(){

        if (getTractorPulled().equals("YES") || getTractorPulled().equals("Electric Powered")) {
            return ZAMBO_MPG[0];
        }
        else {
            return ZAMBO_MPG[1];
        }
    }

    /**
     * Generic toString
     * @return all setters and class name.
     */
    public String toString(){
        return getClass() + "\n"+
                "\tModel: " + get_model() + "\n" +
                "\tColor: " + get_color()+ "\n" +
                "\tCost: " + get_cost()+ "\n" +
                "\tMPG: " + getGasMilage() + "\n" +
                "\tType: " + getEngineType()+ "\n" +
                "\tTowing: " + getTractorPulled()+ "\n";
    }

}
