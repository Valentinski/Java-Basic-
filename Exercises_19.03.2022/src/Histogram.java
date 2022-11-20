import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        for (int i = 1; i <= n ; i++) {
            int num = Integer.parseInt(scanner.nextLine()); // четем число от конзолата

            if (num < 200){
                p1 ++; // p1+=1; p1 = p1 + 1
            }else if (num <= 399){
                p2 ++;
            }else if (num <=599){
                p3 ++;
            }else if (num <=799 ){
                p4 ++;
            }else if(num <= 1000){
                p5 ++;
            }

        }
        System.out.printf("%.2f%%%n", p1 * 1.0 / n * 100); // умножаваме по 1.0 за да превърнем Интежер в Дабъл
        System.out.printf("%.2f%%%n", p2 * 1.0 / n * 100);
        System.out.printf("%.2f%%%n", p3 * 1.0 / n * 100);
        System.out.printf("%.2f%%%n", p4 * 1.0 / n * 100);
        System.out.printf("%.2f%%%n", p5 * 1.0 / n * 100);
    }
}
