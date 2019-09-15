package L1;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        double dai = sc.nextDouble();
        System.out.println("Nhap chieu rong: ");
        double rong = sc.nextDouble();
        double chuVi = (dai + rong) * 2.0D;
        System.out.println("Chu vi hinh chu nhat: " + chuVi);
        double dienTich = dai * rong;
        System.out.println("Dien tich hinh chu nhat: " + dienTich);
        double canhNN = Math.min(dai, rong);
        System.out.println("Canh nho nhat hinh chu nhat: " + canhNN);
    }
}