import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount Calculator");
        System.out.println("PLEASE ENTER YOUR AGE : ");
        int age = input.nextInt();
        System.out.println("ARE YOU FEMALE ? [TRUE/FALSE] : ");
        boolean isfemale = input.nextBoolean();

        if(age<5){
            System.out.println("you got 75%");
        } else if (isfemale) {
            System.out.println("you got 50%");
        }else if (age>60&& !isfemale){
            System.out.println("you got 25%");
        }else {
            System.out.println("You got not discount");
        }
    }
}
