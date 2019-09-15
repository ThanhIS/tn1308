package L2;

import java.util.Scanner;

public class B2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap b: ");
        double b = sc.nextDouble();
        System.out.println("Nhap c: ");
        double c = sc.nextDouble();
        if (a == 0.0D) 
        {
            if (b == 0.0D) 
            {
                if (c == 0.0D) 
                    System.out.println("Phuong trinh VSN");
                else 
                    System.out.println("Phuong trinh VN");
            } 
            else 
                System.out.println("phuong trinh co nghiem: " + -c /b);
        }
        else 
        {
        double delta = Math.pow(b, 2.0D) - 4.0D * a * c;
            if (delta < 0.0D) 
                System.out.println("Phuong trinh VN");
                else if (delta == 0.0D) 
                System.out.println("Nghiem kep: " + -b / 2.0D * a);
                else 
                System.out.println("Phuong trinh hai nghiem pb: X1= "+(-b+Math.sqrt(delta))/(2.0D * a)+"& X2 = "+(-b-Math.sqrt(delta))/(2.0D*a));
            
        }

    }
}
