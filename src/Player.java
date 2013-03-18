import java.util.ArrayList;

public class Player{
  
	//instance variables
	private String name;
	private int money;
	private Hand hand;
	
	//constructors
	
	//initializes starting money without player input
	public Player(String n){
		name = n;
		money = 50000;
		hand = new Hand();
	}
	
	//initializes starting money WITH player input
	public Player(String n, int m){
		name = n;
		money = m;
		hand = new Hand(){
	}
	
	//get & set methods
	public String getName()[
		return name;
	}
	
	public int getMoney(){
		return money;
	}
	
	public Hand getHand(){
		return hand;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setMoney(int m){
		money = m;
	}
	
	//bet method
	public void bet(int amount){
		money -= amount;
		dealer.acceptBetFrom(player, amount);
	}
	
	//deal method
	public void deal(){
		ArrayList<Card> cardList = deck.pick(2);
		hand.setHand(cardList);
	}
	
	//hit method
	public void hit(){
		dealer.dealToPlayer(player);
	}
	
	//double method
	public void double(){
		bet(dealer.getPot() / 2);
		hit();
	}
	
	//get player's hand value
	public int getHandValue(){
		hand.getValue();
	}
	
	/*surrender method(Possible)
	public void surrender(){
		
	}*/
	
}
		
		
		