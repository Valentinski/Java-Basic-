import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // брой отворени табове
        int salary = Integer.parseInt(scanner.nextLine());

        int fine = 0;

        for (int i = 1; i <= n; i++) {

            String nameOfSite = scanner.nextLine();

            switch (nameOfSite) {
                case "Facebook":
                    fine = fine + 150;
                    break;
                case "Instagram":
                    fine = fine + 100;
                    break;
                case "Reddit":
                    fine = fine + 50;
                    break;
            }

        }
        int diff = salary - fine;
        if (diff <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.printf("%d", diff);

        }

    }
}

