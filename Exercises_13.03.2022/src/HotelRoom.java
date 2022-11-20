import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Входът се чете от конзолата и съдържа точно 2 реда, въведени от потребителя:
        //•	На първия ред е месецът – May, June, July, August, September или October
        String month = scanner.nextLine();
        //•	На втория ред е броят на нощувките – цяло число в интервала [0 ... 200]
        int countOfOvernights = Integer.parseInt(scanner.nextLine());

        String hotelSt = "Studio";
        String hotelAp = "Apartment";
        double priceStudio = 0;
        double priceApartment = 0;

        switch (month){
            case "May":
                if(countOfOvernights < 7){
                    priceApartment = 65;
                    priceStudio = 50;
                }else if (countOfOvernights > 7 && countOfOvernights <= 14){
                    priceApartment = 65;
                    priceStudio = 50 - 50 * 0.05;
                }else if (countOfOvernights > 14){
                    priceApartment = 65 - 65 * 0.10;
                    priceStudio = 50 - 50 * 0.30;
                }
                break;
            case "June":
                if(countOfOvernights <= 14){
                    priceApartment = 68.70;
                    priceStudio = 75.20;
                }else {
                    priceApartment = 68.70 - 68.70 * 0.10;
                    priceStudio = 75.20 - 75.20 * 0.20;
                }
                break;
            case "July":
                if(countOfOvernights <= 14){
                    priceApartment = 77;
                    priceStudio = 76;
                }else {
                    priceApartment = 77 - 77 * 0.1;
                    priceStudio = 76;
                }
                break;
            case "August":
                if(countOfOvernights <= 14){
                    priceApartment = 77;
                    priceStudio = 76;
                }else {
                    priceApartment = 77 - 77 * 0.1;
                    priceStudio = 76;
                }
                break;
            case "September":
                if(countOfOvernights <= 14){
                    priceApartment = 68.70;
                    priceStudio = 75.20;
                }else {
                    priceApartment = 68.70 - 68.70 * 0.10;
                    priceStudio = 75.20 - 75.20 * 0.20;
                }
                break;
            case "October":
                if(countOfOvernights < 7){
                    priceApartment = 65;
                    priceStudio = 50;
                }else if (countOfOvernights > 7 && countOfOvernights <= 14){
                    priceApartment = 65;
                    priceStudio = 50 - 50 * 0.05;
                }else if (countOfOvernights > 14){
                    priceApartment = 65 - 65 * 0.10;
                    priceStudio = 50 - 50 * 0.30;
                }
                break;
        }
            double totalPriceAp = priceApartment * countOfOvernights;
            double totalPriceSt = priceStudio * countOfOvernights;
        System.out.printf("Apartment: %.2f lv.\n", totalPriceAp);
        System.out.printf("Studio: %.2f lv.", totalPriceSt);
    }
 }
