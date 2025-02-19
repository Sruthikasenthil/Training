import java.util.*;
class Main {
    public static void main(String[] args) {
     Scanner in =new Scanner(System.in);
     System.out.print("Enter the integer value:");
     int a[]=new int[3];
     for(int i=0;i<a.length;i++){
         a[i]=in.nextInt();
         System.out.println(a[i]);
     }
    }
}