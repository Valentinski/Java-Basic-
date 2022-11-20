import java.util.Scanner;

public class ToyShop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceTrip = Double.parseDouble(scanner.nextLine()); // Цена на екскурзията
        int puzzles = Integer.parseInt(scanner.nextLine()); // Брой пъзели
        int dolls = Integer.parseInt((scanner.nextLine())); // Брой говорещи кукли
        int teddyBears = Integer.parseInt(scanner.nextLine()); // Брой плюшени мечета
        int minions = Integer.parseInt(scanner.nextLine()); // Брой миньони
        int trucks = Integer.parseInt(scanner.nextLine()); //  Брой камиончета

        //•	Пъзел - 2.60 лв.
        double pricePuzzles = puzzles * 2.60;
        //•	Говореща кукла - 3 лв.
        double priceDolls = dolls * 3;
        //•	Плюшено мече - 4.10 лв.
        double priceTeddyBears = teddyBears * 4.10;
        //•	Миньон - 8.20 лв.
        double priceMinions = minions * 8.2;
        //•	Камионче - 2 лв.
        double priceTrucks = trucks * 2;

        double totalPrise = pricePuzzles + priceDolls + priceTeddyBears + priceMinions + priceTrucks; //Обща цена на играчките.
        int countOfToys = puzzles + dolls + teddyBears + minions + trucks; // Общ брой на играчките.

        if (countOfToys >= 50){
            totalPrise = totalPrise - totalPrise * 0.25;
        }
        double profitAfterRent = totalPrise - totalPrise * 0.1;

        if ( profitAfterRent >= priceTrip){
            System.out.printf("Yes! %.2f lv left.", profitAfterRent - priceTrip);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", priceTrip - profitAfterRent);
        }
    }
}
