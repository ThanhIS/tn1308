package L2;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        do {
            System.out.println("+-----------------------------+");
            System.out.println("   1. Giải phương trình bậc 1  ");
            System.out.println("   2. Giải phương trình bậc 2  ");
            System.out.println("   3. Tính tiền điện           ");
            System.out.println("   4. Kết thúc                 ");
            System.out.println("+-----------------------------+");
            System.out.println("Chọn chức năng:__");
            a = sc.nextInt();
        }
        while(a < 0 && a > 5);

        switch(a) 
        {
        case 1:
            giaiPTB1();
            break;
        case 2:
            giaiPTB2();
            break;
        case 3:
            tinhTienDien();
            break;
        default:
            System.out.println("Kết thúc");
        }
    }
    public static void giaiPTB1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap b: ");
        double b = sc.nextDouble();
        if (a == 0.0D) 
        {
            if (b == 0.0D) 
                System.out.println("Phuong trinh VSN");
            else
                System.out.println("Phuong trinh VN");
        } 
        else 
            System.out.println("Nghiem phuong trinh: " + -b / a);
    }
         public static void giaiPTB2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap b: ");
        double b = sc.nextDouble();
        System.out.println("Nhap c: ");
        double c = sc.nextDouble();
        if (a == 0.0D) 
        {
            if (b==0.0D) 
            {
                if (c==0.0D)
                    System.out.println("Phuong trinh VSN");
                else 
                    System.out.println("Phuong trinh VN");
            } 
            else
                System.out.println("Nghiem phuong trinh: " + -c/b);
        }
        else
        {
            double delta = Math.pow(b,2.0D)-4.0D*a*c;
            if (delta < 0.0D)
                System.out.println("Phuong trinh VN");
             else if (delta == 0.0D)
                System.out.println("Nghiem kep: " + -b / 2.0D * a);
             else
                System.out.println("Phuong trinh hai nghiem pb: X1 = " +(-b+Math.sqrt(delta))/(2.0D*a)+"& X2 = "+(-b-Math.sqrt(delta))/(2.0D*a));
        }
}

    public static void tinhTienDien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dien: ");
        double soDien = sc.nextDouble();
        if (soDien < 50.0D)
            System.out.println("Tien dien tra:" + soDien*1000.0D);
        else
            System.out.println("Tien dien tra:" + soDien*1200.0D);
     }
}
