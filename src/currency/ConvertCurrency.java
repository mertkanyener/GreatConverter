package currency;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ConvertCurrency {

    public float getRatio(String cssQuery){
        float ratio = 0f;
        try {
            Document doc = Jsoup.connect("http://www.xe.com/?c=TRY").userAgent("mozilla/17.0").get();
            Elements temp = doc.select(cssQuery);
            String ratioStr = temp.text();
            ratio = Float.parseFloat(ratioStr);

        }catch (Exception e){
            //e.printStackTrace();
            System.out.println("An error has occured.");
        }

            return ratio;

    }
}
