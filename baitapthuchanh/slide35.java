import java.util.Scanner;
public class slide35{

public static void main(String[] args) {
    int a, b;
    Scanner sc = new Scanner (System.in);
    System.out.println("nhap vao so a");
    a = sc.nextInt();
    System.out.println("nhap vao so b");
    b = sc.nextInt();
    if (a<b){
        System.out.println("so be hon la a = "+a);
    } else{
        System.out.println("so be hon la b = "+b);
    }
   }
}  