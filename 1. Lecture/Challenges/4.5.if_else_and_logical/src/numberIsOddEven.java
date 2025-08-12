import java.util.Scanner;

public class numberIsOddEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Even Checkor");
        System.out.print("PLEASE ENTER THE NUMBER : ");
        int num = input.nextInt();
        if(num%2==0){
            System.out.print("NUMBER IS EVEN : "+num);
        }else{
            System.out.print("NUMBER IS ODD : "+num);
        }
    }
}
