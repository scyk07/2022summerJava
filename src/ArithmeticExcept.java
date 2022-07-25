import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ArithmeticExcept {
    public static void main(String[] args) {
        try {
            System.out.println((10/0));
            FileReader f = new FileReader("aa.txt");
        } catch (ArithmeticException e){
            System.out.println("!!ArithmeticException!!");
        } catch (FileNotFoundException e){
            System.out.println("!!No File!!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            System.out.println("Enter Final");
        }
        System.out.println("Normal Ends");
    }
}
