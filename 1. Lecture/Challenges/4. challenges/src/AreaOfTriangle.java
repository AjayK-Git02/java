import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE HEIGHT OF THE TRIANGLE : ");
        int height = input.nextInt();
        System.out.print("PLEASE ENTER THE VASE OF THE TRIANGLE : ");
        int base = input.nextInt();
        float area = (float) 1/2*base*height;// you can also use 0.5 as  1/2 [0.5 = 1/2]
        System.out.print("AREA OF TRIANGLE IS : "+ area);
    }
}
