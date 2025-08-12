import java.util.Scanner;

public class nameInput {
    public static void main(String[] args){
        Scanner input = new  Scanner(System.in);
        System.out.print("PLEASE ENTER THE NAME  : ");
        String name = input.nextLine();
        System.out.print(name+", please also tell the age of your [IN NUMBER] : ");
        int age = input.nextInt();
        System.out.print("WELCOME MR."+name+" and your age is "+age);
    }
}
