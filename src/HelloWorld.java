import java.util.InputMismatchException;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i < 1000){
            try {
                System.out.print("Input: ");
                i = sc.nextInt();

                if (i <= 10){
                    System.out.println("i is less & equal 10");
                } else {
                    System.out.println("i is over 10");
                }

                switch(i){
                    case 1:
                        System.out.println("i is 1");
                        break;
                    case 2:
                        System.out.println("i is 2");
                        break;
                    default:
                        System.out.println("i is not 1 nor 2");
                }





            } catch (InputMismatchException e){
                System.out.println("!!Input is not Integer!!");
            }
        }
        System.out.println("After catch.");
    }
}
