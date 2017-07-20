package constant.functions;

/**
 * Created by mertkanyener on 17.07.2017.
 */
public class Temperature {

    public double celsiusToFahrenheit(double c){
        return c * 1.8 + 32;
    }

    public double celsiusToKelvin(double c){
        return c + 273.15;
    }

    public float fahrenheitToCelsius(float f){
        return (f - 32) * (5f/9f);
    }

    public double fahrenheitToKelvin(double f){
        return (f - 32) * (5/9) + 273.15;
    }

    public double kelvinToCelsius(double k){
        return k - 273.15;
    }

    public double kelvinToFahrenheit(double k){
        return (k - 273.15) * 1.8 + 32;
    }
}
