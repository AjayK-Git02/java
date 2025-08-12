import java.util.Scanner;

public class arithmatic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE FIRST NUMBER : ");
        int num1 = input.nextInt();
        System.out.print("PLEASE ENTER THE SECOND NUMBER : ");
        int num2 = input.nextInt();
        int sum = num1+num2;
        int sub = num1-num2;
        int multi = num1*num2;
        float divide = (float) num1/num2;
        System.out.println("ADDITION : "+sum);
        System.out.println("SUBTRACTION : "+sub);
        System.out.println("MULTIPLICATION : "+multi);
        System.out.println("DIVISION : "+divide);
    }
}
