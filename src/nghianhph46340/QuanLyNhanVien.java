/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nghianhph46340;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NGHIAPC
 */
public class QuanLyNhanVien {

    Scanner sc = new Scanner(System.in);

    ArrayList<NhanVien> listNhanVien = new ArrayList<>();

    public void nhapThongTin() {
        System.out.println("Nhap id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten");
        String ten = sc.nextLine();
        System.out.println("Nhap nam sinh");
        int namSinh = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap phong ban thuong truc");
        String phongBan = sc.nextLine();
        NhanVien nhanVien = new NhanVien(id, ten, namSinh, phongBan);
        listNhanVien.add(nhanVien);

    }

    public ArrayList<NhanVien> xuatThongTin() {

        return listNhanVien;
    }

    public ArrayList<NhanVien> timTheoPhongBan(String timPhongBan) {
        ArrayList<NhanVien> timNV = new ArrayList<>();
        for (NhanVien nhanVien : listNhanVien) {
            if (nhanVien.getPhongBan().equals(timPhongBan)) {
                timNV.add(nhanVien);
            }
        }

        return timNV;
    }

    public ArrayList<NhanVien> xoaNhanVien(int idNhanVienCanXoa) {
        int count = 0;
        if (listNhanVien.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            for (int i = 0; i < listNhanVien.size(); i++) {
                if (listNhanVien.get(i).getId() == idNhanVienCanXoa) {
                    listNhanVien.remove(i);
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("Khong co nguoi can xoa");
        }
        return listNhanVien;
    }
}
