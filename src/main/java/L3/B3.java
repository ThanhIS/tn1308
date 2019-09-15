package L3;

import java.util.Arrays;
import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu trong mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");

        int Min;
        for(Min = 0; Min < n; ++Min) 
        {
            System.out.println("Phan tu "+Min+": ");
            a[Min] = sc.nextInt();
        }

        Arrays.sort(a);
        System.out.println(" Mang dk sap xep: ");

        for(Min = 0; Min < n; ++Min) {
            System.out.print(a[Min] + "  ");
        }

        System.out.println();
        Min = a[0];

        int tong;
        for(tong = 0; tong < n; ++tong) 
        {
            Min = Math.min(Min, a[tong]);
        }

        System.out.println();
        System.out.println("phan tu nho nhat mang: " + Min);
        tong = 0;
        int dem = 0;

        for(int i = 0; i < n; ++i) {
            if (a[i] % 3 == 0) {
                tong += a[i];
                System.out.println(tong);
                ++dem;
                System.out.println(dem);
            }
        }
         System.out.println("TBC cac phan tu chia het cho 3: " + (float)tong/(float)dem);
    }
}
