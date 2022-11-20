import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Градусите - цяло число в интервала [10…42]
        int grade = Integer.parseInt(scanner.nextLine());
        //•	Текст, време от денонощието - с възможности - "Morning", "Afternoon", "Evening"
        String timeOfTheDay = scanner.nextLine();

        String outfit = " ";
        String shoes = " ";

        switch (timeOfTheDay){
            case "Morning":
                if(grade >= 10 && grade <= 18){
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                }else if(grade >= 18 && grade <= 24){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }else if(grade >= 25 ) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if(grade >= 10 && grade <= 18){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }else if(grade >= 18 && grade <= 24){
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }else if(grade >= 25 ) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;
            case "Evening":
                if(grade >= 10 && grade <= 18){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }else if(grade >= 18 && grade <= 24){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }else if(grade >= 25 ) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                break;
        }
        System.out.printf("It's %d degrees, get your %s and %s.",grade,outfit,shoes);
    }
}
