import java.util.Scanner;

public class SumOfOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("WELCOME TO ODD SUM ");
        System.out.print("PLEASE ENTER THE NUMBER : ");
        int num = input.nextInt();
        int sum = OddSum(num);
        System.out.println("ODDSUM TILL "+ num + " IS : "+ sum);

    }
    public static int OddSum(int num){
        int sum = 0;
        int i =1;
        while (i<=num){
            sum+=i;
            i+=2;
        }
        return sum;
        }
    }

