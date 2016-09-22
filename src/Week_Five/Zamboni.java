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
            case(2):
                _engineType = "Fuel Powered";
        }
    }

    public void setTractorPulled(int inTractorPulled){
        switch(inTractorPulled){
            case(1):
                _tractorPulled = "Yes";
            case(2):
                _tractorPulled = "No";
        }
    }

    public void setGasMilage() {
        _gasMilage = gasMilage();
    }

    public double gasMilage(){

        if (getTractorPulled().equals("YES") || getTractorPulled().equals("Electric Powered")) {
            return 0.0;
        }
        else {
            return 15.00;
        }

    }

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
