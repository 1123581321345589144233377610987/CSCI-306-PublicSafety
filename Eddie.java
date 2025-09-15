//Eddie clones. They are all named sequentially as Eddie <number>, but don't let that fool you
// - as they will make sure to point out, clones are individuals too!

import java.util.Random; 

public class Eddie extends Person{
	private static int counter = 1;
	private String [] questions ={"What is this for?", "Wait, what do you mean I'm a person?"};
	private String answer = "Wait... I need to know what this is for";
	private final static String [] opinions = {"like", "love", "don't like", "hate"};
	private final static String [] objects = {"the color blue", "pickleball", "card games", "getting up early", "going to bed late"};
	private String opinion;
	private int answered;
	
	private int cloneNum=1;
	private String cloneName;
	Random random = new Random();
	
	public Eddie(String myName, String occupation) {
		super(myName, occupation);
		cloneNum=counter;
		this.cloneName="Eddie #"+cloneNum;
		counter++;
		answered=0;
		opinion= "I really "+opinions[random.nextInt(opinions.length)]+" "+objects[random.nextInt(objects.length)]+".";
		
	}
	public void askQuestion() {
		System.out.println(questions[answered%questions.length]);
		answered++;
	}
	public void answerQuestion() {
		if (answered>0) {
			System.out.println("I don't know if I mentioned this, but unlike the other Eddies, "+opinion);
			System.out.println("Clones are indiviuals too.");
		}
		else {
			System.out.println(answer);
		}
	}

	@Override
	public void giveName() {
		super.giveName();
		System.out.println("Well, technically I'm just "+this.cloneName);
	}
	
}
