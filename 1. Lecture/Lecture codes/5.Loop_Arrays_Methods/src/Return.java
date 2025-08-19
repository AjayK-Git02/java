import java.util.Scanner;

public class Return {
    public static void main(String[] args){
        greeting();
        int num1 = readNumber();
        int num2 = readNumber();
        int sum = num1+num2;
        System.out.println("SUM OF TWO NUMBER IS : "+sum);

    }
    public static void greeting(){
        System.out.println("WELCOME TO CALCULATOR");
    }
    public  static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE NUMBER : ");
        int number = input.nextInt();
        return number;
    }
}
