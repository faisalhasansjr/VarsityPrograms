package SingleInheritance.java;
import java.util.Scanner;
class Person {
    String name;
    public void getdata_person() {
        System.out.print("Enter your name:");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
    }
    public void display_person() {
        System.out.println("Your name is:" + name);
    }
}

public class Programmer extends Person {
    String vname;
    public void getdata_programmer() {
        System.out.print("Hei " +name+ "!,"  + " Please enter your varsity name:");
        Scanner sc = new Scanner(System.in);
        vname = sc.nextLine();
    }
    public void display_programmer() {
        System.out.println("Varsity:" + vname);
    }

    public static void main(String args[]) {
        Programmer p = new Programmer();
        p.getdata_person();
        p.getdata_programmer();
        p.display_person();
        p.display_programmer();
    }
}
