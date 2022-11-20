import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = 0;

        String day = "Monday";

        String whatDayItIs = scanner.nextLine();

        if(day.equals(whatDayItIs)){
            money = 10;
        }
        System.out.println(money);
    }
}
