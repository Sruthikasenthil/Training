import java.util.*;
class Student{
    String Name;
    String ID;
    void get()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the name:");
        Name=in.nextLine();
        System.out.println("Enter the reg no:");
        ID=in.nextLine();
        System.out.print("Name:"+Name+" "+"ID"+ID);
    }
    
}

class Main
{
    public static void main(String args[]){
        Student s=new Student();
        s.get();
    }
}