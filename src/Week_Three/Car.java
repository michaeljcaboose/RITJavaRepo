package Week_Three;

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

    public void set_towing(String _towing) {
        this._towing = _towing;
    }

    public void set_type(String _type) {
        this._type = _type;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
