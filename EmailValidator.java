import java.util.Scanner;
import java.util.regex.*;

public class EmailValidator {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Check Your Email");
        System.out.println("Enter Email");
        String email=sc.next();
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Invalid email address");
        }
    }
}
