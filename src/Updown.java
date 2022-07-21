import java.util.Scanner;

public class Updown {
    public static void main(String[] args) {
        int iAnswer, iTrial; // 자료형(int) / 정보(답)
        String sInput; // 자료형(String) / 정보(입력값)
        Scanner scStd = new Scanner(System.in); // 클래스(Scanner)

        // System.out.print("Answer: "); // 정답
        // sInput = scStd.nextLine();

        // iAnswer = Integer.parseInt(sInput); // 문자열 -> 숫자로

        iAnswer = (int) Math.round(Math.random()*100);

        for(int i=1; i<=5; i++) {
            System.out.printf("trial %d(0~100): ", i); // n차 시도
            sInput = scStd.nextLine();

            iTrial = Integer.parseInt(sInput);

            if (iAnswer == iTrial)
                System.out.println("Correct");
            else
                System.out.println("Wrong");
        }
    }
}
