public class CreditPaymentService {
    public double calculate(double S, double r, double n) {

        double x = (r / 12) / 100;

        double y = Math.pow((1 + x), n);

        double A;
        A = S * ((x * y) / (y - 1));

        int a = (int) A;
        return a;
    }

}
