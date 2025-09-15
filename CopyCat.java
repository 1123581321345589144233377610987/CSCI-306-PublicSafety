// Picks a target and then imitates them when possible. Defaults to the person created before them
//but accepts an optional parameter to define a different target as well.


public class CopyCat extends Person {
	private int offset;
	private Person target;
	
	public CopyCat(String myName, String occupation, int offset) {
		super(myName, occupation);
		this.offset=offset;
		target = people[Math.abs(peopleNum-offset-1)%100];
		if (target==null && peopleNum>1) {
			target = people[0];
		}
	}
	
	public CopyCat(String myName, String occupation) {
		super(myName, occupation);
		this.offset=1;
		System.out.println();
		target = people[Math.abs(peopleNum-offset-1)%100];
	}
	
		// TODO Auto-generated constructor stub
	public void askQuestion() {
		if(target != null) {
			target.askQuestion();}
		else {
			System.out.println("I...I'm not sure what to say");
		}
	}
	public void answerQuestion() {
		if(target != null) {
			target.answerQuestion();}
		else {
			System.out.println("I...I'm not sure what to say");
		}
	}
	
	@Override
	public void giveName() {
		if(target != null && !(target instanceof CopyCat)) {
		System.out.println("Wow that's crazy!");
		target.giveName();
		}
		else {
			System.out.println("I don't like going first. Can someone else go?");
		}
	}
	
	@Override
	public void whatIDo() {
		if(target!=null && !(target instanceof CopyCat)) {
				System.out.print("And ");
				target.whatIDo();
		}
		else {
			System.out.println("");
		}
	}
}
	