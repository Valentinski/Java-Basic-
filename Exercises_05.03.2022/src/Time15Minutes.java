import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine()) + 15;
        //Часовете винаги са между 0 и 23, а минутите винаги са между 0 и 59. Часовете се изписват с една или две цифри.
        // Минутите се изписват винаги с по две цифри, с водеща нула, когато е необходимо.
        if( hours >= 0 && hours <=23){
        }
        if(minutes >= 0 && minutes <=59){
        }
        int timeHours = hours * 60 + minutes;
        int totalTime = timeHours / 60;
        int totalTimeWithRest = timeHours % 60;

        if (totalTime > 23) {
            totalTime = 0;
        }
        if( totalTimeWithRest < 10 ) {
            System.out.printf("%d:0%d", totalTime, totalTimeWithRest);
        }else {
            System.out.printf("%d:%d", totalTime, totalTimeWithRest);
        }

    }
}
