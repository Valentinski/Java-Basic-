import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tvShowName = scanner.nextLine();
        int showContTime = Integer.parseInt(scanner.nextLine());
        int breakInMinutes = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakInMinutes / 8.0;
        double restTime = breakInMinutes / 4.0;
        double remainingTime = breakInMinutes - lunchTime - restTime;

        double difference = Math.abs(remainingTime - showContTime);

        if(remainingTime >= showContTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time."
            ,tvShowName, Math.ceil(remainingTime - showContTime));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes."
            ,tvShowName, Math.ceil(difference));
        }

    }
}
