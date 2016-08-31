package Week_Three;

/**
 * @author Matthew Panebianco
 * @version 0.0.1
 *
 *
 */
public class Truck {

    private String _model = "";
    private String _color = "";
    private double _cost = 0.0;
    private String _bodyType = "";
    private String _engine = "";

    public String get_model() {
        return _model;
    }

    public void set_model(String _model) {
        this._model = _model;
    }

    public String get_color() {
        return _color;
    }

    public void set_color(String _color) {
        this._color = _color;
    }

    public double get_cost() {
        return _cost;
    }

    public void set_cost(double _cost) {
        this._cost = _cost;
    }

    public String get_bodyType() {
        return _bodyType;
    }

    public void set_bodyType(String _bodyType) {
        this._bodyType = _bodyType;
    }

    public String get_engine() {
        return _engine;
    }

    public void set_engine(String _engine) {
        this._engine = _engine;
    }

}
