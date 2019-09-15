

package L2;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
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
                System.out.println("Phương trình VN");
        } 
        else 
            System.out.println("Nghiem phuong trinh: " + -b / a);
    }
}
