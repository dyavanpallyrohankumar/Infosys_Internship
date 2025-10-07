package Projects.Cricket_Game_Simulation_Using_Inheritance_Concept;

public class Main {
	public static void main(String[] args) {
		Batsman batting = new Batsman("virat kohili", 66, "India", 6600);
		batting.getDetails();
		batting.bat();
		batting.play();
		System.out.println("---------------------\n");
		Bowler bowling = new Bowler("Boomra", 77, "India", 76);
		bowling.getDetails();
		bowling.bowl();
		bowling.play();
		System.out.println("--------------------\n");
		WicketKeeper keeping = new WicketKeeper("Dhoni", 70, "India", 400);
		keeping.getDetails();
		keeping.keepWickets();
		keeping.play();
		// bowling.setWickets(4);
		// batting.setTotalRuns (12);
		// keeping.setStumpings (2);
	}
}