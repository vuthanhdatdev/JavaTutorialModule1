/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLib;

import com.sun.xml.internal.txw2.Document;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.DefaultListModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import jdk.internal.org.xml.sax.SAXException;

/**
 *
 * @author BaoHa
 */
public final class LoadRSSByUrl {
    public static DefaultListModel<String> loadRSS(String u) throws MalformedURLException,SAXException,IOException, Exception{
        DefaultListModel<String> dlm = new DefaultListModel<>();
        URL url = new URL(u);
        URLConnection urlConnect = url.openConnection();
        Document doc;
        doc = parseXML(urlConnect.getInputStream());
        return dlm;
    }
    
    public static Document parseXML(InputStream stream)
    throws Exception
    {
        DocumentBuilderFactory objDocumentBuilderFactory = null;
        DocumentBuilder objDocumentBuilder = null;
        Document doc = null;
        try
        {
            objDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
            objDocumentBuilder = objDocumentBuilderFactory.newDocumentBuilder();

            //doc = objDocumentBuilder.parse(stream);
        }
        catch(Exception ex)
        {
            throw ex;
        }       

        return doc;
    }

}
