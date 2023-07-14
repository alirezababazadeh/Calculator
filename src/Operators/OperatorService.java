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
        return first / second;
    }

    @Operator(name = "%")
    public Double modValues(Double first, Double second) {
        return first % second;
    }

    @Operator(name = "|")
    public int orValues(int first, int second) {
        return first | second ;
    }

    @Operator(name = "&")
    public int andValues(int first, int second) {
        return first & second;
    }

    @Operator(name = "^")
    public int xorValues(int first, int second) { return first ^ second;}

    @Operator(name = "<<")
    public int shiftLeftValues(int first, int second) {
        return first << second ;
    }

    @Operator(name = ">>")
    public int shiftRightValues(int first, int second) {
        return first >> second;
    }
}
