import java.lang.System;
import java.util.Scanner;
class biodata
{
    public static void main(String[]args)
    {
        Scanner harish=new Scanner(System.in);
        System.out.println("enter your name");
        String name=harish.nextLine();
        System.out.println("enter age");
        int age=harish.nextInt();
        harish.nextLine();
        System.out.println("enter address");
        String address=harish.nextLine();


        System.out.println("<<<<bio data>>>");
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        harish.close();
        


    }
}