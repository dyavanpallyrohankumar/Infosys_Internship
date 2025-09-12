package Projects.Cricket_Game_Simulation_Using_Inheritance_Concept;

public class Bowler extends Crickter {
	protected int wickets;

	Bowler(String name, int age, String country, int wickets) {
		super(name, age, country);
		this.wickets = wickets;
	}

	public void bowl() {
		System.out.println("the total wickets by bowling are" + wickets);
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public void play() {
		System.out.println("he is the Bowler");
	}
}