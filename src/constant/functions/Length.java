package constant.functions;

/**
 * Created by mertkanyener on 06.07.2017.
 */
public class Length {

    //Inch to sth


    public double inToCm(double inch){
        return inch * 2.54;
    }

    public double inToM(double inch){
        return inch * 0.0254;
    }

    public double inToFt(double inch){
        return inch * 0.0833333;
    }

    public double inToYard(double inch){
        return inch * 0.0277778;
    }
    
    public double inToMil(double inch) {
    	return inch * 0.000015783;
    }
    
    public double inToKm(double inch) {
    	return inch * 0.0000254;
    }

    //Foot to sth

    public double ftToCm (double feet){
        return feet * 30.48;
    }

    public double ftToM(double feet){
        return feet * 0.3048;
    }

    public double ftToIn(double feet){
        return feet * 12;
    }

    public double ftToYd(double feet){
        return feet * 0.333333;
    }
    
    public double ftToMil(double feet) {
    	return feet * 0.000189394;
    }
    
    public double ftToKm(double feet) {
    	return feet * 0.0003048;
    }

    //Yard to sth

    public double ydToCm(double yards){
        return yards * 91.44;
    }

    public double ydToM(double yards){
        return yards * 0.9144;
    }
    
    public double ydToKm(double yards) {
    	return yards * 0.0009144;
    }

    public double ydToIn(double yards){
        return yards * 36;
    }

    public double ydToFt(double yards){
        return yards * 3;
    }
    
    public double ydToMil(double yards) {
    	return yards * 0.000568182;
    }

    //Mile to sth
    
    public double milToCm(double miles) {
    	return miles * 160934;
    }

    public double milToM(double miles){
        return miles * 1609.34;
    }

    public double milToKm(double miles){
        return miles * 1.60934;
    }
    
    public double milToIn(double miles) {
    	return miles * 63360;
    }

    public double milToFt(double miles){
        return miles * 5280;
    }

    public double milToYd(double miles){
        return miles * 1760;
    }


    //Cm to sth

    public double cmToIn(double cm){
        return cm * 0.393701;
    }

    public double cmToFt(double cm){
        return cm * 0.0328084;
    }
    
    public double cmToYd(double cm) {
    	return cm * 0.0109361;
    }
    
    public double cmToMil(double cm) {
    	return cm * 0.0000062137;
    }

    //M to sth

    public double mToIn(double m){
        return m * 39.3701;
    }

    public double mToFt(double m){
        return m * 3.28084;
    }

    public double mToYd(double m){
        return m * 1.09361;
    }
    
    public double mToMil(double m) {
    	return m * 0.000621371;
    }

    //Km to sth
    
    public double kmToIn(double km) {
    	return km * 39370.1;
    }
    
    public double kmToFt(double km) {
    	return km * 3280.84;
    }
    
    public double kmToYd(double km) {
    	return km * 1093.61;
    }
    
    public double kmToMil(double km){
        return km * 0.621371;
    }










}
