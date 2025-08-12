import java.util.Scanner;

public class DGradesCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Grades Calculator !!!");
        System.out.print("PLEASE ENTER YOUR MARKS TO CHECK THE GRADE : ");
        int marks = input.nextInt();
        if(marks>90 && marks<100){
            System.out.println("YOUR GRADE IS A");
        }else if(marks<90 && marks>75){
            System.out.println("YOUR GRADE IS B");
        }else if(marks<75 && marks>60){
            System.out.println("YOUR GRADE IS C");
        }else if(marks<60 && marks>30){
            System.out.println("YOUR GRADE IS D");
        }else if(marks<30 && marks>0){
            System.out.println("YOUR GRADED IS F ");
        }else{
            System.out.println("PLEASE ENTER THE CORRECT MARKS !!");
        }
    }
}
