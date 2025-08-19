import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int num = input.nextInt();
        greeting();
        table(num);

    }
    public static void greeting(){
        System.out.println("WELCOME TO MULTIPLICATION TABLE ");
    }
    public static void table(int  num) {
        int i = 1;
        while (i <= 10){
            System.out.println(num + "X" + i + "=" + num * i);
            i++;

        }
    }
}
