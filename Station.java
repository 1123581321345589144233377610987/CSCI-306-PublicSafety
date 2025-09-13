import java.util.Scanner;

public class Station {
	final static int MAX_DETECTIVES=5;
	public static int lastBadgeNum = 0;
	String name;
	int currDetectives=0;
	Detective[] detectives = new Detective[MAX_DETECTIVES];
    Scanner scanner = new Scanner(System.in);
	
	public void printDetectives() {
		System.out.println("Listing all detectives for"+this.name);
		for (int i=0;i<currDetectives;i++) {
			System.out.print("/nDetective [Badge="+detectives[i].badgeNumber+", Name="+detectives[i].name+"]");
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
			System.out.println("Can't hire any more detectives for "+this.name);
		}}
	
	public Station(String name){
		this.name=name;
	}
	}
