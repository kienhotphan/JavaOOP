import java.util.Scanner;
public class ptbac1{

public static void main(String[] args) {
    int a, b;
    float no;
    Scanner sc = new Scanner (System.in);
    System.out.println("nhap he so a: ");
     a = sc.nextInt();
     System.out.println("nhap he so b: ");
     b = sc.nextInt();
     no = -b/a;
    System.out.println("nghiem cua pt bac 1 la: x = " +no );
   }
}  