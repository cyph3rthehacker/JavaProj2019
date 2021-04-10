import java.util.Scanner;

public class JavaLogin {
    
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("-----------Log in----------");
    System.out.print("username: ");
   String username = input.next();

    System.out.print("password: ");
   String password = input.next();

   if(username.equals("admin") && password.equals("pass")) {
        System.out.println("You are logged in");
    }
   else{
       System.out.println("invalid credentials");
       }
   }
}