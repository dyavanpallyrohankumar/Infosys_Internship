package Projects.Cricket_Game_Simulation_Using_Inheritance_Concept;
public class Batsman extends Crickter {
	protected int totalRuns;
	Batsman(String name, int age, String country, int totalRuns) {
		super(name, age, country);
		this.totalRuns = totalRuns;
	}
	public void bat() {
		System.out.println("the total runs are" + totalRuns);
	}
	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}
	public void play() {
		System.out.println("he is the crickter");
	}
}