import java.util.*;

public class Player {

	private int playerNum;
	private int chosenAnswer;
	private int points;
	
	public Player(int p) {
		
		playerNum=p;
		points=0;
	}
	
	public int answer() {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your answer: ");
		return chosenAnswer=s.nextInt();
	}
	
	public int getCurrentAnswer() {
		return chosenAnswer;
	}
	
	public void addPoints() {
		points++;
	}
	
	public int getCurrentPoints() {
		return points;
	}
	
	public int getCurrentPlayer() {
		return playerNum;
	}
}
