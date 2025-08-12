import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise And Operator");
        System.out.print("PLEASE ENTER THE FIRST NUMBER : ");
        int num1 = input.nextInt();
        System.out.print("PLEASE ENTER THE SECOND NUMBER :");
        int num2 = input.nextInt();
        int result = num1 & num2;//AND BITWISE OPERATION
        int result2 = num1 | num2;// OR BITWISE OPERATION
        System.out.println("RESULT OF AND BITWISE OPERATION :"+result);
        System.out.println("RESULT OF OR BITWISE OPERATION : "+result2);
    }
}
