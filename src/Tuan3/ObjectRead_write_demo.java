/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HOCVIEN
 */
public class ObjectRead_write_demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {1000,20000,300000,4000000,50000000,600000000};
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("test_oos.obj")));
            oos.writeObject(a);
            oos.close();
            
            ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("test_oos.obj")));
            
            int[] b= (int[])ois.readObject();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ObjectRead_write_demo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ObjectRead_write_demo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ObjectRead_write_demo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
