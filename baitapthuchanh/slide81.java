import java.util.Scanner;
public class slide81 {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dong, cot, max=0;
        System.out.println("nhap so dong cua mang: ");
        dong = sc.nextInt();
        System.out.println("nhap so cot cua mang: ");
        cot = sc.nextInt();
    int A[][] = new int[dong][cot];
    for(int i = 0; i < dong; i++) {
        for(int j = 0; j<cot; j++){
            System.out.println("nhap phan tu thu "+i +", "+ j);
            A[i][j] = sc.nextInt();
            max = A[0][0];
            if(max<A[i][j]){
                max = A[i][j];
            }
        }
        System.out.println("so lon nhat la: " +max);
    }
}
}
