import java.util.Scanner;

public class ScanTest {
    public static void main(String[] args) {
        int a, b, res=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("A: ");
        a=Integer.parseInt(sc.nextLine());
        System.out.println("B: ");
        b=Integer.parseInt(sc.nextLine());
        System.out.println("연산자:");
        char c = sc.nextLine().charAt(0);
        switch(c){
            case '+':
                res = a+b;
                break;
        }
        System.out.println("계산 결과:");
        System.out.println(res);
    }
}
