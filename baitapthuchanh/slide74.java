import java.util.Scanner;
public class slide74 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, tong=0;
    do {
        System.out.println("nhap so phan tu cua mang: ");
        n = sc.nextInt();
    } while(n<0);
    int a[] = new int[n];
    for(int i = 0; i < n; i++) {
        System.out.println("nhap phan tu thu "+i +": ");
        a[i] = sc.nextInt();
    }
    for(int i = 0; i<n; i++){
        if(a[i]%2==0){
            tong = tong + a[i];
        }
    }
    System.out.println("tong= " + tong);
}    
}
