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
    
public class VoSonVang_59133093_BaiTapJavaMTK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NhanVien nv1 = new NhanVien();
        nv1.setTen("Vo Son Vang");
        nv1.setTuoi(21);
        nv1.setDiaChi("01 Ha Hoang, Ha Tinh");
        nv1.setTienLuong(25000000);
        nv1.setSumGioLam(201);
        System.out.println(nv1.getThongTin());
        
        NhanVien nv2 = new NhanVien();
        nv2.setTen("Vo Huu Huy");
        nv2.setTuoi(21);
        nv2.setDiaChi("Ninh Hoa, Khanh Hoa");
        nv2.setTienLuong(25000000);
        nv2.setSumGioLam(90);
        System.out.println(nv2.getThongTin());
    }
    
}
