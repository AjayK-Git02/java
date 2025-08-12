import java.util.Scanner;

public class AndBitwishand {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("AND BITWISH OPERATION !!");
        System.out.print("PLEASE ENTER THE FIRST NUMBER : ");
        int num1 = input.nextInt();
        System.out.print("PLEASE ENTER THE SECOND NUMBER : ");
        int num2 = input.nextInt();
        int result = num1 & num2;
        System.out.print("RESULT OF AND OPERATION : "+result);
    }
}
