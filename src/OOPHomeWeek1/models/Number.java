package OOPHomeWeek1.models;

import OOPHomeWeek1.utils.UtilsArithmetic;

public class Number {

    private double value;

    public Number(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        if (value == 0) {
            System.out.println("Wrong data\n");
            return;
        }
        this.value = value;
    }

    //operations
    public Number add(Number num2) {
        return new Number(this.getValue() + num2.getValue());
    }

    public Number sub(Number num2) {
        return new Number(this.getValue() - num2.getValue());
    }

    public Number mult(Number num2) {
        return new Number(this.getValue() * num2.getValue());
    }

    public Number div(Number num2) {
        if (num2.getValue() == 0) {
            System.out.print("Wrong data: division to 0!\n");
            return null;
        }
        return new Number(this.getValue() / num2.getValue());
    }

    public Number pow(Number num2) {
        return new Number((int)Math.pow(this.getValue(), num2.getValue()));
    }

    public Number fact() {
        return new Number(UtilsArithmetic.factorialOfNumber((int)this.getValue()));
    }

    public Number rem(Number num2) {
        return new Number(this.getValue() % num2.getValue());
    }

    public boolean comp(Number num2) {
        return this.getValue() == num2.getValue();
    }
}