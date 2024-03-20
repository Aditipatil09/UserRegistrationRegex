import java.util.Scanner;
import java.util.regex.*;

class main{
    public static void main(String args[]){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the Last Name:");
        String lastName = scanner.nextLine();

        if(isValidLastName(lastName)){
            System.out.println("Valid Last Name:");
        }else {
            System.out.println("Invalid Last Name:");
        }
    }

    public static boolean isValidLastName( String lastName){
        String Regex = "[A-Z]{1}[a-z ]{2,}";
        Pattern pattern = Pattern.compile(Regex);
        Matcher matcher = pattern.matcher(lastName);

        return matcher.matches();

    }
}