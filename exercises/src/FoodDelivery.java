import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {



    Scanner scanner = new Scanner(System.in);
    //•	Брой пилешки менюта – цяло число в интервала [0 … 99]
    int chickenMenu = Integer.parseInt(scanner.nextLine());
    //•	Брой менюта с риба – цяло число в интервала [0 … 99]
    int fishMenu = Integer.parseInt(scanner.nextLine());
    //•	Брой вегетариански менюта – цяло число в интервала [0 … 99]
    int vegetarianMenu = Integer.parseInt(scanner.nextLine());
    //•	Пилешко меню –  10.35 лв.
    double chickenPrise = chickenMenu * 10.35;
    //•	Меню с риба – 12.40 лв.
    double fishPrice = fishMenu * 12.4;
    //•	Вегетарианско меню  – 8.15 лв.
    double vegetarianPrice = vegetarianMenu * 8.15;
    //Групата ще си поръча и десерт, чиято цена е равна на 20% от общата сметка (без доставката).
    double dessertPrice = (chickenPrise + fishPrice + vegetarianPrice) * 0.2;
    //колко ще струва на група хора да си поръчат храна за вкъщи.
    //Цената на доставка е 2.50 лв и се начислява най-накрая.
    double totalPrice = chickenPrise + fishPrice + vegetarianPrice + dessertPrice + 2.5;


    System.out.printf("%.2f",totalPrice);
    }

}


