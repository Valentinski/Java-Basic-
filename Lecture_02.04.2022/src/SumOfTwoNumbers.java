import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int combination = 0 ;
        boolean flag = false;
        for (int i = startNumber; i <= endNumber ; i++) {
            for (int j = startNumber; j <= endNumber ; j++) {
                combination++;

                int sum = i + j;

                if(sum == magicNumber){
                    flag = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)%n",combination,i,j,magicNumber);
                    break;
                }

            }
            if(flag) {
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.printf("%d combinations - neither equals %d", combination, magicNumber);
        }
    }
}
