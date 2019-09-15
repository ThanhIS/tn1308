package L1;

import java.util.Scanner;

public class B1 {
    public B1() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhap diem: ");
        double diem = sc.nextDouble();
        System.out.println(hoTen + " " + diem + " diem");
    }
}