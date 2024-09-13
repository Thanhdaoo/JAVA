import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Xin moi nhap so nguyen a:");
        int a = sc.nextInt();
        System.out.println("Xin moi nhap vao so nguyen b:");
        int b = sc.nextInt();
        System.out.println("Tong hai so la:" +(a+b));
        System.out.println("Hieu hai so la:" +(a-b));
        System.out.println("Tich hai so la:" +(a*b));
        System.out.println("Thuong hai so la:" +(double)(a/b));
        System.out.println("Chia lay du:" +(a%b));
    }
    
}
