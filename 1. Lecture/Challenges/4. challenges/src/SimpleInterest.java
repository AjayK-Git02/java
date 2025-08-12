import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE PRINCIPLE [AMOUNT TO INVEST] : ");
        float p = input.nextFloat();
        System.out.print("PLEASE ENTER THE TIME [IN YEARS] : ");
        float t = input.nextFloat();
        System.out.print("PLEASE ENTER THE RATE : ");
        float r = input.nextFloat();
        float simple = (p*r*t)/100;
        System.out.print("SIMPLAE INTERSET IS : "+ simple);
    }
}
