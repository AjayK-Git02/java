import java.util.Scanner;

public class LCM {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO LCM CALCULATOR !!!");
        System.out.print("PLEASE ENTER THE FIRST NUMBER : ");
        int num1 = input.nextInt();
        System.out.print("PLEASE ENTER THE SECOND NUMBER : ");
        int num2 = input.nextInt();
        int lcm = lcm( num1, num2);
        System.out.println("LCM OF TWO NUMBER IS :" +lcm);

    }
    public static int lcm(int num1 , int num2){
        int i = 1;
        while (i <=num2){
            int factor = num1*i;
            if(factor % num2 ==0){
                return factor;
            }
            i++;
        }
        return 0;// unreachable
    }
}
