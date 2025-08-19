public class function_loop {
    public static void main(String[] args){
        patterns();

    }
    public static void patterns(){
        int rows = 0;
        while (rows < 50){
            System.out.print("*");
            int i =0;
            while(i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}
