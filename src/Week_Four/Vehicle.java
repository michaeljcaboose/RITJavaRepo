package Week_Four;

/**
 * Created by Panebianco on 9/7/16.
 */
public class Vehicle {

    private String _model  = "";
    private String _color  = "";
    private double _cost   = 0.0;

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

}
