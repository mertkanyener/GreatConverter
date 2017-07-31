package test;

import constant.functions.Length;
import constant.functions.Temperature;
import currency.ConvertCurrency;

/**
 * Created by mertkanyener on 12.07.2017.
 */
public class Test {

    public static void main(String[] args){
        ConvertCurrency cc = new ConvertCurrency();
        float ratio = cc.getRatio("[rel=EUR,USD,1,2]");
        System.out.println(ratio);


    }
}
