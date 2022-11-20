import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ред 1.	Бюджет за филма – реално число в интервала [1.00 … 1000000.00]
        double budge = Double.parseDouble(scanner.nextLine());
        //Ред 2.	Брой на статистите – цяло число в интервала [1 … 500]
        int countStat = Integer.parseInt(scanner.nextLine());
        //Ред 3.	Цена за облекло на един статист – реално число в интервала [1.00 … 1000.00]
        double clothesProPerson = Double.parseDouble(scanner.nextLine());
        //•	Декорът за филма е на стойност 10% от бюджета.
        double decor = budge * 0.10;
        //•	При повече от 150 статиста,  има отстъпка за облеклото на стойност 10%.
        if (countStat > 150){
            clothesProPerson=clothesProPerson - clothesProPerson * 0.1;
        }
        double priceClothes = clothesProPerson * countStat;
        double costs = budge - priceClothes-decor;
        double diff = Math.abs(costs);


        if (priceClothes + decor > budge){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        }else if(priceClothes + decor <= budge) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",diff);
        }

    }
}

