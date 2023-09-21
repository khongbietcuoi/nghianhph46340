/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nghianhph46340;

/**
 *
 * @author NGHIAPC
 */
public class NhanVien {

    private int id;
    private String ten;
    private int NamSinh;
    private String phongBan;

    public NhanVien() {
    }

    public NhanVien(int id, String ten, int NamSinh, String phongBan) {
        this.id = id;
        this.ten = ten;
        this.NamSinh = NamSinh;
        this.phongBan = phongBan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "id=" + id + ", ten=" + ten + ", NamSinh=" + NamSinh + ", phongBan=" + phongBan + '}';
    }

    public void inThongTin() {

        System.out.println("NhanVien{" + "id=" + id + ", ten=" + ten + ", NamSinh=" + NamSinh + ", phongBan=" + phongBan + '}');
    }
}
