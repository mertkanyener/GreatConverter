package constant.functions;



/**
 * Created by mertkanyener on 16.07.2017.
 */
public class Weight {

    //Ounce to sth
    public double ozToGr(double oz){
        return oz * 28.3495;
    }

    public double ozToKg(double oz){
        return oz * 0.0283495;
    }

    public double ozToLbs(double oz){
        return oz * 0.0625;
    }
    
    public double ozToTon(double oz) {
    	return oz * 0.00003125;
    }
    
    public double ozToTonne(double oz) {
    	return oz * 0.00002835;
    }

    //Pound to sth

    public double lbsToGr(double lbs){
        return lbs * 453.592;
    }

    public double lbsToKg(double lbs){
        return lbs * 0.453592;
    }

    public double lbsToOz(double lbs){
        return lbs * 16;
    }

    public double lbsToTon(double lbs){
        return lbs * 0.0005;
    }

    public double lbsToTonne(double lbs){
        return lbs * 0.000453592;
    }

    //US Ton to sth

    public double tonToKg(double ton){
        return ton * 907.185;
    }

    public double tonToLbs(double ton){
        return ton * 2000;
    }

    public double tonToTonne(double ton){
        return ton * 0.907185;
    }
    
    public double tonToOz(double ton) {
    	return ton * 32000;
    }
    
    public double tonToGr(double ton) {
    	return ton * 907185;
    }

    //Grams to sth

    public double grToOz(double gr){
        return gr * 0.035274;
    }

    public double grToLbs(double gr){
        return gr * 0.00220462;
    }
    
    public double grToTon(double gr) {
    	return gr * 0.0000011023;
    }

    //Kg to sth

    public double kgToOz(double kg){
        return kg * 35.274;
    }

    public double kgToLbs(double kg){
        return kg * 2.20462;
    }

    public double kgToTon(double kg){
        return kg * 0.00110231;
    }

    //Tonne to sth

    public double tonneToTon(double tonne){
        return tonne * 1.10231;
    }
    
    public double tonneToLbs(double tonne) {
    	return tonne * 2204.62;
    }

    public double tonneToOz(double tonne){
        return tonne * 35274;
    }

}
