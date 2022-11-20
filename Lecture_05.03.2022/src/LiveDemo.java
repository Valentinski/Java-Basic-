import java.util.Scanner;
public class LiveDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String currentDay = scanner.nextLine();
        double salary = 0;
        if (currentDay.equals("Monday")) {
            salary=Double.parseDouble((scanner.nextLine()));

        }

        System.out.println(salary);
    }
}

