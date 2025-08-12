import java.sql.SQLOutput;
import java.util.Scanner;

public class productOfFloatNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE FIRST NUMBER : ");
        float num1 = input.nextFloat();
        System.out.print("PLEASE ENTER THE SECOND NUMBER : ");
        float num2 = input.nextFloat();
        float prod = num1*num2;
        System.out.print("PRODUCT OF TWO FLOAT NUMBER IS : "+prod);
    }
}
