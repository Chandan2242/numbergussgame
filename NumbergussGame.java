
import java.util.Scanner;
import java.util.Random;

public class NumbergussGame {

	public static void
	guessingRandomNumber()
	{
		Scanner sc = new Scanner(System.in);
		int N = 1 + (int)(100* Math.random());
		int numberOfTime = 5;
		int i, InputNumber;
		System.out.println("Plese choose a number between 1 to 100. Guess the number within maximum 5 trials.");
		
		for (i = 0; i < numberOfTime; i++) {
		 System.out.println("Start gussing :");
		
		InputNumber = sc.nextInt();
			if (N == InputNumber) {
				System.out.println(" ***********Congratulations!***********");
				System.out.println();

				System.out.println(" --Finally you find/guessed the number--");
				System.out.println();

				System.out.println(" ***********Congratulations!***********");
				System.out.println();
				break;
			}
			else if (N > InputNumber && i != numberOfTime - 1) {
				System.out.println("The number is greater than " + InputNumber);
			}
			else if (N < InputNumber && i != numberOfTime - 1) {
				System.out.println("The number is less than " + InputNumber);
			}
		}

		if (i == numberOfTime) {
			System.out.println("You Reached highest numberOfTime trials.");
			System.out.println();
			System.out.println("OOF! You not not abil to gess the number ");
			System.out.println();
			System.out.println( "Try Again!");
			System.out.println();

			System.out.println("The number which you want guss that is : " + N);
			System.out.println();
		}
	}
	public static void main(String arg[])
	{
		guessingRandomNumber();
	}
}
