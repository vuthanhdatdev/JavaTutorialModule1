/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan4;

/**
 *
 * @author HOCVIEN
 */
public class PhanSo {
    public int tuSo;
    public int mauSo;
    
    public PhanSo(){
        
    }
    public PhanSo(int tuSo,int mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
}
