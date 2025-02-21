import java.util.*;
class C{
    public int a,b,c;
    public void sum()
{
System.out.println("Sum="+c);
}
public static void main(String[]args){
   C obj=new C();
   Scanner in=new Scanner(System.in);
   obj.a=in.nextInt();
   obj.b=in.nextInt();
   obj.c=obj.a + obj.b;
   obj.sum();
}
}