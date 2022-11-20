import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първи ред – Бюджет, реално число в интервала [10.00...5000.00].
        double budget = Double.parseDouble(scanner.nextLine());
        //•	Втори ред –  Един от двата възможни сезона: "summer" или "winter"
        String season = scanner.nextLine();

        String destination = "";
        String type = "";

        switch (season){
            case "summer":

                if(budget<=100){
                    destination = "Bulgaria";
                    budget = budget * 0.30;
                    type = "Camp";
                }else if ( budget<= 1000){
                    destination = "Balkans";
                    budget = budget * 0.40;
                    type = "Camp";
                }else if ( budget > 1000){
                    destination = "Europe";
                    budget = budget * 0.90;
                    type = "Hotel";
                    }
                break;
            case "winter":
                type = "Hotel";
                if(budget<=100){
                    destination = "Bulgaria";
                    budget = budget * 0.70;
                }else if ( budget<= 1000){
                    destination = "Balkans";
                    budget = budget * 0.80;
                }else if ( budget > 1000){
                    destination = "Europe";
                    budget = budget * 0.90;
                }
                break;
        }
        System.out.printf("Somewhere in %s\n", destination);
        System.out.printf("%s - %.2f",type,budget);
    }
}
