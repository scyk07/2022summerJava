import java.util.InputMismatchException;
import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        int input = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        input = sc.nextInt();
        prtGraph(input);
    }
    public static void prtGraph(int px){
        int w = px/2;
        for (int i = w; i >= -w; i--){
            for (int j = -w; j <= w; j++) {
                if(i==0 && j==0)
                    System.out.print("O ");
                else if(i == j)
                    System.out.print("# ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
