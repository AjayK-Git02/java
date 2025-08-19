import java.util.Scanner;

public class loop {
    public static void main(String[] args){
//        int num = 500; //initilization
//        while(num>=200){ //condition
//            System.out.println(num);
//            num = num-1; // updating the condition
//        }
        Scanner input = new Scanner(System.in);
        int i =0;
        while(i<5){
            int num = input.nextInt();
            System.out.println("Number is "+num);
            i+=1;
        }
    }
}
