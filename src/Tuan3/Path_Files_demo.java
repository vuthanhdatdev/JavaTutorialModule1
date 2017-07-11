/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan3;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author HOCVIEN
 */
public class Path_Files_demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Path p1 = Paths.get("C:/Users/Public/Pictures/Sample Pictures/Tulips.jpg");
        if(Files.exists(p1)){
            System.out.println("File Exist!");
            System.out.println(p1.getFileName());
            System.out.println(p1.getFileSystem());
            System.out.println(p1.getParent());
        }
        
    }
    
}
