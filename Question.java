import javax.swing.JOptionPane;

public abstract class Question {
		// class variables
		static int nQuestions = 0; 
		// initialization “nQuestions = 0” is done only once, 
		//when the class is first loaded because it is static 
		static int nCorrect = 0;
		// instance variables
		String question;
		String correctAnswer;
		// abstract declaration for the "ask" method
		abstract String ask();
		// instance method check()
 void check() {
	 nQuestions++;
	 String answer = ask();
	 	if (answer.equals(correctAnswer)) {
	 		JOptionPane.showMessageDialog(null,"Correct!");
	 		nCorrect++;
 } 		else {
	 		JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is "+ correctAnswer+ ".");
}
}
 // class method showResults()
static void showResults() {
		JOptionPane.showMessageDialog(null, "You got " + nCorrect+" correct out of " +nQuestions+ " questions");
		  }
	}