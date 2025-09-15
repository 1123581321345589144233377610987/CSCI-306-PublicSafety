//Picks a target and then imitates them when possible. Defaults to the person created before them
//but accepts an optional parameter to define a different target as well.


public class CopyCat extends Person {
	private int offset;
	private Person target;
	
//constructor with offset
	public CopyCat(String myName, String occupation, int offset) {
		super(myName, occupation);
		this.offset=offset;
		target = people[Math.abs(peopleNum-offset-1)%100];
		if (target==null && peopleNum>1) {
			target = people[0];
		}
	}
	
	
//constructor without offset (defaults to copying/targeting previous person if possible)
	public CopyCat(String myName, String occupation) {
		super(myName, occupation);
		this.offset=1;
		System.out.println();
		target = people[Math.abs(peopleNum-offset-1)%100];
		if ((target==null) && peopleNum>1) {
			target = people[0];
		}
	}
	
	public void askQuestion() {
		if(target != null) {
			target.askQuestion();}
		else {
			System.out.println("Sorry... I can't think of any good questions");
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
		//have to check for instances of CopyCat so we don't get things like
		//Wow that's crazy!
		//Wow that's crazy!
		//Wow that's crazy!
		//etc.
		if(target != null) {
			if(!(target instanceof CopyCat)) {
				System.out.println("Wow that's crazy!");//don't print if copying a CopyCat
			}
			target.giveName();
		}
		else {
			System.out.println("I don't like going first. Can someone else go?");
		}
	}
	
	@Override
	public void whatIDo() {
		if(target!=null) {
			if(!(target instanceof CopyCat)) {
				System.out.print("And "); //same thing. We don't want And And And I'm a Vet
			}
				target.whatIDo();
		}
		else {
			System.out.println(""); //they don't want to go first. they're not going to say anything
		}
	}
}
	
