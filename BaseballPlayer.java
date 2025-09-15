
public class BaseballPlayer extends Person {
	String team;
	String city;
	
	public BaseballPlayer(String myName, String occupation, String team, String city) {
		super(myName, occupation);
		this.team = team;
		this.city = city;
	}

	@Override
	void answerQuestion() {
		System.out.println("All I really care about is winning for " + this.team);
	}

	@Override
	void askQuestion() {
		System.out.println("Do you live in " + this.city + "?");
	}
	
}
