import java.io.*;
import java.util.*;

public class TriviaGame{

	private static int counter;

	public void main (String args[]) throws IOException  {
		
		final int PLAYERS=2;
		final int QUESTIONS=10;
		int playerTurn=1;
		int question;
		int points1=0;
		int points2=0;
		int chosenAnswer;
		
		Player[] players= new Player[PLAYERS];
		 
		for (int i=0; i< PLAYERS; i++) {
			players[i]= new Player(i+1);
		}
		
		Questions[] questions= new Questions [QUESTIONS];
		
	}
	
	public static void displayQuestion(Questions q) {
		counter++;

		System.out.println("Question " +counter+"/n"+q.getQuestion());
		
		for (int i=1; i<4; i++) {
			System.out.println("/n"+i+"."+q.getPossibleAnswers(i));
		}
		
	}
}
