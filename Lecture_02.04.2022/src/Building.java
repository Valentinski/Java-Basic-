import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for (int i = floors; i >= 1 ; i--) {
            for (int j = 0; j < rooms ; j++) {

                String typeRoom = "";
                if(floors == i){
                    typeRoom = "L";
                }else if(i % 2 !=0){
                    typeRoom = "A";
                }else {
                    typeRoom = "O";
                }

                System.out.printf("%s%d%d ",typeRoom, i, j);
            }
            System.out.println();
        }

    }
}
//