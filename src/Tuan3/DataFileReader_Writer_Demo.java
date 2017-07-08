/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HOCVIEN
 */
public class DataFileReader_Writer_Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        try{
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("doanhso_data.txt")));
            for(int i=0;i<a.length;i++){
                dos.writeInt(a[i]);
            }
            dos.close();
            
            DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("doanhso_data.txt")));
            int tong=0;
            int count=0;
            int[] b = {};
            while(true){
                try{
                    tong+=dis.readInt();
                    //b[count] = dis.readInt();
                    count++;
                }catch(EOFException ex1){
                    break;
                }
            }
            dis.close();
            System.out.println(tong);
            //System.out.println(b.length);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataFileReader_Writer_Demo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataFileReader_Writer_Demo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
