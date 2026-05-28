/**
 * COP 5007 Project 3 
 * @author Mohammad Shafayet Jamil Hossain
 */

/**
 * The RunningBack class 
 */
public class RunningBack implements FootballPlayer{

	/** Player name */
	private String name;
	 /** NFL team name */
	private String nflTeam;
	/** Number of games played */
	private int noGamesPlayed;
	 /** Number of rushing attempts */
	private int passAttempts_qb;
	//private int passCompleted;

    /** Total rushing yards */
	private int totalYard_qb;
	/** Total touchdowns */
	private int touchDowns;
	
	
	/**
	 * default constructor
	 */
	
	public RunningBack() {
		name ="";
		nflTeam = "";
		 noGamesPlayed = 0;
		 passAttempts_qb = 0;
		 //passCompleted = 0;
		 totalYard_qb = 0;
		 touchDowns = 0;
		
	}
	/**
     * Parameterized constructor.
     * @param name player name
     * @param nflTeam NFL team
     * @param noGamesPlayed number of games played
     * @param passAttempts_qb rushing attempts
     * @param totalYards total rushing yards
     * @param touchDowns total touchdowns
     */
	public RunningBack(String name,String nflTeam,int noGamesPlayed,int passAttempts_qb,
			int totalYard_qb,int touchDowns	) {
		
		setName(name);
		setNflTeam(nflTeam);
		setNoGamesPlayed(noGamesPlayed);
		setPassAttempts_qb(passAttempts_qb);
		//setPassCompleted( passCompleted);
		setTotalYard_qb(totalYard_qb);
		setTouchDowns(touchDowns);
		
		
	}
	/**
     * Gets player name.
     * @return player name
     */
	public String getName() {
		return name;
	}
	/**
     * Sets player name.
     * @param name player name
     */
	public void setName(String name) {
		if(name !=null) {
			this.name = name;
		}else {
			//System.out.println("Error, please enter the name");
			this.name = "";
		}
	}
	 /**
     * Gets NFL team.
     * @return NFL team
     */
	public String getNflTeam() {
		return nflTeam;
	}
	/**
     * Sets NFL team.
     * @param nflTeam NFL team
     */
	public void setNflTeam(String nflTeam) {
		if(nflTeam != null) {
			this.nflTeam = nflTeam;
		}else {
			this.nflTeam = "";
		}
	}
	
	/**
	 *  getting pass attempt of qb
	 * @return pass attempt 
	 */
	public int getPassAttempts_qb() {
		return passAttempts_qb;
	}
	
	/**
	 * set pass attempt
	 * @param passAttempt_qb
	 */
	public void setPassAttempts_qb(int passAttempt_qb ) {
		if(passAttempt_qb >= 0 ) {
			this.passAttempts_qb = passAttempt_qb;
		}else {
			this.passAttempts_qb = 0;
		}
	}
	/**
     * Gets number of games played.
     * @return number of games played
     */
	public int getNoGamesPlayed() {
		return noGamesPlayed;
	}
	/**
     * Sets number of games played.
     * @param noGamesPlayed number of games played
     */
	public void setNoGamesPlayed(int noGamesPlayed) {
		if(noGamesPlayed >= 0) {
			this.noGamesPlayed = noGamesPlayed;
		}else {
			this.noGamesPlayed = 0;
		}
	}

//	public int getPassCompleted() {
//		return passCompleted;
//		
//	}
//
//	public void setPassCompleted( int passCompleted) {
//		if(passCompleted >= 0) {
//			this.passCompleted = passCompleted;
//		}else {
//			this.passCompleted = 0;
//		}
//	}
	 
	/**
     * Gets total rushing yards.
     * @return total rushing yards
     */
	public int getTotalYard_qb(int totalYard_qb) {
		return totalYard_qb;
	}
	 /**
     * Sets total rushing yards.
     * @param totalYards total rushing yards
     */
	 public void setTotalYard_qb(int totalYard_qb) {
		 
		 if( totalYard_qb >= 0) {
			 this.totalYard_qb = totalYard_qb;
		 }else {
			 this.totalYard_qb = 0;
		 }
	 }

	 /**
	     * Gets total touchdowns.
	     * @return total touchdowns
	     */
	 public int getTouchDowns(int touchDowns) {
		 return touchDowns;
	 }
	 /**
	     * Sets total touchdowns.
	     * @param touchDowns total touchdowns
	     */
	 public void setTouchDowns(int touchDowns) {
		 if( touchDowns >= 0) {
			 this.touchDowns = touchDowns;
		 }else {
			 this.touchDowns = 0;
		 }
	 }
	 
//     1. double completionPercentage()
//     Formula: passes completed / pass Attempts

	 /**
	     * Calculates average yards per game.
	     * @return average yards per game
	     */
	 public double averageYardsPerAttempt() {
		 if( passAttempts_qb == 0 ) {
			 return 0.0;
		 }
		 return (double ) totalYard_qb /  passAttempts_qb;
	 }

	    /**
	     * Calculates average yards per attempt.
	     *
	     * @return average yards per attempt
	     */
	 public double averageYardsPerGame() {
		 if( noGamesPlayed == 0 ) {
			 return 0.0;
		 }
		 return (double ) totalYard_qb /  noGamesPlayed ;
	 }
	 /**
	     * Calculates average touchdowns per game.
	     *
	     * @return average touchdowns per game
	     */
	 public double averageTouchDownsPerGame() {
		 if( noGamesPlayed == 0 ) {
			 return 0.0;
		 }
		 return (double ) touchDowns /  noGamesPlayed ;
		 
	 }

	 /**
	     * Calculates player rating.
	     *
	     * @return player rating as integer
	     */
	 public int playerRating() {
		 
		// Average Touch Downs Per Game + (Completion Percentage * 100) + (Average Passing Yards Per Game/5);
		 double rating = averageTouchDownsPerGame() + 
				 (averageYardsPerAttempt()) +(averageYardsPerGame()/5.0);
		 return (int ) rating; 
		 }

	 public int compareTo(FootballPlayer other) {
		 return this.playerRating() - other.playerRating();
	 }

	 /**
	     * Gets player position.
	     * @return player position
	     */
	 public String getPosition() {
		 return " Running Back";
	 }
	 
	 public String toString() {
		 return "Name: " + name + " Position: " + getPosition() +  " NFL Team: " + nflTeam + "\n"
			+ String.format(" RuNning Yards per game: %.2f, Running Yards Per attempt: %.2f\n", averageYardsPerGame(),averageYardsPerAttempt())
			+ String.format(" Average Touch Downs Per Game: %.2f, Player's Rating: %d",  averageTouchDownsPerGame(),playerRating());
	 }











}
