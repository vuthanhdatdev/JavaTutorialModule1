/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLib;

import static MyLib.ParseXMLbyURL.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author HOCVIEN
 */
public class TestMyLib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SAXException, IOException, Exception {
        // TODO code application logic here
        /*
        String listS = getStringFromUrl("http://vnexpress.net/rss/tin-moi-nhat.rss");
        Document doc = getDocFromXML("http://vnexpress.net/rss/tin-moi-nhat.rss");
        if(doc!=null){
            System.out.println("Ok");
        }
        int count=0;
        System.out.println(listS);
        System.out.println(count);
        */
        docJsonDemo3();
    }
    
    public static void docJsonDemo3(){
        try {
            URL url = new URL("http://www.dongabank.com.vn/exchange/export");
            URLConnection urlConn = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
            String jsonString = br.readLine();
            System.out.println(jsonString);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObj = (JSONObject)jsonParser.parse(new FileReader("./jsonDemo1.json"));
            JSONArray jsonArr = (JSONArray) jsonObj.get("dsPeople");
            for(int i=0;i<jsonArr.size();i++){
                JSONObject jsonObj2 = (JSONObject)jsonArr.get(i);
                System.out.println(jsonObj2.get("name")+" "+jsonObj2.get("job"));
            }
        } catch (IOException | ParseException ex) {
            Logger.getLogger(TestMyLib.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void docJsonDemo2(){
        try {
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObj = (JSONObject)jsonParser.parse(new FileReader("./jsonDemo1.json"));
            JSONArray jsonArr = (JSONArray) jsonObj.get("dsPeople");
            for(int i=0;i<jsonArr.size();i++){
                JSONObject jsonObj2 = (JSONObject)jsonArr.get(i);
                System.out.println(jsonObj2.get("name")+" "+jsonObj2.get("job"));
            }
        } catch (IOException | ParseException ex) {
            Logger.getLogger(TestMyLib.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void docJsonDemo1(){
        try {
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObj = (JSONObject)jsonParser.parse(new FileReader("./jsonDemo.json"));
            String name,job;
            name = jsonObj.get("name").toString();
            job = jsonObj.get("job").toString();
            System.out.println(name+" "+job);
        } catch (IOException | ParseException ex) {
            Logger.getLogger(TestMyLib.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
