public class Farenheit_to_Celsius {
    public static double farenheit_to_celsius(double celsius_degrees){
        return (celsius_degrees-32)*0.556;
    }

    public static void main(String[] args) {
        Farenheit_to_Celsius fc = new Farenheit_to_Celsius();
        double farenheit_value = fc.farenheit_to_celsius(32.8);
        System.out.println(farenheit_value+"f");
    }
}
