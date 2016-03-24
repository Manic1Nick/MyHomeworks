package OOPHomeWeek1;

public class Fractional {

    private double numerator;
    private double denominator;

    public Fractional(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double getNumerator() {
        return numerator;
    }

    public double getDenominator() {
        return denominator;
    }

    public void setNumerator(double numerator) {
        if (numerator == 0) {
            System.out.println("wrong input numerator");
            return;
        }
        this.numerator = numerator;
    }

    public void setDenominator(double denominator) {
        if (denominator == 0) {
            System.out.println("wrong input denominator");
            return;
        }
        this.denominator = denominator;
    }

    //operations
    public Fractional add(Fractional num2) {

        return new Fractional(this.getNumerator() * num2.getDenominator() +
                                this.getDenominator() * num2.getNumerator(),
                                    this.getDenominator() * num2.getDenominator());
    }

    public Fractional sub(Fractional num2) {

        return new Fractional(this.getNumerator() * num2.getDenominator() -
                                this.getDenominator() * num2.getNumerator(),
                                    this.getDenominator() * num2.getDenominator());
    }

    public Fractional mult(Fractional num2) {

        return new Fractional(this.getNumerator() * num2.getNumerator(),
                                this.getDenominator() * num2.getDenominator());
    }

    public Fractional div(Fractional num2) {

        return new Fractional(this.getNumerator() * num2.getDenominator(),
                                this.getDenominator() * num2.getNumerator());
    }

    public String convertFractionalToLine() {

        double num1 = this.getNumerator();
        double num2 = this.getDenominator();

        return Double.toString(num1 / num2);
    }

    public void printFractional() {

        if (this.getDenominator() % this.getNumerator() == 0) {
            this.denominator = this.getDenominator() / this.getNumerator();
            this.numerator = 1;

        } else {
            for (int i = 10; i > 0; i--) {
                if (this.getDenominator() / this.getNumerator() == i) {
                    this.numerator = this.getNumerator() / i;
                    this.denominator = this.getDenominator() / i;
                }
            }
        }
        System.out.print(this.getNumerator() + "/" + this.getDenominator());
    }


    public boolean comp(Fractional num2) {

        return ((int)(this.getDenominator() / this.getNumerator() * 10000) <
                (int)(num2.getDenominator() / num2.getNumerator() * 10000)) ? true : false ;
    }


    //test
    public static boolean test(Fractional num1, Fractional num2) {

        boolean exp = true;

        double numTest1 = num1.getNumerator() / num1.getDenominator();
        double numTest2 = num2.getNumerator() / num2.getDenominator();

        Fractional numTest = num1.add(num2);
        boolean factAdd = (int)(numTest.getNumerator() / numTest.getDenominator() * 10000) ==
                            (int)(UtilsArithmetic.additionNum1Num2(numTest1, numTest2) * 10000);
        System.out.printf("method %s, res %s, exp %s = fact %s", "add", exp == factAdd, exp, factAdd);
        printOk(factAdd);

        numTest = num1.sub(num2);
        boolean factSub = (int)(numTest.getNumerator() / numTest.getDenominator() * 10000) ==
                            (int)(UtilsArithmetic.subtractionNum1Num2(numTest1, numTest2) * 10000);
        System.out.printf("method %s, res %s, exp %s = fact %s", "sub", exp == factSub, exp, factSub);
        printOk(factSub);

        numTest = num1.mult(num2);
        boolean factMult = (int)(numTest.getNumerator() / numTest.getDenominator() * 10000) ==
                            (int)(UtilsArithmetic.multiplicationNum1Num2(numTest1, numTest2) * 10000);
        System.out.printf("method %s, res %s, exp %s = fact %s", "mult", exp == factMult, exp, factMult);
        printOk(factMult);

        numTest = num1.div(num2);
        boolean factDiv = (int)(numTest.getNumerator() / numTest.getDenominator() * 10000) ==
                            (int)(UtilsArithmetic.divisionNum1Num2(numTest1, numTest2) * 10000);
        System.out.printf("method %s, res %s, exp %s = fact %s", "div", exp == factDiv, exp, factDiv);
        printOk(factDiv);

        boolean factComp = (num1.comp(num2)) == true &&
                           (UtilsArithmetic.comparisonNum1Num2((int)(numTest1 * 10000),
                                   (int)(numTest2 * 10000)) == true) ||
                           (num1.comp(num2)) == false &&
                           (UtilsArithmetic.comparisonNum1Num2((int)(numTest1 * 10000),
                                   (int)(numTest2 * 10000)) == false);
        System.out.printf("method %s, res %s, exp %s = fact %s", "comp", exp == factComp, exp, factComp);
        printOk(factComp);

        return (factAdd == true && factSub == true && factMult == true &&
                factDiv == true && factComp == true) ? true : false ;
    }

    public static void printOk(boolean fact) {
        if (fact == true) {
            System.out.print(" ... OK\n");
        } else {
            System.out.print(" ... mistake!\n");
        }
    }
}