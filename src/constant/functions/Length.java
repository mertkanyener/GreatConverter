package constant.functions;

/**
 * Created by mertkanyener on 06.07.2017.
 */
public class Length {

    //Inch to sth

    public double inToMm(double inch){
        return inch * 25.4;
    }

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

    //Yard to sth

    public double ydToCm(double yards){
        return yards * 91.44;
    }

    public double ydToM(double yards){
        return yards * 0.9144;
    }

    public double ydToIn(double yards){
        return yards * 36;
    }

    public double ydToFt(double yards){
        return yards * 3;
    }

    //Mile to sth

    public double milToM(double miles){
        return miles * 1609.34;
    }

    public double milToKm(double miles){
        return miles * 1.60934;
    }

    public double milToFt(double miles){
        return miles * 5280;
    }

    public double milToYd(double miles){
        return miles * 1760;
    }

    //Mm to sth

    public double mmToIn(double mm){
        return mm * 0.0393701;
    }

    //Cm to sth

    public double cmToIn(double cm){
        return cm * 0.393701;
    }

    public double cmToFt(double cm){
        return cm * 0.0328084;
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

    //Km to sth

    public double kmToMil(double km){
        return km * 0.621371;
    }










}
