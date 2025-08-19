import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO SUM OF DIGIT'S");
        System.out.print("PLEASE ENTER THE DIGIT : ");
        int num = input.nextInt();
        int sum = SumOfDigit(num);
        System.out.println("SUM OF THE DIGIT "+num+" IS : "+sum);

    }
    public static int SumOfDigit(int num){
        int sum =0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }

        return sum;
    }
}
