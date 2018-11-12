import java.util.Scanner;

public class Questions { //this is the questions class beginning
	public final int testLen = 5;
	private String questions[] = new String[testLen];
	private char answers[]= new char[testLen];
	private int points = 0;

	public Questions() {
		System.out.println("Select the subject you would like to test: "+"\r\n"+"[1] General Trivia"+"\r\n"+"[2] Something Else");
		Scanner input = new Scanner(System.in);
		System.out.print("Your Choice: ");
		int choice = input.nextInt();
		
		setQuestions(choice);
		
		for(int q = 0; q<questions.length;q++) {
			String ques = getQuestion(q);
			System.out.println(ques);
			
			System.out.print("Answer: ");
			char userAns = input.next().charAt(0);
			char ans = getAnswer(q);
			
			if(userAns == ans) {
				System.out.println("Correct!");
				points++;
			}
			else System.out.println("Not quite..");
		}
		System.out.println("Test Complete. You scored "+points+"/5");
	}
	
	public char getAnswer(int num) {
		return answers[num];
	}
	
	public String getQuestion(int num) {
		return questions[num];
	}
	
	private void setQuestions(int test) {
		if(test == 1) {
			questions[1] = "Where were the 2012 Summer Olympics Held?"+"\r\n"+
							"[A] Berlin"+"\r\n"+
							"[B] Madrid"+"\r\n"+
							"[C] London"+"\r\n"+
							"[D] Moscow";
			questions[2] = "True or False: Seinfeld is the current longest-running TV show.";
			questions[3] = "Which of the following is NOT in Boston?"+"\r\n"+
							"[A] Fenway Park"+"\r\n"+
							"[B] Gillette Stadium"+"\r\n"+
							"[C] TD Garden"+"\r\n"+
							"[D] None of the above";
			questions[4] = "True or False: ";
			questions[5] = "Which U.S. President was from the Boston area?"+"\r\n"+
							"[A] Abraham Lincoln"+"\r\n"+
							"[B] John F. Kennedy"+"\r\n"+
							"[C] Jimmy Carter"+"\r\n"+
							"[D] Bill Clinton";
		
		}
	}
}

