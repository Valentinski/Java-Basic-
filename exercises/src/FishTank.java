import java.util.Scanner;

public class FishTank {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //1.	Дължина в см – цяло число в интервала [10 … 500]
        int length = Integer.parseInt(scanner.nextLine());
        //2.	Широчина в см – цяло число в интервала [10 … 300]
        int width = Integer.parseInt(scanner.nextLine());
        //3.	Височина в см – цяло число в интервала [10… 200]
        int height = Integer.parseInt(scanner.nextLine());
        //4.	Процент  – реално число в интервала [0.000 … 100.000]
        double percent = Double.parseDouble(scanner.nextLine());
        //      Пясък, растения, нагревател и помпа.  Кръщаваме ги като "процент"
        int litersInCm = length * width * height;
        double litersInDm = litersInCm * 0.001;
        double litersNeeded = litersInDm - (litersInDm * percent/100);

        System.out.println(litersNeeded);


    }
}
