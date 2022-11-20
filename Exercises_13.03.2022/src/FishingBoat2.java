import java.util.Scanner;

public class FishingBoat2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Бюджет на групата – цяло число в интервала [1…8000]
        int budget = Integer.parseInt(scanner.nextLine());
        //•	Сезон –  текст : "Spring", "Summer", "Autumn", "Winter"
        String season = scanner.nextLine();
        //•	Брой рибари – цяло число в интервала [4…18]
        int countOfFishMans = Integer.parseInt(scanner.nextLine());

        double priceBoat = 0;

        switch (season){
            case "Spring":
                priceBoat = 3000;
                if(countOfFishMans <= 6){
                    priceBoat = priceBoat - priceBoat * 0.1;
                }else if(countOfFishMans <= 11){
                    priceBoat = priceBoat - priceBoat * 0.15;
                }else {
                    priceBoat = priceBoat - priceBoat * 0.25;
                }
                break;
            case "Summer":
                priceBoat = 4200;
                if(countOfFishMans <= 6){
                    priceBoat = priceBoat - priceBoat * 0.1;
                }else if(countOfFishMans <= 11){
                    priceBoat = priceBoat - priceBoat * 0.15;
                }else {
                    priceBoat = priceBoat - priceBoat * 0.25;
                }
                break;
            case "Autumn":
                priceBoat = 4200;
                if(countOfFishMans <= 6){
                    priceBoat = priceBoat - priceBoat * 0.1;
                }else if(countOfFishMans <= 11){
                    priceBoat = priceBoat - priceBoat * 0.15;
                }else {
                    priceBoat = priceBoat - priceBoat * 0.25;
                }
                break;
            case "Winter":
                priceBoat = 2600;
                if(countOfFishMans <= 6){
                    priceBoat = priceBoat - priceBoat * 0.1;
                }else if(countOfFishMans <= 11){
                    priceBoat = priceBoat - priceBoat * 0.15;
                }else {
                    priceBoat = priceBoat - priceBoat * 0.25;
                }
                break;

        }
        if(countOfFishMans % 2 == 0 && !season.equals("Autumn")){
            priceBoat = priceBoat - priceBoat * 0.05;
        }

        double total =Math.abs(budget - priceBoat);

        if(budget > priceBoat){
            System.out.printf("Yes! You have %.2f leva left.",total);
        }else{
            System.out.printf("Not enough money! You need %.2f leva.",total);
        }
    }
}
