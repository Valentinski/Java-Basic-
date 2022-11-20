import java.util.Scanner;
import static java.lang.System.in;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int a = Integer.parseInt(scanner.nextLine());

        if (a % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
