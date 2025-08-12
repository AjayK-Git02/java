import java.util.Scanner;

public class positiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number Checker !!!");
        System.out.print("PLEASE ENTER THE NUMBER : ");
        int num = input.nextInt();
        if (num==0){
            System.out.println("NUMBER IS ZERO");
        }else if (num>0){
            System.out.println("Number is Positive : "+num);
        }else{
            System.out.println("Number is Negative : "+num);
        }
    }
}
