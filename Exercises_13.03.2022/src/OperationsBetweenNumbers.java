import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double result = 0;
        String evenOrOdd = "";
        boolean isZero = false;

        switch (operator){
            case "+":
                result = N1 + N2;
                if (result % 2 == 0){
                    evenOrOdd = "even";
                }else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s ",N1, operator, N2, result,evenOrOdd);
                break;
            case "-":
                result = N1 - N2;
                if (result % 2 == 0){
                    evenOrOdd = "even";
                }else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s ",N1, operator, N2, result,evenOrOdd);
                break;
            case "*":
                result = N1 * N2;
                if (result % 2 == 0){
                    evenOrOdd = "even";
                }else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s ",N1, operator, N2, result,evenOrOdd);
                break;
            case "/":
                if (N2 == 0){
                    System.out.printf("Cannot divide %d by zero", N1);
                    break;
                }else {
                    result = N1 * 1.0 / N2; // Лъжем, че числото е дабъл затова умножаваме по 1.0!
                    System.out.printf("%d %s %d = %.2f", N1, operator, N2, result);
                    break;
                }
            case "%":
                if (N2 == 0){
                    System.out.printf("Cannot divide %d by zero", N1);
                    break;
                }else {
                    result = N1 % N2;
                    System.out.printf("%d %s %d = %.0f", N1,operator,N2,result);
                    break;
                }
        }

    }
}
