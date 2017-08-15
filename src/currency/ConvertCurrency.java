package currency;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ConvertCurrency {

    public double getRatio(String cssQuery){
        double ratio = 0f;
        try {
            Document doc = Jsoup.connect("http://www.xe.com/?c=TRY").userAgent("mozilla/17.0").get();
            Elements temp = doc.select(cssQuery);
            String ratioStr = temp.text();
            ratio = Double.parseDouble(ratioStr);

        }catch (Exception e){
            //e.printStackTrace();
            System.out.println("An error has occured.");
        }

            return ratio;

    }
}
