import java.util.Scanner;

public class greatestNumberChecker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Greatest Number Checker !!!");
        System.out.print("PLEASE ENTER THE FIRST NUMBER : ");
        int num1 = input.nextInt();
        System.out.print("PLEASE ENTER THE SECOND NUMBER : ");
        int num2 = input.nextInt();
        System.out.print("PLEASE ENTER THE THIRD NUMBER  : ");
        int num3 = input.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(num1+" IS THE GREATEST NUMBER.");
        }else if(num2>num3){
            System.out.println(num2+" IS THE GREATEST NUMBER");
        }else{
            System.out.println(num3+" IS THE GREATEST NUMBER ");
        }
    }
}
