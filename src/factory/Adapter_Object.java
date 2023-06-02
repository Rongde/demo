package factory;

//// interface
//interface CelsiusTemperature {
//    double getCTemperator();
//}
//
//// Adaptee
//
//class FahrenheitTemperature {
//    private double temperature;
//
//    public FahrenheitTemperature(double temperature) {
//        this.temperature = temperature;
//    }
//
//    public double getTemperature() {
//        return temperature;
//    }
//}

// Adapter

class FahrenheitToCelsiusAdapter2 implements CelsiusTemperature {
    private FahrenheitTemperature fahrenheitTemperature;

    public FahrenheitToCelsiusAdapter2(FahrenheitTemperature fahrenheitTemperature) {
        this.fahrenheitTemperature = fahrenheitTemperature;
    }

    @Override
    public double getCTemperator() {
        return (this.fahrenheitTemperature.getTemperature() - 32 * 5 / 9);
    }
}


public class Adapter_Object {
    public static void main(String[] args) {

        FahrenheitTemperature f = new FahrenheitTemperature(100);

        CelsiusTemperature c = new FahrenheitToCelsiusAdapter2(f);

        System.out.println("The temperature is " + c.getCTemperator());
    }

}
