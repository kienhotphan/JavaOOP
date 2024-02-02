import java.util.Scanner;
public class bai10 {
    
public static void main(String[] args) {
    String chuoi, a;
    char kyTu, kytubatky;
    int dem=0;
    Scanner sc = new Scanner(System.in);
    do {
      System.out.print("nhap vao mot chuoi bat ky: ");
      chuoi = sc.nextLine();
      } while(chuoi.length()>80);
    System.out.println("nhap vao mot ky tu bat ky: ");
    a = sc.nextLine();
    kytubatky = a.charAt(0);
    for (int i = 0; i < chuoi.length(); i++) {
       kyTu = chuoi.charAt(i);
       if(kyTu == kytubatky){
        dem++;
       }
    }
    System.out.println("so lan xuat hien la: "+dem);
  }
}