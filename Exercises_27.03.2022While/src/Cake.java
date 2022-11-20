import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int countOfPieces = width * length;

        String command = scanner.nextLine();
        boolean isTrue = false;
        while (!command.equals("STOP")){
            int pieces  = Integer.parseInt(command);

            countOfPieces = countOfPieces - pieces;

            if(countOfPieces<=1){
                isTrue = true;
                break;
            }

            command = scanner.nextLine();
        }
            if(command.equals("STOP") ) {
                System.out.printf("%d pieces are left.", countOfPieces);
            }
            if (isTrue){
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(countOfPieces));
            }
    }
}
