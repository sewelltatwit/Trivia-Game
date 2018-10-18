
public class Questions {
	public final int ANSWERS=10;
	private String question;
	private String possibleAnswers[]= new String[ANSWERS];
	private int correctAnswer;

	public Questions() {
		question="";
		correctAnswer=0;
		for (int i=0; i<ANSWERS; i++) {
			setPossibleAnswers("",i+1);
		}
	}
	
	public void setPossibleAnswers(String text, int i) {
		possibleAnswers[i]=text;
	}
	
	public void setQuestion(String q) {
		question=q;
	}
	
	public void setCorrectAnswer(int i) {
		correctAnswer=i;
	}
	
	public String getPossibleAnswers(int i) {
		return possibleAnswers[i];
	}
	
	public int getCorrectAnswerIndex() {
		return correctAnswer;
	}
	
	public String getCorrectAnswer() {
		return possibleAnswers[correctAnswer];
	}
	
	public String getQuestion() {
		return question;
	}
	
}
