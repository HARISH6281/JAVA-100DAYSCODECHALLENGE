public class Farenheit_to_Celsius {
    public static double farenheit_to_celsius(double celsius_degrees){
        return 32*1.8+celsius_degrees;
    }

    public static void main(String[] args) {
        Farenheit_to_Celsius fc = new Farenheit_to_Celsius();
        double farenheit_value = fc.farenheit_to_celsius(32.8);
        System.out.println(farenheit_value+"f");
    }
}
