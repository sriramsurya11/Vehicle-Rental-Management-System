import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Vehicle Management System.");
        boolean flag=true;
        while(flag)
        {
            System.out.println("1------Admin.");
            System.out.println("2------Customer.");
            System.out.println("3------Exit.");
            flag=false;
        }
        System.out.print("Enter:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    }
}