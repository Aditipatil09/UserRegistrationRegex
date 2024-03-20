import java.util.Scanner;
import java.util.regex.*;

class main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Email Id:");
        String emailId = scanner.nextLine();

        if(isValidEmailId (emailId)){
            System.out.println("Valid Email Id:");
        } else{
            System.out.println("Invalid Email Id:");
        }
    }

    public static boolean isValidEmailId(String emailId){
        String Regex = "[a-z 0-9]+[@]+[a-z]+[.]+[a-z]{2,3}";
        Pattern pattern = Pattern.compile(Regex);
        Matcher matcher = pattern.matcher(emailId);

        return matcher.matches();
    }
        }