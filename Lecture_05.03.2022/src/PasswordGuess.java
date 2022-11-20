import java.util.Scanner;
import static java.lang.System.in;
public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String password = scanner.nextLine();
        String correctPass = "s3cr3t!P@ssw0rd";
        if(password.equals(correctPass)){
            System.out.println("Welcome");
        }else{
            System.out.println("Wrong password!");
        }
    }
}
