import java.util.Scanner;
public class bai11 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    do {
        System.out.println("nhap so phan tu cua mang: ");
        n = sc.nextInt();
    } while(n<0);
    int a[] = new int[n];
    for(int i = 0; i < n; i++) {
        System.out.println("nhap phan tu thu "+i +": ");
        a[i] = sc.nextInt();
    }
    System.out.println("mang ban dau:");
    for(int i = 0; i < n; i++) {
        System.out.println("a["+i +"]= "+a[i]);
    }
    int temp = a[0];
    for (int i = 0 ; i < a.length - 1; i++) {
        for (int j = i + 1; j < a.length; j++) {
             if (a[i] > a[j]) {
                temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                }
            }
        }
    System.out.println("mang da sap xep:");
    for(int i = 0; i < n; i++) {
        System.out.println("a["+i +"]= "+a[i]);        
    }
} 
}   