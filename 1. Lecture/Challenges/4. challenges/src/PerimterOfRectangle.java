import java.util.Scanner;

public class PerimterOfRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE HEIGHT OF THE RECTANGLE : ");
        int height = input.nextInt();
        System.out.print("PLEASE ENTER THE BASE OF THE RECTANGLE : ");
        int base = input.nextInt();
        int perimeter = 2*(height+base);
        System.out.print("PERIMETE OF THE RECTANGLE IS : "+ perimeter);
    }
}
