import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfGroups = Integer.parseInt(scanner.nextLine());

        int countOfVisitingMus = 0;
        int countOfVisitingMon = 0;
        int countOfVisitingKil = 0;
        int countOfVisitingK2 = 0;
        int countOfVisitingEve = 0;
        int peopleTotal = 0;

        for (int i = 1; i <= countOfGroups; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());

            if (peopleInGroup <= 5){
                countOfVisitingMus = peopleInGroup + countOfVisitingMus;
                peopleTotal= peopleInGroup + peopleTotal;
            }else if(peopleInGroup <= 12){
                countOfVisitingMon = peopleInGroup + countOfVisitingMon;
                peopleTotal= peopleInGroup + peopleTotal;
            }else if(peopleInGroup<= 25){
                countOfVisitingKil = peopleInGroup + countOfVisitingKil;
                peopleTotal= peopleInGroup + peopleTotal;
            }else if(peopleInGroup <=40){
                countOfVisitingK2 = peopleInGroup + countOfVisitingK2;
                peopleTotal= peopleInGroup + peopleTotal;
            }else{
                countOfVisitingEve = peopleInGroup + countOfVisitingEve;
                peopleTotal= peopleInGroup + peopleTotal;
            }
        }
        double proMus = (countOfVisitingMus * 1.0 / peopleTotal)* 100;
        double proMon = (countOfVisitingMon * 1.0 / peopleTotal) * 100;
        double proKil= (countOfVisitingKil* 1.0 / peopleTotal) * 100;
        double proK2 = (countOfVisitingK2 * 1.0 / peopleTotal) * 100;
        double proEv = (countOfVisitingEve * 1.0 / peopleTotal) * 100;

        System.out.printf("%.2f%%%n",proMus);
        System.out.printf("%.2f%%%n",proMon);
        System.out.printf("%.2f%%%n",proKil);
        System.out.printf("%.2f%%%n",proK2);
        System.out.printf("%.2f%%%n",proEv);

    }
}

