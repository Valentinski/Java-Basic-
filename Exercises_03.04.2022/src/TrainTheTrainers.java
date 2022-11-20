import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // броя на журито

        String command = scanner.nextLine();
        int countAllGrades = 0;
        double allGradesSum = 0;

        while (!command.equals("Finish")){
            String presentation = command;

            double sumCurrentGrade = 0;
            for (int i = 1; i <= n  ; i++) { // колкото е журито, толкова оценки трябва да се прочетат.
                               double currentGrade = Double.parseDouble(scanner.nextLine()); // прочитаме оценките от презентацията в зависимост колко хора са в журито.
                sumCurrentGrade = sumCurrentGrade + currentGrade; // сумираме всяка оценка от журито
                countAllGrades++; // отброявам оценките от журито
            }

            allGradesSum = allGradesSum + sumCurrentGrade;

            double avgCurrentGrade = sumCurrentGrade / n; // Средна оценка за текуща презентация .
            System.out.printf("%s - %.2f.%n",presentation, avgCurrentGrade);


            command = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", allGradesSum / countAllGrades);
    }
}
//"Student's final assessment is {среден успех от всички презентации}."