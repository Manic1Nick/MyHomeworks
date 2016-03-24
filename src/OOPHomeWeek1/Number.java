package OOPHomeWeek1;

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
            System.out.println("Wrong data");
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

    //test
    public boolean test(Number number, Number num2) {

        boolean exp = true;

        boolean factAdd = (number.add(num2)).getValue() ==
                            UtilsArithmetic.additionNum1Num2(number.getValue(), num2.getValue());
        System.out.printf("method %s, res %s, exp %s = fact %s", "add", exp == factAdd, exp, factAdd);
        printOk(factAdd);

        boolean factSub = (number.sub(num2)).getValue() ==
                            UtilsArithmetic.subtractionNum1Num2(number.getValue(), num2.getValue());
        System.out.printf("method %s, res %s, exp %s = fact %s", "sub", exp == factSub, exp, factSub);
        printOk(factSub);

        boolean factMult = (number.mult(num2)).getValue() ==
                            UtilsArithmetic.multiplicationNum1Num2(number.getValue(), num2.getValue());
        System.out.printf("method %s, res %s, exp %s = fact %s", "mult", exp == factMult, exp, factMult);
        printOk(factMult);

        boolean factDiv = (number.div(num2)).getValue() ==
                            UtilsArithmetic.divisionNum1Num2(number.getValue(), num2.getValue());
        System.out.printf("method %s, res %s, exp %s = fact %s", "div", exp == factDiv, exp, factDiv);
        printOk(factDiv);

        boolean factPow = (number.pow(num2)).getValue() ==
                            UtilsArithmetic.involutionNum1Num2(number.getValue(), num2.getValue());
        System.out.printf("method %s, res %s, exp %s = fact %s", "pow", exp == factPow, exp, factPow);
        printOk(factPow);

        boolean factFact = (number.fact()).getValue() ==
                            UtilsArithmetic.factorialOfNumber((int)number.getValue());
        System.out.printf("method %s, res %s, exp %s = fact %s", "fact", exp == factFact, exp, factFact);
        printOk(factFact);

        boolean factRem = (number.rem(num2)).getValue() ==
                            UtilsArithmetic.remainderNum1Num2(number.getValue(), num2.getValue());
        System.out.printf("method %s, res %s, exp %s = fact %s", "rem", exp == factRem, exp, factRem);
        printOk(factRem);

        boolean factComp = (number.comp(num2) ==
                            UtilsArithmetic.comparisonNum1Num2(number.getValue(), num2.getValue()));
        System.out.printf("method %s, res %s, exp %s = fact %s", "comp", exp == factRem, exp, factComp);
        printOk(factComp);

        return (factAdd == true && factSub == true && factMult == true && factDiv == true &&
                factPow == true && factFact == true && factRem == true && factComp == true) ?
                true : false ;
    }

    public void printOk(boolean fact) {
        if (fact == true) {
            System.out.print(" ... OK\n");
        } else {
            System.out.print(" ... mistake!\n");
        }
    }
}