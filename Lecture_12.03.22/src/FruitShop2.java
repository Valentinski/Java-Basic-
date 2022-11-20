import java.util.Scanner;

public class FruitShop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price  = 0;
        boolean unKnow = false;
        switch (dayOfWeek){
            case "Monday":
                if (fruit.equals("banana")){
                    price = 2.5;
                }else if(fruit.equals("apple")){
                    price = 1.2;
                }else if (fruit.equals("orange")){
                    price = 0.85;
                }else if (fruit.equals("grapefruit")){
                    price = 1.45;
                }else if (fruit.equals("kiwi")){
                    price = 2.7;
                }else if (fruit.equals("pineapple")){
                    price = 5.5;
                }else if(fruit.equals("grapes")){
                    price = 3.85;
                }else {
                    unKnow = true;
                }
                break;
            case "Tuesday":
                if (fruit.equals("banana")){
                    price = 2.5;
                }else if(fruit.equals("apple")){
                    price = 1.2;
                }else if (fruit.equals("orange")){
                    price = 0.85;
                }else if (fruit.equals("grapefruit")){
                    price = 1.45;
                }else if (fruit.equals("kiwi")){
                    price = 2.7;
                }else if (fruit.equals("pineapple")){
                    price = 5.5;
                }else if(fruit.equals("grapes")){
                    price = 3.85;
                }else {
                    unKnow = true;
                }
                break;
            case "Wednesday":
                if (fruit.equals("banana")){
                    price = 2.5;
                }else if(fruit.equals("apple")){
                    price = 1.2;
                }else if (fruit.equals("orange")){
                    price = 0.85;
                }else if (fruit.equals("grapefruit")){
                    price = 1.45;
                }else if (fruit.equals("kiwi")){
                    price = 2.7;
                }else if (fruit.equals("pineapple")){
                    price = 5.5;
                }else if(fruit.equals("grapes")){
                    price = 3.85;
                }else {
                    unKnow = true;
                }
                break;
            case "Thursday":
                if (fruit.equals("banana")){
                    price = 2.5;
                }else if(fruit.equals("apple")){
                    price = 1.2;
                }else if (fruit.equals("orange")){
                    price = 0.85;
                }else if (fruit.equals("grapefruit")){
                    price = 1.45;
                }else if (fruit.equals("kiwi")){
                    price = 2.7;
                }else if (fruit.equals("pineapple")){
                    price = 5.5;
                }else if(fruit.equals("grapes")){
                    price = 3.85;
                }else {
                    unKnow = true;
                }
                break;
            case "Friday":
                if (fruit.equals("banana")){
                    price = 2.5;
                }else if(fruit.equals("apple")){
                    price = 1.2;
                }else if (fruit.equals("orange")){
                    price = 0.85;
                }else if (fruit.equals("grapefruit")){
                    price = 1.45;
                }else if (fruit.equals("kiwi")){
                    price = 2.7;
                }else if (fruit.equals("pineapple")){
                    price = 5.5;
                }else if(fruit.equals("grapes")){
                    price = 3.85;
                }else {
                    unKnow = true;
                }
                break;
            case "Saturday":
                if (fruit.equals("banana")){
                    price = 2.7;
                }else if(fruit.equals("apple")){
                    price = 1.25;
                }else if (fruit.equals("orange")){
                    price = 0.9;
                }else if (fruit.equals("grapefruit")){
                    price = 1.60;
                }else if (fruit.equals("kiwi")){
                    price = 3.0;
                }else if (fruit.equals("pineapple")){
                    price = 5.6;
                }else if(fruit.equals("grapes")){
                    price = 4.2;
                }else {
                    unKnow = true;
                }
                break;
            case "Sunday":
                if (fruit.equals("banana")){
                    price = 2.7;
                }else if(fruit.equals("apple")){
                    price = 1.25;
                }else if (fruit.equals("orange")){
                    price = 0.9;
                }else if (fruit.equals("grapefruit")){
                    price = 1.60;
                }else if (fruit.equals("kiwi")){
                    price = 3.0;
                }else if (fruit.equals("pineapple")){
                    price = 5.6;
                }else if(fruit.equals("grapes")){
                    price = 4.2;
                }else {
                    unKnow = true;
                }
                break;
            default:
                unKnow = true;
                break;
        }
        double totalPrice = price * quantity;
        if(unKnow){
            System.out.println("error");
        }else {
            System.out.printf("%.2f", totalPrice);
        }
    }
}
