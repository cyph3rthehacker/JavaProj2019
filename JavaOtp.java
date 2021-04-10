import java.util.Random;
import java.util.Scanner;

class JavaOtp{
    public static void main(String[] args) {
        Random rand = new Random(); 
        Scanner input= new Scanner(System.in);
        int intotp = rand.nextInt(10000); 
        String otp=Integer.toString(intotp);
       
        System.out.println("OTP is: "+otp); 
        System.out.print("Enter OTP: ");
        String uotp=input.next();
        if(otp.equals(uotp)){
            System.out.println("Success");
        }
        else{
            System.out.println("fail....");
        }
           
    }
}