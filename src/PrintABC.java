public class PrintABC {
    public static int add(int a, int b){return a+b;}
    public static double add(double a, double b){return a+b;}
    public static String add(String a, String b){return a+b;}
    public static String add(char a, char b){return String.valueOf(a) + String.valueOf(b);}
    public static void main(String[] args) {
        System.out.println(add(5,3));
        System.out.println(add(5.1,3.1));
        System.out.println(add("AA", "BB"));
        System.out.println(add('a','b'));
    }
}
