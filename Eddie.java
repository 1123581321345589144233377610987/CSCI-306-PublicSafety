//Eddie clones. They are all named sequentially as Eddie <number>, but don't let that fool you
// - as they will make sure to point out, clones are individuals too!

import java.util.Random; 

public class Eddie extends Person{
	private static int counter = 1; //counts how many Eddies have been made
	private int cloneNum=1; // the value of counter at construction, unique to each Eddie
	private String cloneName; //Eddie # <CloneNum>
	
	//questions Eddies ask
	private String [] questions ={"What is this for?", "Wait, what do you mean I'm a person?"};
	
	//all Eddies have the same first anaswer
	private String answer = "Wait... I need to know what this is for";
	
	//used to generate an Eddie's (hopefully) unique opinion
	private final static String [] opinions = {"like", "love", "don't like", "hate"};
	private final static String [] objects = {"the color blue", "pickleball", "card games", "getting up early", "going to bed late"};
	private String opinion;
	
	//tracks how many times each Eddie has asked/answered a question
	private int answered;
	
	//creating an instance of the random class
	Random random = new Random();
	
	public Eddie(String myName, String occupation) {
		super(myName, occupation);
		cloneNum=counter;
		this.cloneName="Eddie #"+cloneNum;
		counter++; //updates counter since a new Eddie has been created
		answered=0; //at construction, an Eddie has not asked or answered any questions
		opinion= "I really "+opinions[random.nextInt(opinions.length)]+" "+objects[random.nextInt(objects.length)]+".";
		
	}
	public void askQuestion() {
		//iterates through array of possible questions
		System.out.println(questions[answered%questions.length]);
		answered++;
	}
	public void answerQuestion() {
		if (answered>0) {
			System.out.println("I don't know if I mentioned this, but unlike the other Eddies, "+opinion);
			System.out.println("Clones are indiviuals too.");
		}
		else {
			//an Eddie should only say this once - the first time they are asked a question
			System.out.println(answer);
		}
	}

	@Override
	public void giveName() {
		super.giveName();
		System.out.println("Well, technically I'm just "+this.cloneName);
	}
	
}
