import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int spase = width * length * height;
        boolean noMoreSpace = false;

        String command = scanner.nextLine();
        while (!command.equals("Done")){
            int boxes = Integer.parseInt(command);

            spase = spase - boxes;

            if (spase <= 0){
                noMoreSpace = true;
                break;
            }


            command = scanner.nextLine();
        }

        if (noMoreSpace ){
            System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(spase));
        }else {
            System.out.printf("%d Cubic meters left.",spase);
        }

    }
}
//•	Ако стигнете до командата "Done" и има още свободно място:
//"{брой свободни куб. метри} Cubic meters left."
//•	Ако свободното място свърши преди да е дошла команда "Done":
//"No more free space! You need {брой недостигащи куб. метри} Cubic meters more."