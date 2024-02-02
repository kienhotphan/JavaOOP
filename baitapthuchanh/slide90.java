import java.util.Scanner;
public class slide90 {
    
public static void main(String[] args) {
    String chuoi;
    char kyTu;
    Scanner sc = new Scanner(System.in);
    System.out.print("nhap vao mot chuoi bat ky: ");
    chuoi = sc.nextLine();
    System.out.print("cac ky tu trong chuoi la: ");
      for (int i = 0; i < chuoi.length(); i++) {
          kyTu = chuoi.charAt(i);
          System.out.print("\n" +kyTu);
      }
  }
}