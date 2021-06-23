import javax.swing.JOptionPane;
// subclass of "Question" for true/false questions
public class TrueFalseQuestion extends Question {
	// implementation of the "ask" method that is specific to true/false questions.
	String ask() {
		while (true) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			if (answer.equals("T") || answer.equals("Y") || answer.equals("YES")) answer = "TRUE";
			if (answer.equals("F") || answer.equals("N") || answer.equals("NO")) answer = "FALSE";
			boolean valid = (answer.equals("FALSE") || answer.equals("TRUE"));
			if (valid) return answer;
			JOptionPane.showMessageDialog(null,"Invalid answer. Please enter TRUE or FALSE.");
		}
}
	TrueFalseQuestion(String question, String answer) {
		// Use "this" to set the instance variable "question" using the parameter "question".
		this.question = "TRUE or FALSE:\n "+question;
		answer = answer.toUpperCase();
		// Set the instance variable "correctAnswer" to only "TRUE" or "FALSE" based on "answer"
		if (answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES")) correctAnswer = "TRUE";
		if (answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO")) correctAnswer = "FALSE";
}
}