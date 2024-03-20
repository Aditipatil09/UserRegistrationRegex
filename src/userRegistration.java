import java.util.Scanner;
import java.util.regex.*;

class main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Password:");
        String password = scanner.nextLine();

        if(isValidPassword (password)){
            System.out.println("Valid Password:");
        } else{
            System.out.println("Invalid Password");
        }
    }

    public static boolean isValidPassword( String password){
        String Regex = "^[A-Z]+[a-zA-Z0-9]*{8,}$" ;
        Pattern pattern = Pattern.compile(Regex);
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();

    }
}

