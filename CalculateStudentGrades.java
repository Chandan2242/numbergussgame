import java.util.Scanner;

public class CalculateStudentGrades{
   public static void main(String args[]) {
      Scanner Sc = new Scanner (System.in);
      System.out.println("Enter your marks less than 100");
      int number = Sc.nextInt();
      char Grade;
      
      if(number>=80){
         Grade = 'A';
         }
      else if(number>=60 && number<80){
         Grade = 'B';
         }
      else if(number>=40 && number<60){
         Grade = 'C';
         }
      else {
         Grade = 'D';
         }
      switch(Grade) {
         case 'A' :
            System.out.println("Excellent!");
            break;
         case 'B' :
            System.out.println("Good");
            break;
         case 'C' :
            System.out.println("Done! Need to hard work. ");
            break;
         case 'D' :
            System.out.println("You just passed");
         case 'F' :
            System.out.println(" You are fail ! you perforn next attempt. ");
            break;
         default :
         System.out.println("No Grade is abliable");
      }
      System.out.println("Your performance grade is = " + Grade);
   }
}