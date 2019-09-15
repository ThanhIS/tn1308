package L1;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap b: ");
        double b = sc.nextDouble();
        System.out.println("Nhap c: ");
        double c = sc.nextDouble();
        double delta = Math.pow(b, 2.0D)- 4.0D*a*c;
        System.out.println("Can bac hai cua delta: " + Math.sqrt(delta));
    }
}
