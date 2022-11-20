import java.util.Scanner;

public class WorldSwimmingRecord2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.	Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
        double recordInSec = Double.parseDouble(scanner.nextLine());
        //2.	Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
        double distanceInMet = Double.parseDouble(scanner.nextLine());
        //3.	Времето в секунди, за което плува разстояние от 1 м. - реално число в интервала [0.00 … 1000.00]
        double timeInSec = Double.parseDouble(scanner.nextLine());

        double timeDistance = distanceInMet * timeInSec;
        double waterResistance = (Math.floor( distanceInMet / 15 ) )* 12.5;
        double timeTotal = timeDistance + waterResistance;

        if ( recordInSec <= timeTotal){
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(recordInSec - timeTotal));
        }else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeTotal);
        }
    }
}
