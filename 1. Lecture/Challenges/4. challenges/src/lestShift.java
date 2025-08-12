import java.util.Scanner;

public class lestShift {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("WELCOME TO LEST SHIFT OPERATION !!");
            System.out.print("PLEASE ENTER THE FIRST NUMBER : ");
            int num1 = input.nextInt();
            int result = num1 << 4;
            System.out.println(result);
}}
