/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HOCVIEN
 */
public class ReadAndWriteFileDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            FileInputStream fin = new FileInputStream("C:/Users/Public/Pictures/Sample Pictures/Chrysanthemum.jpg");
            FileOutputStream fout = new FileOutputStream("D:/abc.jpg");
            int b;
            while((b=fin.read())!=-1){
                fout.write(b);
                System.out.println(String.valueOf(b));
            }
            fin.close();
            fout.close();
            JOptionPane.showMessageDialog(null, "Write Done!");
        } catch (FileNotFoundException ex1) {
            Logger.getLogger(ReadAndWriteFileDemo.class.getName()).log(Level.SEVERE, null, ex1);
        } catch (IOException ex2) {
            Logger.getLogger(ReadAndWriteFileDemo.class.getName()).log(Level.SEVERE, null, ex2);
        }
    }
    
}
