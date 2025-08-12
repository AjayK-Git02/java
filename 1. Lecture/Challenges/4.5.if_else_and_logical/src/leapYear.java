import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Leaf Year Checker !!!");
        System.out.print("PLEASE ENTER THE YEAR : ");
        int year = input.nextInt();
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println(year+" IS A LEAP YEAR");
        }else {
            System.out.println(year+" NOT A LEAP YEAR");
        }
    }
}
