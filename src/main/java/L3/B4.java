package L3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B4 {
    public String hoTen;
    public int diem;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so sinh vien: ");
        int n = input.nextInt();
        ArrayList<B4> danhSach = new ArrayList();

        int i;
        for(i = 0; i < n; ++i) {
            input.nextLine();
            B4 x = new B4();
            System.out.println("Thong tin sinh vien " + i);
            System.out.print("Ho va Ten: ");
            x.hoTen = input.nextLine();
            System.out.print("diem: ");
            x.diem = input.nextInt();
            danhSach.add(x);
        }

        for(i = 0; i < danhSach.size(); ++i) {
            System.out.println("Ten: " + ((B4)danhSach.get(i)).hoTen + " diem: " + ((B4)danhSach.get(i)).diem);
        }

        for(i = 0; i < danhSach.size(); ++i) {
            if (((B4)danhSach.get(i)).diem < 5) 
                System.out.print(((B4)danhSach.get(i)).hoTen + " hoc luc yeu");
            else if ((double)((B4)danhSach.get(i)).diem < 6.5D && ((B4)danhSach.get(i)).diem >= 5)
                System.out.print(((B4)danhSach.get(i)).hoTen + " hoc luc trung binh");
            else if (6.5D >= (double)((B4)danhSach.get(i)).diem || (double)((B4)danhSach.get(i)).diem >= 7.5D)
                if (((B4)danhSach.get(i)).diem < 9 && (double)((B4)danhSach.get(i)).diem >= 7.5D)
                    System.out.print(((B4)danhSach.get(i)).hoTen + " hoc luc gioi");
                else if (((B4)danhSach.get(i)).diem >= 9)
                    System.out.print(((B4)danhSach.get(i)).hoTen + " hoc luc xuat sac");
                else
                    System.out.print("diem nhap sai!");
            else System.out.print(((B4)danhSach.get(i)).hoTen + " hoc luc kha");
            System.out.println("");
        }

        Collections.sort(danhSach, (var sv1, var sv2) -> {
            if (sv1.diem > sv2.diem) {
                return 1;
            } else {
                return sv1.diem == sv2.diem ? 0 : -1;
            }
        });
        System.out.println("Danh sach sap xep theo thu tu điem tang dan: ");

        for(i = 0; i < danhSach.size(); ++i) {
            System.out.println("Ten: " +((B4)danhSach.get(i)).hoTen + " diem: "+((B4)danhSach.get(i)).diem);
        }

    }
}