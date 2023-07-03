public class Celsius_to_farenheit {
    public static double celsius_to_farenheit(double celsius_degrees){
        return 32*1.8+celsius_degrees;
    }

    public static void main(String[] args) {
        Celsius_to_farenheit fc = new Celsius_to_farenheit();
        double farenheit_value = fc.celsius_to_farenheit(32.8);
        System.out.println(farenheit_value+"f");
    }
}
