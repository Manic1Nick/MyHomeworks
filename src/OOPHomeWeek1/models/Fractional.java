package OOPHomeWeek1.models;

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
            System.out.println("Wrong data: numerator is 0!\n");
            return;
        }
        this.numerator = numerator;
    }

    public void setDenominator(double denominator) {
        if (denominator == 0) {
            System.out.println("Wrong data: denominator is 0!\n");
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
                if (this.getDenominator() % i == 0 && this.getNumerator() % i == 0) {
                    this.numerator = this.getNumerator() / i;
                    this.denominator = this.getDenominator() / i;
                }
            }
        }
        System.out.print((int)this.getNumerator() + "/" + (int)this.getDenominator());
    }


    public boolean comp(Fractional num2) {

        return ((int)(this.getDenominator() / this.getNumerator() * 10000) ==
                (int)(num2.getDenominator() / num2.getNumerator() * 10000)) ? true : false ;
    }
}