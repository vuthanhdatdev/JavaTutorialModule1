/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan4;
import java.io.Serializable;

/**
 *
 * @author BaoHa
 */
public class LienHe implements Serializable{

    public String hoTen;
    public String soDT;
    public String fileUrl;

    public LienHe() {
    }

    public LienHe(String hoTen, String soDT, String fileUrl) {
        this.hoTen = hoTen;
        this.soDT = soDT;
        this.fileUrl = fileUrl;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

}
