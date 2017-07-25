/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLib;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BaoHa
 */
public class ParseJSONbyURL {
    public static String readJSONStringbyURL(String link) throws Exception{
        link  = URLEncoder.encode(link,"UTF-8");
        URL url = new URL(link);
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        String line = new String();
        String json = new String();
            json = br.readLine();
        return json;
    }
    
    public static String getStringFromUrl(String address){
        String listS = "";
        try{
            URL url = new URL(address);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = "";
            listS=br.readLine();
            br.close();
        } catch (MalformedURLException ex) {
            Logger.getLogger(ParseXMLbyURL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ParseXMLbyURL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listS;
    }
}
