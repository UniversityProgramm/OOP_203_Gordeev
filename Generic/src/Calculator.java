public class Calculator {

    public static <T extends Number,V extends Number> double sum(T x, V y){
        return x.doubleValue() + y.doubleValue();
    }

    public static <T extends Number,V extends Number> double subtraction(T x, V y) {
        return x.doubleValue() - y.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T a, V b) {
        return a.doubleValue() / b.doubleValue();
    }

    public static void main(String[] args) {

        Calculator newCalculator = new Calculator();
        System.out.println(newCalculator.sum(-1,1.4));
        System.out.println(newCalculator.subtraction(10, 5.5));
        System.out.println(newCalculator.multiply(2, 5.6));
        System.out.println(newCalculator.divide(0, 6));

    }
}
