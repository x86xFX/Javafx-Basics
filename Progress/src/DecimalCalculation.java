import java.math.BigDecimal;

public class DecimalCalculation {
    public static void main(String[] args) {
//        System.out.println("--------- Double --------");
//        double x = 33.22;
//        double y = 23.22;
//        System.out.println("33.22 - 23.22 = " + (x - y));
//
//        System.out.println("--------- BigDecimal --------");
//        BigDecimal w = new BigDecimal(33.22);
//        BigDecimal z = new BigDecimal(23.22);
//        System.out.println("33.22 - 23.22 = " + w.subtract(z));
//
//        BigDecimal r = new BigDecimal(23.22);
//        System.out.println("" + r.toString());
//
//        BigDecimal t = new BigDecimal("23.22");
//        System.out.println("" + t);

        BigDecimal number = new BigDecimal(String.format("%.2f", 0.0));
        System.out.println(number);

        number = new BigDecimal(String.format("%.2f", number.doubleValue() + 0.1));
        System.out.println(number);

        number = new BigDecimal(String.format("%.3f", number.doubleValue() + 0.1));
        System.out.println(number);

        number = new BigDecimal(String.format("%.4f", number.doubleValue() + 0.1));
        System.out.println(number);
    }
}
