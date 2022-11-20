import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "SoftUni"; //Променлива от тип String (Въвеждане на текст)
        int number1 = 1; // Въвеждане на цяло число
        double num2 = 2; // Въвеждане на променливо число


        //System.out.printf("%s, %d, %f", name, number1, num2);
        System.out.println(name+", " + number1+", " + num2); // Concatenation
    }
}
