public class Parameter {
    public static void main(String[] args) {
        int num = sumToNumber(4, 7);
        System.out.println(num);

    }
    public static int sumToNumber(int num1, int num2){
        System.out.println("FIRST NUMBER RECEIVED : "+num1);
        System.out.println("SECOND NUMBER RECEIVED : "+num2);
        int sum = num1+num2;
        return sum;
    }
}
