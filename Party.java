
import java.util.ArrayList;
/**
 * Party class. 
 *  
 * @author Mark Baldwin
 * @author Cyndi Rader
 * 
 * Purpose: Illustrate use of abstract classes
 */

public class Party {
	// Person is an abstract class
	private ArrayList<Person> people = new ArrayList<Person>();
	
	// Reminder: constant values are typically public and static (only one copy)
	public static final int MAX_QUESTIONS = 15;
	
	/**
	 * Constructor to set up the people in the party
	 */
	public Party() {
		// Important, the below classes are my child classes.   You need to replace them 
		// with your own.   This should be the only code you need to change in party.java
		people.add(new BaseballPlayer("Dr. Doolittle", "Vet", "Rockies", "Denver"));
		people.add(new Eddie("Eddie :)", "Butcher"));
		people.add(new CopyCat("Joe", "Bartender", 10));
	}
	
	/**
	 * Have people in the party ask other people questions
	 * 
	 * For simplicity, we'll just have people "ask" a question of the next
	 * person in the list. 	 
	 * 
	 */
	public void partyTime() {
		// initialize our asker and answerer
		int questionPerson = 0;
		int answerPerson = 1;
		// For simplicity, just doing a fixed number of questions
		int questionsAsked = 0;
		while (questionsAsked < MAX_QUESTIONS) {
			// display the question and answer
			people.get(questionPerson).askQuestion();
			people.get(answerPerson).answerQuestion();
			System.out.println();
			
			// set up for the next round
			questionsAsked++;
			questionPerson = (questionPerson + 1) % people.size();
			answerPerson = (answerPerson + 1) % people.size();			
		}
	}
	
	/**
	 * Allows introduction of all the people
	 * 
	 * Note that this function makes use of methods defined in the parent class
	 */
	public void introductions() {
		for (Person p : people) {
			p.askName();
			p.giveName();
			p.whatIDo();
			System.out.println();
		}
		System.out.println("Welcome to the party, let's chat!\n");
	}
	
	/** 
	 * Main driver for testing
	 * @param args Input arguments for main (unused)
	 */
	public static void main(String[] args) {
		Party party = new Party();
		party.introductions();
		party.partyTime();
	}
	

}


