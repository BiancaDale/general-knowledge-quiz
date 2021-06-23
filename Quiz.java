public class Quiz {
	
	public static void main(String[] args) {
	{
		Question question = new MultipleChoiceQuestion(
				"What used to be the currency of Italy?",
				"Lira",
				"Euro",
				"Dollar",
				"Zen",
				"Rand",
				"a");
				question.check();}
	{
		Question question = new MultipleChoiceQuestion(
				"In what country was pesetas the currency?",
				"France",
				"Spain",
				"Africa",
				"England",
				"Brazil",
				"b");
				question.check();}
	{
		Question question = new MultipleChoiceQuestion(
				"What is the national currency of Laos?",
				"Rupee",
				"Drachme",
				"Laos Kip",
				"Lira",
				"Dollar",
				"c");
				question.check();}
	{
		Question question = new MultipleChoiceQuestion(
							"What is Pakistan s currency?",
							"Liran",
							"Euro",
							"Dollar",
							"Rupee",
							"Rand",
							"d");
							question.check();}
	{
		Question question = new MultipleChoiceQuestion(
							"How many digits does an IBAN number consist of?",
							"Five",
							"Twelve",
							"Eleven",
							"Ten",
							"Forteen",
							"e");
							question.check();}
	{				
	   
		
// Initialize a "Question" variable using a "TrueFalseQuestion" constructor.
	Question question = new TrueFalseQuestion(
			"The capital of Libya is Benghazi",
			"False");
			question.check();}
{				

	Question question = new TrueFalseQuestion(
			"Stephen Hawking declined a knighthood from the Queen",
			"True");
			question.check();}
{				
	
	Question question = new TrueFalseQuestion(
			"The mathematical name for the shape of a Pringle is hyperbolic paraboloid",
			"True");
			question.check();}
{				
	Question question = new TrueFalseQuestion(
			"An octopus has five hearts",
			"False");
			question.check();}
{		
	Question question = new TrueFalseQuestion(
			"The highest mountain in England is Ben Nevis",
			"False");
			question.check();}
{			
	Question.showResults();}
}
}