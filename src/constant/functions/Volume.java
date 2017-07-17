package constant.functions;

/**
 * Created by mertkanyener on 17.07.2017.
 */
public class Volume {

    //Gallons to sth

    public double galToL(double gal){
        return gal * 3.78541;
    }

    public double galToCl(double gal){
        return gal * 37.8541;
    }

    public double galToPint(double gal){
        return gal * 8;
    }

    // Fluid ounce to sth

    public double flozToMl(double floz){
        return floz * 29.5735;
    }

    public double flozToCl(double floz){
        return floz * 2.95735;
    }

    public double flozToL(double floz){
        return floz * 0.0295735;
    }

    public double flozToPint(double floz){
        return floz * 0.0625;
    }

    public double flozToGal(double floz){
        return floz * 0.0078125;
    }

    //Pint to sth

    public double pintToFloz(double pint){
        return pint * 16;
    }

    public double pintToGal(double pint){
        return pint * 0.125;
    }

    public double pintToMl(double pint){
        return pint * 473.176;
    }

    public double pintToCl(double pint){
        return pint * 47.3176;
    }

    public double pintToL(double pint){
        return pint * 0.473176;
    }

    //Ml to sth

    public double mlToFLoz(double ml){
        return ml * 0.033814;
    }

    //Cl to sth

    public double clToFloz(double cl){
        return cl * 0.33814;
    }

    public double clToPint(double cl){
        return cl * 0.0211338;
    }

    //Litre to sth

    public double lToFloz(double l){
        return l * 33.814;
    }

    public double lToPint(double l){
        return l * 2.11338;
    }

    public double lToGal(double l){
        return l * 0.264172;
    }



}


