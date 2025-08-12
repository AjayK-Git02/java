import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO DRIVING LICENSE PORTAL");
        System.out.print("PLEASE ENTER YOUR AGE : ");
        int age = input.nextInt();
        if (age>=18){
            System.out.println("YOU ARE ELIGIBLE FOR DRIVEING.");
        }else{
            System.out.println("YOU ARE NOT ELIGIBLE FOR DRIVING.");
        }
    }
}
