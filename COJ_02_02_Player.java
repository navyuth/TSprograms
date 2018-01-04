

class Player {

	private int id;
	private String name;
	private static int idGenerator = 100000;
	
	
	

	public Player(String name) {
		this.id = ++idGenerator;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + "]";
	}
	
}

class Batsman extends Player {

	private int runsScored;
	private int centuries;
	private int halfCenturies;
	private int sixes;
	private int fours;
	private int ballsFaced;

	public Batsman(String name, int runsScored, int centuries, int halfCenturies, int sixes, int fours,
			int ballsFaced) {
		super(name);
		this.runsScored = runsScored;
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
		this.sixes = sixes;
		this.fours = fours;
		this.ballsFaced = ballsFaced;
	}

	public int getRunsScored() {
		return runsScored;
	}

	public int getCenturies() {
		return centuries;
	}

	public int getHalfCenturies() {
		return halfCenturies;
	}

	public int getSixes() {
		return sixes;
	}

	public int getFours() {
		return fours;
	}

	public int getBallsFaced() {
		return ballsFaced;
	}

	@Override
	public String toString() {
		return "Batsman [runsScored=" + runsScored + ", centuries=" + centuries + ", halfCenturies=" + halfCenturies
				+ ", sixes=" + sixes + ", fours=" + fours + ", ballsFaced=" + ballsFaced + "]";
	
	}
}

class Bowler extends Player {

	private int ballsBowled;
	private int runsLeaked;
	private int wickets;

	public Bowler(String name, int ballsBowled, int runsLeaked, int wickets) {
		super(name);
		this.ballsBowled = ballsBowled;
		this.runsLeaked = runsLeaked;
		this.wickets = wickets;
	}

	public int getBallsBowled() {
		return ballsBowled;
	}

	public int getRunsLeaked() {
		return runsLeaked;
	}

	public int getWickets() {
		return wickets;
	}

	@Override
	public String toString() {
		return "Bowler [ballsBowled=" + ballsBowled + ", runsLeaked=" + runsLeaked + ", wickets=" + wickets + "]";
	}

}

public class COJ_02_02_Player {

	public static void main(String[] args) {
		Player player= new Player("Navyuth");
		System.out.println(player);
		Batsman batsman = new Batsman("Dhoni", 1122, 4, 8, 23, 28, 612);
		System.out.println(batsman);
		Bowler bowler = new Bowler("Ravindra Jadeja", 234, 178, 25);
		System.out.println(bowler);
		
	}

}