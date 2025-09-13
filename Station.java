import java.util.Scanner;

public class Station {
	final static int MAX_DETECTIVES=5;
	public static int lastBadgeNum = 0;
	String name;
	int currDetectives=0;
	Detective[] detectives = new Detective[MAX_DETECTIVES];
    Scanner scanner = new Scanner(System.in);
	
	public void printDetectives() {
		for (int i=0;i<currDetectives;i++) {
			System.out.print("/n"+detectives[i].badgeNumber+"     "+detectives[i].name);
		}
		System.out.println();
	}
	
	public void hireDetective() {
		if(currDetectives<MAX_DETECTIVES) {
			String name;
			System.out.print("Please enter detective name: ");
			name=scanner.nextLine();
			System.out.println();
			detectives[currDetectives]=new Detective(name, lastBadgeNum);
			lastBadgeNum++;
		}
		else {
			println("Error: This station already has the maximum number of detectives!")
		}}
	
	public Station(String name){
		this.name=name;
	}
	}
