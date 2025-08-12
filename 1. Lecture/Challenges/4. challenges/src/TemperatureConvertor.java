import java.util.Scanner;

public class TemperatureConvertor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE TEMPERATURE [IN FAHRENHEIT] : ");
        float f = input.nextFloat();
        float c = (f-32)*5.0f/9.0f;
        System.out.print("TEMPERATURE IN CELSIUS : "+ c);
    }
}
