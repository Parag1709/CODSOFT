import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		
		int playerGuess,randomNumber;
		int tryCount=0;
		
		Random ran=new Random();
		randomNumber=ran.nextInt(1001);
		
		Scanner s=new Scanner(System.in);
		
		while(true) {
		System.out.println("Enter the Guess from 1 to 1001 ");
		playerGuess=s.nextInt();
	
		tryCount++;
		
		if(playerGuess == randomNumber)
		{
			System.out.println("You Guess the right Number");
			System.out.println(" You Have took " + tryCount + " tries ");
			break;
		}
		else if(randomNumber > playerGuess)
		{
			System.out.println("Opps!Computer generated Number is Higher.Please Guess Again..");
		}
		else
		{
			System.out.println("Opps!Computer generated Number is Lower.Please Guess Again..");
		}

	}
  }
}
