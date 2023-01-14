import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Total_number_of_legs {
    private static final String filePath = "C:\\Users\\Lera\\Desktop\\animals.json";

    public static void main(String[] args) {
        long pigs = 0;
        long chickens = 0;
        long cows = 0;
        try {
            FileReader reader = new FileReader(filePath);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
            pigs = (long) jsonObject.get("pigs");
            chickens = (long) jsonObject.get("chickens");
            cows = (long) jsonObject.get("cows");

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
        System.out.println(pigs * 4 + chickens * 2 + cows * 4);
    }

}


