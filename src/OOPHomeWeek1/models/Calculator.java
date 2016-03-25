package OOPHomeWeek1.models;

public class Calculator {

    public Number add(Number num1, Number num2) {
        return new Number(num1.getValue()).add(num2);
    }

    public Number sub(Number num1, Number num2) {
        return new Number(num1.getValue()).sub(num2);
    }

    public Number mult(Number num1, Number num2) {
        return new Number(num1.getValue()).mult(num2);
    }

    public Number div(Number num1, Number num2) {
        return new Number(num1.getValue()).div(num2);
    }
}
