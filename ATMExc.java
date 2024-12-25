
import java.util.Scanner;

public class ATMExc {
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int balance = 100000, deposit, withdraw, x;
    while(true){
      System.out.println( "choice 1 for deposit");
      System.out.println( "choice 2 for withdraw");
      System.out.println( "choice 3 for inquiry");
      System.out.println( "choice 4 for exit");
      System.out.println( "choice currect opetation to perform:");

      int choice = sc.nextInt();
    switch(choice){

      case 1:
        System.out.println("enter amount you want to deposit:");
        deposit = sc.nextInt();
      
      balance = balance + deposit;
        System.out.println("your updated balace is :" + balance);
        // System.out.println();
        break;
      
      case 2:
        System.out.println("enter the amount to withdrow");
        withdraw = sc.nextInt();
        if( withdraw > balance){
       
        System.out.println("insufficant balance !! ");

        } else{
           balance = balance - withdraw;
          System.out.println("your updated balance is: "+ balance);
        }
        break;
      case 3:
        System.out.println("your account balance is :"+ balance);
         System.out.println();
         break;

      case 4:
         System.out.println("exiting the program...");
         System.exit(0);
         default:
        System.out.println("Invalid choice. Plese try again.");
    }
    }
  }
}