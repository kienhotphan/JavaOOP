import java.util.Scanner;
public class bai8 {

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, number, tong = 0;
    System.out.println("muon nhap bao nhieu so: ");
    do {
        n = sc.nextInt(); 
    } while (n<=0);
    for(int i=0; i<n; i++){
        System.out.print("nhap so ban muon: ");
        number = sc.nextInt();
        tong = tong + number;
    }
    System.out.print("trung binh cong la: "+ tong/n);
 }
}
