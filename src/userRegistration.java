import java.util.Scanner;
import java.util.regex.*;

class main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Phone number:");
        String phoneNumber = scanner.nextLine();

        if(isValidPhoneNumber (phoneNumber)){
            System.out.println("Valid Phone Number:");
        } else{
            System.out.println("Invalid phone number");
        }
    }

    public static boolean isValidPhoneNumber( String phoneNumber){
        String Regex = "[9][1] [0-9]{10}" ;
        Pattern pattern = Pattern.compile(Regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        return matcher.matches();

    }
}

