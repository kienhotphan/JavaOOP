import java.util.Scanner;
public class ptbac2{

public static void main(String[] args) {
    int a, b, c;
    double d, x, x1, x2;
    Scanner sc = new Scanner (System.in);
    System.out.println("nhap he so a: ");
     a = sc.nextInt();
     System.out.println("nhap he so b: ");
     b = sc.nextInt();
     System.out.println("nhap he so c: ");
     c = sc.nextInt();
     d = (b*b) - (4*a*c);
     if (d<0){
     System.out.println("pt vo nghiem");}
     else
      {
        if (d==0){
        x = -b/2*a;    
        System.out.println("pt co nghiem kep la:" +x );
        }
        else {
            x1 = (-b + Math.sqrt(d))/2*a;
            x2 = (-b - Math.sqrt(d))/2*a;
            System.out.println("pt co 2 nghiem la:");
            System.out.println("x1 = " +x1);
            System.out.println("x2 = " +x2);
        }
      }
   }
}  