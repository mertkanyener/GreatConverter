package test;

import constant.functions.Length;
import constant.functions.Temperature;
import currency.ConvertCurrency;

/**
 * Created by mertkanyener on 12.07.2017.
 */
public class Test {

    public static void main(String[] args){
    	Temperature t = new Temperature();
    	System.out.println(t.fahrenheitToCelsius(68));
    }
}
