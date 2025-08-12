import java.util.Scanner;

public class ageCategorized {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Age Categorized !!");
        System.out.print("PLEASE ENTER THE AGE : ");
        int age = input.nextInt();
    if(age<13 && age>0){
        System.out.println("YOU ARE CHILD");
    }else if (age<20 && age>13){
        System.out.println("YOU ARE TEEN");
    }else if (age<60 && age>20){
        System.out.println("YOUR ARE ADULT");
    }else if(age>60 && age<120){
        System.out.println("YOU ARE SENIOR");

    }else{
        System.out.println("PLEASE ENTER THE CORRECT AGE !!!");
    }
    }
}
