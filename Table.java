//I'm currently attempting to have this run a game. There are still a number of issues.
//I'm also sorry if this somehow messes up the GitHub layout somehow.
import java.util.Scanner;
import java.util.ArrayList;
public class Table
{
  public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);
//gameOver handles ending the program by ending the outer loop, while roundOver ends a round
		boolean gameOver = false, roundOver = false;	
		int select = 0, bet = 0;
//request and set values for name and money
		System.out.println("What should I call you?");
			String name = keyboard.nextLine();
		System.out.println("How much money would you like to start this game with?");
			int money = keyboard.nextInt();
//make the player with given input
		Player player = new Player(name, money);
		Dealer dealer = new Dealer();
		while(gameOver==false)
		{
		System.out.println("How much do you want to bet?");
		player.bet(bet(keyboard,money));	//activates the player's bet method based on the bet method below, whuich checks if it is possible
			while(roundOver==false)
			{
				System.out.println("Select an option by choosing the cooresponding number:");
				System.out.println("1: hit 2: double");
				select = keyboard.nextInt();
				if (select==1)
					{
						player.hit();
					}
				if (select==2)
					{
						player.doubleM();// note that this cannot be named 'double'.
					}
			}
		}
	}
	
	public static int bet(Scanner keyboard,int money)
	{	
		int b=0;
		b = keyboard.nextInt();
		while(b > money)
			{
				System.out.println("Please place a bet you can afford.");
				b = keyboard.nextInt();
			}
		return b;
	}
//end
}
