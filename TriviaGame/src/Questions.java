import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class Questions { //this is the questions class beginning
	public final static int testLen = 5;
	private static String questions[] = new String[testLen];
	private static char answers[]= new char[testLen];
	private int points = 0;
	private static ServerSocket serverSocket;
	static DataInputStream din;
	static DataOutputStream dout;
	static Socket s;
	String ques;
	
	public Questions() {
		//feed the questions, wait for an answer, and determine whether they answered correctly or not.
		for(int q = 0; q<questions.length;q++) {
			ques = getQuestion(q);
			System.out.println(ques);
			
			System.out.print("Answer: ");
			char userAns = 'a'/*the button they press*/; //this is where the user makes their choice
			char ans = getAnswer(q);
			
			if(userAns == ans) {
				System.out.println("Correct!");	//calculate the correct answers
				points++;
			}
			else System.out.println("Not quite..");
		}
		System.out.println("Test Complete. You scored "+points+"/5"); //return their score
	}
	
	public char getAnswer(int num) {
		return answers[num];
	}
	
	public String getQuestion(int num) {
		return questions[num];
	}
	
	public static void setQuestions(int test) {
		if(test == 1) {
			questions[0] = "Where were the 2012 Summer Olympics Held?"+"\r\n"+
							"[A] Berlin"+"\r\n"+
							"[B] Madrid"+"\r\n"+
							"[C] London"+"\r\n"+ //correct
							"[D] Moscow";
			questions[1] = "True or False: Seinfeld is the current longest-running TV show.";
			questions[2] = "Which of the following is NOT in Boston?"+"\r\n"+
							"[A] Fenway Park"+"\r\n"+
							"[B] Gillette Stadium"+"\r\n"+ //correct 
							"[C] TD Garden"+"\r\n"+
							"[D] None of the above";
			questions[3] = "True or False: ";
			questions[4] = "Which U.S. President was from the Boston area?"+"\r\n"+
							"[A] Abraham Lincoln"+"\r\n"+
							"[B] John F. Kennedy"+"\r\n"+ //correct
							"[C] Jimmy Carter"+"\r\n"+
							"[D] Bill Clinton";
		
		}
	}
	
	public static void setAnswers(int num) {
		if(num == 1) {
			answers[0] = 2;
			answers[1] = 1;
			answers[3] = 1;
			answers[4] = 1;
		}	
	}
	
	public void sendQuestion() throws IOException
    {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
          String s1;
          do
          {
       	   
              s1=br.readLine();
              dout.writeUTF(ques);
              dout.flush();
              System.out.println(din.readUTF());
          }
          while(!s1.equals("stop"));
   }	
	
	public void sendAnswer() throws IOException
    {
		/*/
		 * trying to get the question and send it to the player
		 * not working
		 */
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
          String s1;
          do
          {
       	   
              s1=br.readLine();
              dout.writeUTF(ques);
              dout.flush();
              System.out.println("Server Message:"+din.readUTF());
          }
          while(!s1.equals("stop"));
   }	
	
	public static void main(String[] args) throws IOException {
		//prompt user to select a test type and then read their selection
		//System.out.println("Select the subject you would like to test: "+"\r\n"+"[1] General Trivia"+"\r\n"+"[2] Something Else");
		Scanner input = new Scanner(System.in);
		//System.out.print("Your Choice: ");
		//int choice = input.nextInt();
		
		//set the test questions based on the user decision
		
		/*/
		 * makes a connection and prints worked
		 * does work
		 */
		serverSocket = new ServerSocket(1242);
        Socket server = serverSocket.accept();
        if(server.isConnected() == true) {
        System.out.print("worked");
        din= new DataInputStream(s.getInputStream());
        dout= new DataOutputStream(s.getOutputStream());
        
        
        }
        
		//setQuestions(choice);
		//setAnswers(choice);
			
	}
}