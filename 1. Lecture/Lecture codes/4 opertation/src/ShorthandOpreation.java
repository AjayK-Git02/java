import java.util.Scanner;

public class ShorthandOpreation {
    public static void main(String[] args){
        int num1 = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE NUMBER : ");
        int num2 = input.nextInt();
         num1 +=num2;
        System.out.println(num1);
        num1*=num2;
        System.out.println(num1);
        num1/=num2;
        System.out.println(num1);
        num1%=num2;
        System.out.println(num1);
        num1-=num2;
        System.out.println(num1);
    }
}
