import java.util.Scanner;
import java.util.regex.*;

class main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a First Name:");
        String firstName = scanner.nextLine();

        if(isValidFirstName(firstName)){
            System.out.println("Valid first name:");
        } else{
            System.out.println("Invalid first name");
        }
    }
public static boolean isValidFirstName(String firstName){
    String Regex = "[A-Z]{1}[a-z A-Z]{2,}";
    Pattern pattern= Pattern.compile(Regex);
    Matcher matcher = pattern.matcher(firstName);
    return matcher.matches();

}

}
