import java.util.Scanner;
public class bai9 {
    
public static void main(String[] args) {
    String chuoi;
    char kyTu;
    int demso=0, inthuong=0, inhoa=0;
    Scanner sc = new Scanner(System.in);
    System.out.print("nhap vao mot chuoi bat ky: ");
    chuoi = sc.nextLine();
      for (int i = 0; i < chuoi.length(); i++) {
          kyTu = chuoi.charAt(i);
          int asciiCode = kyTu;
          if (asciiCode>=48 && asciiCode<=57) {
            demso++;
          } 
          else if (asciiCode>=97 && asciiCode<=122) {
            inthuong++;
          } 
          else if (asciiCode>=65 && asciiCode<=90) {
            inhoa++;
          } 
      }
      System.out.println("so chu so co trong chuoi la: "+demso);
      System.out.println("so chu thuong co trong chuoi la: "+inhoa);
      System.out.println("so chu hoa co trong chuoi la: "+inthuong);
  }
}