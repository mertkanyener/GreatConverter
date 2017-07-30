package test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class GetData {

    public static void main(String[] args) throws IOException{

        try{

            Document doc = Jsoup.connect("http://www.xe.com/?c=TRY").userAgent("mozilla/17.0").get();
            Elements temp = doc.select("[rel=GBP,EUR,2,3]");
            String eurToGbp = temp.text();
            System.out.println(eurToGbp);

        }catch(IOException e) {
            e.printStackTrace();

        }


    }
}
