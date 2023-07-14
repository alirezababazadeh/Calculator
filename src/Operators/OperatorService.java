package Operators;

public class OperatorService {

    @Operator(name = "+")
    public Double plusValues(Double first, Double second) {
        return first + second;
    }

    @Operator(name = "-")
    public Double minusValues(Double first, Double second) {
        return first - second;
    }

    @Operator(name = "*")
    public Double multipleValues(Double first, Double second) {
        return first * second;
    }

    @Operator(name = "/")
    public Double divisionValues(Double first, Double second) {
        return first * second;
    }

    @Operator(name = "%")
    public Double modValues(Double first, Double second) {
        return 0.0;
    }

    @Operator(name = "|")
    public Double orValues(Double first, Double second) {
        return 0.0;
    }

    @Operator(name = "&")
    public Double andValues(Double first, Double second) {
        return 0.0;
    }

    @Operator(name = "^")
    public Double xorValues(Double first, Double second) {
        return 0.0;
    }

    @Operator(name = "<<")
    public Double shiftLeftValues(Double first, Double second) {
        return 0.0;
    }

    @Operator(name = ">>")
    public Double shiftRightValues(Double first, Double second) {
        return 0.0;
    }
}
