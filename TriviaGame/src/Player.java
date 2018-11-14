
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Player extends Application{
	
	public int ansCho = 0;
	public String sui = null;
	public String butOne ="Button";// getAnswer(1);
	public String butTwo = "Button";// getAnswer(2);
	public String butThree ="Button"; //getAnswer(3);
	public String butFour = "Button";//getAnswer(4);
	public String question = sui;
	Socket s;
	DataInputStream din;
	DataOutputStream dout;
	
	
	
	public static void main(String args[]) {
		launch(args);
        new Player(); 

	}
	
	public Player()
	    {
		/*/
		 * gets connection and sets data in and out ans data stream
		 * was working 
		 */
	         try
	         {
	             String serverName = "10.200.20.218";
	             s=new Socket(serverName,1242 );
	             System.out.println(s);
	             din= new DataInputStream(s.getInputStream());
	             dout= new DataOutputStream(s.getOutputStream());
	             sui = din.toString();
	             System.out.print(sui);
	         }
	         catch(Exception e)
	         {
	             System.out.println(e);
	         }
	     }
	
	public void ClientChat() throws IOException
	     {
		/*/
		 * gets the answer that the client choices and sends it down to server as in
		 * not working 
		 */
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	           String s1;
	           do
	           {
	        	   
	               s1=br.readLine();
	               dout.write(ansCho);
	               dout.flush();
	               System.out.println("Server Message:"+din.readUTF());
	           }
	           while(!s1.equals("stop"));
	    }	
	
	
	public void start(Stage primaryStage) throws Exception {
		/*/
		 * This is the gui and the button should update when an answer is selected  
		 * was working
		 */
		
		primaryStage.setTitle("Trivia Game");
		GridPane grid = new GridPane();
		grid.setGridLinesVisible(false);
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(75);
		grid.setVgap(20);
		
		Text scenetitle = new Text("Trivia!");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.SEMI_BOLD, 30));
		grid.add(scenetitle, 0, 0, 2, 1);
		
		Label userName = new Label("Question:");
		grid.add(userName, 0, 1);
		
		Text score = new Text("Score: ");
		grid.add(score, 0, 2);
		
		Text disScore = new Text("0");
		grid.add(disScore, 1, 2);
		
		Text ask = new Text(question);
		ask.setFont(Font.font("Tahoma", FontWeight.SEMI_BOLD, 12));
		ask.setWrappingWidth(150);
		grid.add(ask, 1,1,1, 1);
		
		
		Button queOne = new Button(butOne);
		Button queTwo = new Button(butTwo);
		Button queThree = new Button(butThree);
		Button queFour = new Button(butFour);

		queOne.setOnAction(e->{
			   ansCho=1;
	           ask.setText(question);
	           queOne.setText(butOne);
	           queTwo.setText(butTwo);
	           queThree.setText(butThree);
	           queFour.setText(butFour);

		});	
		
		grid.add(queOne, 0, 3);
		
		
		queTwo.setOnAction(e->{
			   ansCho=2;
			   ask.setText(question);
	           queOne.setText(butOne);
	           queTwo.setText(butTwo);
	           queThree.setText(butThree);
	           queFour.setText(butFour);
		});		
		grid.add(queTwo, 1, 3);
		
		queThree.setOnAction(e->{
			   ansCho=3;
			   ask.setText(question);
	           queOne.setText(butOne);
	           queTwo.setText(butTwo);
	           queThree.setText(butThree);
	           queFour.setText(butFour);
		});			
		grid.add(queThree, 2, 3);
	
		queFour.setOnAction(e->{
			   ansCho=4;
			   ask.setText(question);
	           queOne.setText(butOne);
	           queTwo.setText(butTwo);
	           queThree.setText(butThree);
	           queFour.setText(butFour);
		});			
		grid.add(queFour, 3, 3);
		
		
		try {
			if(ansCho!=0) {
				ClientChat();
			  }
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		Scene scene = new Scene(grid);
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.sizeToScene();
		primaryStage.show();
		
	}
		
}
