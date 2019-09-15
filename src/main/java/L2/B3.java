//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package L2;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dien: ");
        double soDien = sc.nextDouble();
        if (soDien < 50.0D) 
            System.out.println("Tien dien tra: "+soDien*1000.0D);
        else
            System.out.println("Tien dien tra: "+soDien*1200.0D);
    }
}
