import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= n ; i++) {
            int currentNUm = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0){
                evenSum = evenSum + currentNUm;

            }else {
                oddSum = oddSum + currentNUm;
            }

        }
            if(evenSum == oddSum){
                System.out.println("Yes");
                System.out.printf("Sum = %d", evenSum);
            }else {
                System.out.printf("No%nDiff = %d", Math.abs(evenSum - oddSum));
            }

    }
}
