import java.util.Scanner;

public class Combinations {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int validCombinationsCount = 0;
        for (int x1 = 0; x1 <= input ; x1++) {
            for (int x2 = 0; x2 <=input ; x2++) {
                for (int x3 = 0; x3 <=input ; x3++) {

                    int result = x1 + x2 + x3;

                    if(result==input){
                        validCombinationsCount++;
                    }

                }

            }

        }
        System.out.println(validCombinationsCount);
    }

}
