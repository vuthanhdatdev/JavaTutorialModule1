/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLib;

import Tuan3.DataFileReader_Writer_Demo;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BaoHa
 */
public final class ReadFileString {
    public ReadFileString(){
        
    }
    
    public void writeByElement(String path,String line){
        //List<String> list = new ArrayList<>();
        try{
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(path)));
            dos.writeUTF(line);
            dos.close();
            }catch (FileNotFoundException ex) {
                Logger.getLogger(DataFileReader_Writer_Demo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
            Logger.getLogger(DataFileReader_Writer_Demo.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public List<String> readByElement(String path){
        List<String> list = new ArrayList<>();
        try{
            DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(path)));
            while(true){
                try{
                    list.add(dis.readUTF());
                }catch(EOFException ex){
                    break;
                } 
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadFileString.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
                    Logger.getLogger(ReadFileString.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
}
