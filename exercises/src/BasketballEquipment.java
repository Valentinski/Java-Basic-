import java.util.Scanner;
public class BasketballEquipment {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //•	Годишната такса за тренировки по баскетбол – цяло число в интервала [0… 9999]
        int YearsTax = Integer.parseInt(scanner.nextLine());
        //•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        double BasketBallShoes = YearsTax - (YearsTax*0.40);
        // •	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        double BasketBallClothes = BasketBallShoes - (BasketBallShoes*0.20);
        //•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        double BasketBallBall = BasketBallClothes/4;
        //•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка
        double BasketBallAccessories = BasketBallBall/5;
        //разходи ще има Джеси, ако започне да тренира, като знаете колко е таксата за тренировки по баскетбол за период от 1 година.
        double costs =  YearsTax + BasketBallShoes + BasketBallClothes + BasketBallAccessories+ BasketBallBall;

        System.out.println(costs);

    }
}
