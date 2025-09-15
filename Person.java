

abstract class Person {
	private String myName = new String();
	private String occupation = new String();
	protected static Person [] people = new Person[100];
	protected static int peopleNum = 0;
	
	
	public Person(String myName, String occupation) {
		super();
		this.myName = myName;
		this.occupation = occupation;
		people[peopleNum%100]=this;
		peopleNum++;
	}
/*
	public void askName(Person person) {
		person.giveName();
	}
*/
	public void askName() {
		System.out.println("What is your name?");
	}
	
	public void giveName() {
		System.out.println("My name is "+this.myName);
	}
	
	public void whatIDo() {
		if(this.occupation.charAt(0)=='A') {
			System.out.println("I am an "+this.occupation);
		}
		else {
		System.out.println("I am a "+this.occupation);}
	}
	
	abstract void askQuestion();
	
	abstract void answerQuestion();
}