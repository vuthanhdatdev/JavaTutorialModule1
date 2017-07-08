/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

/**
 *
 * @author HOCVIEN
 */
public class ScannerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            FileReader fr = new FileReader("doanhthu.txt");
            BufferedReader br = new BufferedReader(fr);
            Scanner scan = new Scanner(br);
            int sum=0;
            while(scan.hasNext()){
                sum+=scan.nextInt();
            }
            System.out.println(sum);
        }
        catch(FileNotFoundException ex1){
            System.out.println(ex1.getMessage());
        }
        catch(IOException ex2){
            System.out.println(ex2.getMessage());
        }
        catch(Exception ex3){
            System.out.println(ex3.getMessage());
        }
        
    }
    
}
