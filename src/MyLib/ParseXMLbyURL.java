/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLib;

import org.w3c.dom.Document;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.InputSource;
import org.xml.sax.*;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 *
 * @author BaoHa
 */
public final class ParseXMLbyURL {
    public static List<String> getStringListFromUrl(String address){
        List<String> listS = new ArrayList<>();
        try{
            URL url = new URL(address);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = "";
            while((line=br.readLine())!=null){
                listS.add(line);
            }
            br.close();
        } catch (MalformedURLException ex) {
            Logger.getLogger(ParseXMLbyURL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ParseXMLbyURL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listS;
    }
    
    public static String getStringFromUrl(String address){
        String listS = "";
        try{
            URL url = new URL(address);
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = "";
            while((line=br.readLine())!=null){
                listS+=line;
            }
            br.close();
        } catch (MalformedURLException ex) {
            Logger.getLogger(ParseXMLbyURL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ParseXMLbyURL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listS;
    }
    
    public static Document getDocFromXML(String url) {
        try {
            XMLReader myReader = XMLReaderFactory.createXMLReader();
            //myReader.setContentHandler();
            myReader.parse(new InputSource(new URL(url).openStream()));

            // or if you prefer DOM:
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new URL(url).openStream());
            return doc;
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(ParseXMLbyURL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(ParseXMLbyURL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ParseXMLbyURL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ParseXMLbyURL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
}
