import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxPoorGrades = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int countBadGrades = 0;
        int countAllProblems = 0;
        double totalGrades= 0;
        String lastProblem = "";
        boolean needBreak = false;

        while (!command.equals("Enough")){
            String currentProblem = command;
            double grade = Double.parseDouble(scanner.nextLine());
            lastProblem = currentProblem;
            countAllProblems++;

            if(grade <=4){
                countBadGrades++;
            }

            totalGrades = totalGrades + grade;

            if(countBadGrades >= maxPoorGrades){
                needBreak = true;
                break;
            }

            command=scanner.nextLine();
        }
        if(needBreak){
            System.out.printf("You need a break, %d poor grades.", countBadGrades);
        }else {
            System.out.printf("Average score: %.2f%n", totalGrades/countAllProblems);
            System.out.printf("Number of problems: %d%n", countAllProblems);
            System.out.printf("Last problem: %s", lastProblem );
        }

    }
}
//•	Ако Марин стигне до командата "Enough", отпечатайте на 3 реда:
//o	"Average score: {средна оценка}"
//o	"Number of problems: {броя на всички задачи}"
//o	"Last problem: {името на последната задача}"
//•	Ако получи определения брой незадоволителни оценки:
//o	"You need a break, {брой незадоволителни оценки} poor grades."