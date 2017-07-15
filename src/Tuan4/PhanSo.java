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
        tuSo=0;
        mauSo=1;
    }
    public PhanSo(int tuSo,int mauSo){
        this.tuSo = tuSo;
        setMauSo(mauSo);
    }
    
    public PhanSo(String tuSo,String mauSo) throws Exception{
        try{
            this.tuSo = Integer.parseInt(tuSo);
            this.mauSo = Integer.parseInt(mauSo);
        }catch(Exception ex){
            throw new Exception("Nhập không hợp lệ");
        }
    }
    
    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) throws Exception {
        if(tuSo!=0){
            this.tuSo = tuSo;
        }
        else{
            throw new Exception("Mẫu số =0,Phân số không hợp lệ");
        }
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    public PhanSo tinhTong(PhanSo ps2) {
        PhanSo result = new PhanSo();
        result.tuSo = this.tuSo * ps2.mauSo + ps2.tuSo * this.mauSo;
        result.mauSo = this.mauSo * ps2.mauSo;
        return result;
    }

    public PhanSo tinhHieu(PhanSo ps2) {
        PhanSo result = new PhanSo();
        result.tuSo = this.tuSo * ps2.mauSo - ps2.tuSo * this.mauSo;
        result.mauSo = this.mauSo * ps2.mauSo;
        return result;
    }

    public PhanSo tinhTich(PhanSo ps2) {
        PhanSo result = new PhanSo();
        result.tuSo = this.tuSo * ps2.tuSo;
        result.mauSo = this.mauSo * ps2.mauSo;
        return result;
    }

    public PhanSo tinhThuong(PhanSo ps2) {
        PhanSo result = new PhanSo();
        result.tuSo = this.tuSo * ps2.mauSo;
        result.mauSo = this.mauSo * ps2.tuSo;
        return result;
    }
    
}
