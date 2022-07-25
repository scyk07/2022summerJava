import java.util.Scanner;

public class RCS {












    public static void main(String[] args) {
        int iCpu;
        String sCpu, sUser;
        String sRcs[] = new String[]{"가위","바위","보"};
        Scanner scStd = new Scanner(System.in); // 클래스(Scanner)

        iCpu = (int) Math.round(Math.random()*2);

        sCpu=sRcs[iCpu];

        /*
        switch(iCpu){
            case 1:
                sCpu = "가위";
                break;
            case 2:
                sCpu = "바위";
                break;
            case 3:
                sCpu = "보";
                break;
        }*/

        sUser = scStd.nextLine();

        System.out.println("CPU: " + sCpu);
        System.out.println("User: " + sUser);
        if(sCpu.equals(sUser))
            System.out.println("Draw");
        else if(sCpu.equals("가위")&&sUser.equals("바위") || sCpu.equals("보")&&sUser.equals("가위") || sCpu.equals("바위")&&sUser.equals("보"))
            System.out.println("Win");
        else if(sCpu.equals("가위")&&sUser.equals("보") || sCpu.equals("보")&&sUser.equals("바위") || sCpu.equals("바위")&&sUser.equals("가위"))
            System.out.println("Lose");
    }
}
