import java.util.Calendar;
import java.util.Scanner;
public class bai3 {
    
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int namsinh, namnay, tuoi;
    String ten;
    Calendar instance = Calendar.getInstance();
    namnay = instance.get(Calendar.YEAR);
    System.out.println("nhap ten: ");
    ten = sc.nextLine();
    System.out.println("nhap nam sinh: ");
    namsinh = sc.nextInt();
    tuoi = namnay-namsinh;
    if (tuoi<16) {
        System.out.println("ban " +ten + " o do tuoi vi thanh nien");
    } else {
        if (tuoi<18) {
            System.out.println("ban " +ten + " o do tuoi truong thanh");
        } else {
            System.out.println("ban " +ten + " da gia");
        }
    }
}
}
