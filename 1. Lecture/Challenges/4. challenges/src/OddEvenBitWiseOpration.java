import java.util.Scanner;

public class OddEvenBitWiseOpration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("CHECK THE NUMBER BY USING BITWISE OPERATION !!");
        System.out.print("PLEASE ENTER THE NUMBER  : ");
        int num1  = input.nextInt();
        if((num1 & 1)==1){
            System.out.println("YOUR NUMBER IS ODD !!!");
        }else{
            System.out.println("YOUR NUMBER IS EVEN !!!");
        }
    }
}
