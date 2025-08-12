import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE PRINCIPLE : ");
        float p = input.nextFloat();
        System.out.print("PLEASE ENTER THE RATE : ");
        float r = input.nextFloat();
        System.out.print("PLEASE ENTER THE TIME [IN YEARS] : ");
        float t = input.nextFloat();
        float compound =(float) p*(1+r/100)*t;
        System.out.print("COMPOUND INTEREST IS : "+compound);

        }
    }

