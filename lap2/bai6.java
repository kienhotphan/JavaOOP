import java.util.Scanner;
public class bai6 {

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i=1, n, gt=1;
    System.out.print("nhap vao mot so nguyen duong: ");
    n = sc.nextInt();     
    while (i<=n) {
        gt = gt*i;
        i++;
    };
    System.out.println("giai thua cua so do la: "+gt);
 }
}
