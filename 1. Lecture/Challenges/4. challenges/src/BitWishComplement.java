import java.util.Scanner;

public class BitWishComplement {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("WELCOME TO NOT/COMPLIMENT BITWISE OPERATION !!");
            System.out.print("PLEASE ENTER THE FIRST NUMBER : ");
            int num1 = input.nextInt();
            System.out.print("PLEASE ENTER THE SECOND NUMBER : ");
            int num2 = input.nextInt();
            int result = num1 ^num2;
            System.out.println("BEFORE NOT/COMPLIMENT BITWISE OPERATION");
            System.out.println("RESULT : "+result);
            int result1 = ~result;
            System.out.println("AFTER COMPLIMENT BITWISE OPERATION : ");
            System.out.print("RESULT : "+result1);
        }
    }

