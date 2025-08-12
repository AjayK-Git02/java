import java.util.Scanner;

public class XorBitwiseOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("XOR BITWISE OPERATION !!");
        System.out.print("PLEASE ENTER THE FIRST NUMBER : ");
        int num1 = input.nextInt();
        System.out.print("PLEASE ENTER THE SECOND NUMBER : ");
        int num2 = input.nextInt();
        int result = num1 ^num2;
        System.out.println("RESULT OF XOR BITWISE OPERATION : "+result);
    }
}
