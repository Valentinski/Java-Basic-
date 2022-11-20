import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budged = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double videoCardsPrice = videoCards * 250;
        double processorsPrice = videoCardsPrice * 0.35 * processors;
        double ramPrice = videoCardsPrice * 0.1 * ram;

        double totalSum = videoCardsPrice + processorsPrice + ramPrice;

        if(videoCards > processors){
            totalSum = totalSum - (totalSum*0.15);
        }
        double diff = Math.abs(budged - totalSum);
        if(totalSum <= budged){
            System.out.printf("You have %.2f leva left!", diff);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }

    }
}
