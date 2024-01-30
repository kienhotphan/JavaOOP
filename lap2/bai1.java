import java.util.Scanner;
public class bai1{

public static void main(String[] args) {
    int a, b, tong, hieu, tich, thuong, cld;
    Scanner sc = new Scanner (System.in);
    System.out.println("nhap so a: ");
     a = sc.nextInt();
    System.out.println("nhap so b: ");
     b = sc.nextInt();
     tong = a+b;
    System.out.println("tong cua 2 so nguyen la: " +tong );
     hieu = a-b;
     System.out.println("hieu cua 2 so nguyen la: " +hieu );
     tich = a*b;
     System.out.println("tich cua 2 so nguyen la: " +tich );
     thuong = a/b;
     System.out.println("thuong cua 2 so nguyen la: " +thuong );
     cld = a%b;
     System.out.println("cld cua 2 so nguyen la: " +cld );
     if (a==b){
        System.out.println("a bang b");
     }
     else {
        if (a>b){
            System.out.println("a lon hon b");
        }
        else {
            System.out.println("b lon hon a");
        }
     }
   }
}  