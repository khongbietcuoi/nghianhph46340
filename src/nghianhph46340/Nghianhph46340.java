/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nghianhph46340;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NGHIAPC
 */
public class Nghianhph46340 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String tiepTuc;
        QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
        NhanVien nhanViens = new NhanVien();
        while (true) {
            quanLyNhanVien.nhapThongTin();
            System.out.println("Co muon tiep tuc khong? (Y/N)");
            tiepTuc = sc.nextLine();
            if (tiepTuc.equals("N")) {
                break;
            }
        }

        System.out.println("Thong tin cua cac doi tuong vua nhap");
        ArrayList<NhanVien> list = quanLyNhanVien.xuatThongTin();
        for (NhanVien nhanVien : list) {
            nhanVien.inThongTin();
        }

        String timPhongBan;
        System.out.println("Nhap phong ban can tim");
        timPhongBan = sc.nextLine();
        ArrayList<NhanVien> listTheoPhongBan = quanLyNhanVien.timTheoPhongBan(timPhongBan);
        if (listTheoPhongBan.isEmpty()) {
            System.out.println("Khong co nguoi nay");
        } else {
            for (NhanVien nhanVien : listTheoPhongBan) {
                nhanVien.inThongTin();
            }
        }

        int idNhanVienCanXoa;
        System.out.println("Nhap ID can xoa");
        idNhanVienCanXoa = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> listTheoPhongBanSauXoa = quanLyNhanVien.xoaNhanVien(idNhanVienCanXoa);
        System.out.println("Danh Sach sau xoa");
        if (listTheoPhongBanSauXoa.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            for (NhanVien nhanVien : listTheoPhongBanSauXoa) {
                nhanVien.inThongTin();
            }
        }

//        if (list.isEmpty()) {
//            System.out.println("Danh sach trong");
//        }else{
//            for (int i = 0; i < list.size(); i++) {
//                if (list.get(i).getId() == idNhanVienCanXoa) {
//                    list.get(i).remove();
//                }
//            }
//        }
    }

}
