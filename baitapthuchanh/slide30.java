import java.util.Scanner;
public class slide30{

public static void main(String[] args) {
    int n, t = 0;
    Scanner sc = new Scanner (System.in);
    System.out.println("nhap vao so nguyen duong n");
    n = sc.nextInt();
    do {
        t = t+n%10;
        n = n/10;
    }
    while (n!=0);
    System.out.println("tong chu so vua nhap la: "+t);
   }
}  