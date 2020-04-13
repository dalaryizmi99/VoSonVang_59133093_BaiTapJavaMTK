/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vosonvang_59133093_baitapjavamtk;

/**
 *
 * @author Dalaryizmi
 */
public class NhanVien {
    private String ten;
    private int tuoi;
    private String diachi;
    private double tienluong;
    private int sumgiolam;
    
    //constructor
    public NhanVien(){
        
    }
    public NhanVien(String ten, int tuoi, String diachi, double tienluong, int sumgiolam){
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.tienluong = tienluong;
        this.sumgiolam = sumgiolam;
    }
    
    //getter, setter
    public void setTen(String ten){
        this.ten = ten;
    }
    public String setTen(){
        return ten;
    }
    public void setTuoi(int tuoi){
        this.tuoi = tuoi;
    }
    public int getTuoi(){
        return tuoi;
    }
    public void setDiaChi(String diachi){
        this.diachi = diachi;
    }
    public String getDiaChi(){
        return diachi;
    }
    public void setTienLuong(double tienluong){
        this.tienluong = tienluong;
    }
    public double getTienLuong(){
        return tienluong;
    }
    public void setSumGioLam(int sumgiolam){
        this.sumgiolam = sumgiolam;
    }
    public int setSumGioLam(){
        return sumgiolam;
    }

    public String getThongTin(){
        return "Ten nhan vien: " + ten +
                ", Tuoi:" + tuoi +
                ", Dia chi:" + diachi +
                ", Tien luong:" + tienluong +
                ", Tong so gio lam:" + sumgiolam +
                ", Tien thuong: " + tinhThuong();
    }

    public double tinhThuong(){
        if(sumgiolam >= 200) {
            return tienluong * 0.2;
        }
        else if (sumgiolam >= 100){
            return tienluong * 0.1;
        }
        else return 0;
    }
}

  

