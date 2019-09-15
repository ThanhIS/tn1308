package L3;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        double N = sc.nextDouble();
        boolean ok = true;
        for(int i = 2; (double)i < N - 1.0D; ++i) 
        {
            if (N % (double)i == 0.0D) 
            {
                ok = false;
                break;
            }
            ++i;
        }

        if (ok) 
            System.out.print("So vua nhap la so nguyen to!");
        else 
            System.out.print("Số vừa nhập không phải là số nguyên tố");
    }
}
