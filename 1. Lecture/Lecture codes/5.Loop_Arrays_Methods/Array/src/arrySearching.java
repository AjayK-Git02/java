import java.util.Scanner;

public class arrySearching {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {3, 6, 8, 5, 12, 45, 3, 36, 45, 78, 32, 14 };
        System.out.print("WELCOME TO ARRAY SEARCHING \n");
        System.out.print("Enter the number you want to search : ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if(isFound){
            System.out.println("YOUR NUMBER IS FOUND IN ARRRAY : " + num);
        }else{
            System.out.println("YOUR NUMBER IS NOT FOUND IN ARRAY : "+num);
        }
    }
    public static boolean isFound(int[] arr, int num){
        int index = 0;
        while(index< arr.length){
            if(arr[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }
}
