package factory;

// Target
interface CelsiusTemperature {
    double getCTemperator();
}

// Adaptee
class FahrenheitTemperature {
    private double temperature;

    public FahrenheitTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }
}

// Adpater
class FahrenheitToCelsiusAdapter extends FahrenheitTemperature implements CelsiusTemperature {

    public FahrenheitToCelsiusAdapter(double temperature) {
        super(temperature);
    }

    @Override
    public double getCTemperator() {
        return (super.getTemperature() - 32 * 5 / 9);
    }
}

// Client
public class Adapter_Class {

    public static void main(String[] args) {
        FahrenheitTemperature f = new FahrenheitTemperature(100);
        CelsiusTemperature c = new FahrenheitToCelsiusAdapter(f.getTemperature());
        System.out.println("The temperature is " + c.getCTemperator());
    }

}
