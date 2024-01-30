import java.util.Scanner;
public class slide47 {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, t = 0;
    System.out.println("nhap so ban muon");
    do {
        a = sc.nextInt();
        t = t+a;
    }
    while (t<=100);
    System.out.println("tong cac so vua nhap la: "+t);
}
}
