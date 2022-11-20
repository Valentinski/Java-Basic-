import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameAk = scanner.nextLine();
        double pointsAc = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine()); // брой оценяващи

        for (int i = 1; i <= n ; i++) {
            String judge = scanner.nextLine();
            double pointsGiven = Double.parseDouble(scanner.nextLine());

            int length = judge.length();
            double calculatedPoints = (length * pointsGiven) / 2;

            pointsAc = pointsAc + calculatedPoints;

            if (pointsAc > 1250.5){
                break;
            }
        }
        if(pointsAc > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameAk, pointsAc);
        }else {
            System.out.printf("Sorry, %s you need %.1f more!", nameAk, 1250.5-pointsAc);
        }


    }
}
