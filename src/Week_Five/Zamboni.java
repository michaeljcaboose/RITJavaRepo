package Week_Five;

/**
 * Created by Panebianco on 9/20/16.
 */
public class Zamboni extends Vehicle {

    private String _engineType = "";
    private String _tractorPulled = "";

    public Zamboni(){
        super();

    }

    // Getters
    public String getEngineType(){
        return _engineType;
    }

    public String getTractorPulled(){
        return _tractorPulled;
    }

    // Setters
    public void setEngineType(int inEngineType){
        switch(inEngineType){
            case(1):
                _engineType = "Fuel Powered";
            case(2):
                _engineType = "Electric Powered";
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

}
