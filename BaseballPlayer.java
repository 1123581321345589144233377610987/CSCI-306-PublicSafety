
public class BaseballPlayer extends Person {
	private String team;
	private String city;
	private final static String [] answers = {"Rockies", "Cardinals", "Yankees", "Blue Jays"};
	private static int x = 0;
	
	//Constructor with extra variables in addition to the abstract class
	public BaseballPlayer(String myName, String occupation, String team, String city) {
		super(myName, occupation);
		this.team = team;
		this.city = city;
	}

	//Override abstract answerQuestion and iterate through answer lists
	@Override
	void answerQuestion() {
		if(x < answers.length-1) {
			x++;
		} else {
			x = 0;
		}
		if(this.team == answers[x]) {
			System.out.println("I like the team I play for, I don't wanna beat the " + this.team);
		} else {
			System.out.println("I play for the " + this.team + ". All I really care about is beating the " + answers[x]);
		}
	}
	
	//overriding the abstract func to ask a question
	@Override
	void askQuestion() {
		System.out.println("Do you live in " + this.city + "?");
	}
	
	//Overriding the whatIDo function for a baseball player
	@Override
	public void whatIDo(){
		System.out.println("I hate fielding grounders, but that's part of the hobby I guess. I don't like to talk about my career.");
	}
}
