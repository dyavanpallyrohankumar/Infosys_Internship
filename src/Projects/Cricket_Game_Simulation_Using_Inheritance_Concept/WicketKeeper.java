package Projects.Cricket_Game_Simulation_Using_Inheritance_Concept;

public class WicketKeeper extends Crickter {
	protected int stumpings;

	WicketKeeper(String name, int age, String country, int stumpings) {
		super(name, age, country);
		this.stumpings = stumpings;
	}

	public void keepWickets() {
		System.out.println("the total wickets are" + stumpings);
	}

	public void setStumpings(int stumpings) {
		this.stumpings = stumpings;
	}

	public void play() {
		System.out.println("he is the wicketkeeper");
	}
}