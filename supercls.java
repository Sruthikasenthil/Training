import java.util.*;
class Main
{
    public static void main(String s[])
    {
        Super obj=new Sub();
        obj.disp();
    }
}
class Super {
    static void disp()
    {
    System.out.println("In super class");
    }
}
class Sub extends Super
{
    static void disp()
        {
            System.out.println("In sub class");
        }
}

