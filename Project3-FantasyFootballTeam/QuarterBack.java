/**
 * COP 5007 Project 3 
 * @author Mohammad Shafayet Jamil Hossain
 */

/**
 * The QuarterBack class represents a football quarterback.
 * It stores quarterback implements from footballplayer
 */
public class QuarterBack implements FootballPlayer{
	
//    1. Players name.
//    2. NFL Team
//    3. Number of Games played this season.
//    4. Pass Attempts
//    5. Pass Completed
//    6. Touchdowns Passing
//    7. Total Yards Passing

	/** Player name */
	private String name;
	/** NFL team name */
	private String nflTeam;
	/** Number of games played */
	private int noGamesPlayed;
	 /** Number of pass attempts */
	private int passAttempts;
	/** Number of completed passes */
	private int passCompleted;
	/** Total passing yards */
	private int totalYard;
	/** Total passing touchdowns */
	private int touchDowns;
	
	
	/**
	 * default constructor
	 */
	
	public QuarterBack() {
		name ="";
		nflTeam = "";
		 noGamesPlayed = 0;
		 passAttempts = 0;
		 passCompleted = 0;
		 totalYard = 0;
		 touchDowns = 0;
		
	}
	/**
     * Parameterized constructor.
     *
     * @param name player name
     * @param nflTeam NFL team name
     * @param noGamesPlayed number of games played
     * @param passAttempts number of pass attempts
     * @param passCompleted number of completed passes
     * @param totalYard total passing yards
     * @param touchDowns total passing touchdowns
     */
	
	public QuarterBack(String name,String nflTeam,int noGamesPlayed,int passAttempts,
			int passCompleted,int totalYard,int touchDowns	) {
		
		setName(name);
		setNflTeam(nflTeam);
		setNoGamesPlayed(noGamesPlayed);
		setPassAttempts(passAttempts);
		setPassCompleted( passCompleted);
		setTotalYard(totalYard);
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
     * @return NFL team name
     */
	public String getNflTeam() {
		return nflTeam;
	}

    /**
     * Sets NFL team.
     * @param nflTeam NFL team name
     */
	public void setNflTeam(String nflTeam) {
		if(nflTeam != null) {
			this.nflTeam = nflTeam;
		}else {
			this.nflTeam = "";
		}
	}
	/**
     * Gets number of pass attempts.
     * @return pass attempts
     */
	public int getPassAttempts() {
		return passAttempts;
	}
	
	public void setPassAttempts(int passAttempt ) {
		if(passAttempt >= 0 ) {
			this.passAttempts = passAttempt;
		}else {
			this.passAttempts = 0;
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
	/**
     * Gets number of completed passes.
     * @return completed passes
     */
	public int getPassCompleted() {
		return passCompleted;
		
	}
	/**
     * Sets number of completed passes.
     * @param passCompleted completed passes
     */
	public void setPassCompleted( int passCompleted) {
		if(passCompleted >= 0) {
			this.passCompleted = passCompleted;
		}else {
			this.passCompleted = 0;
		}
	}
	 /**
     * Gets total passing yards.
     * @return total passing yards
     */

	public int getTotalYard() {
		return totalYard;
	}
	/**
     * Sets total passing yards.
     * @param totalYard total passing yards
     */
	 public void setTotalYard(int totalYard) {
		 
		 if( totalYard >= 0) {
			 this.totalYard = totalYard;
		 }else {
			 this.totalYard = 0;
		 }
	 }

	 /**
	     * Gets total passing touchdowns.
	     * @return passing touchdowns
	     */
	 public int getTouchDowns() {
		 return touchDowns;
	 }
	 /**
	     * Sets total passing touchdowns.
	     * @param touchDowns passing touchdowns
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

	 public double completionPercentage() {
		 if( passAttempts == 0 ) {
			 return 0.0;
		 }
		 return (double ) passCompleted /  passAttempts;
	 }
	 /**
	  * getting average passing yard
	  * @return average
	  */

	 public double averagePassingYardsPerGame() {
		 if( noGamesPlayed == 0 ) {
			 return 0.0;
		 }
		 return (double ) totalYard /  noGamesPlayed ;
	 }
	 /**
	  * average touch down per game
	  * @return average touch down per game
	  */

	 public double averageTouchDownsPerGame() {
		 if( noGamesPlayed == 0 ) {
			 return 0.0;
		 }
		 return (double ) touchDowns /  noGamesPlayed ;
		 
	 }
	 	/**
	     * Calculates player rating.
	     * @return player rating as integer
	     */

	 public int playerRating() {
		 
		// Average Touch Downs Per Game + (Completion Percentage * 100) + (Average Passing Yards Per Game/5);
		 double rating = averageTouchDownsPerGame() + 
				 (completionPercentage() * 100.0) +(averagePassingYardsPerGame()/5.0);
		 return (int ) rating; 
		 }
	 
	 /**
     * Compares this player with another player by rating.
     * @param other another football player
     * @return positive if this player has higher rating,
     */
	 public int compareTo(FootballPlayer other) {
		 return this.playerRating() - other.playerRating();
	 }

	 /**
	     * Gets player position.
	     * @return player position
	     */
	 public String getPosition() {
		 return " Quarter Back";
	 }
	 /**
	     * Returns formatted player information.
	     * @return string representation of quarterback
	     */
	 public String toString() {
		 return "Name: " + name + " Position: " + getPosition() +  " NFL Team: " + nflTeam + "\n"
			+ String.format("Completion Percentage: %.2f, Average Passing Yards Per Game: %.2f\n",completionPercentage(), averagePassingYardsPerGame())
			+ String.format(" Average Touch Downs Per Game: %.2f, Player's Rating: %d",  averageTouchDownsPerGame(),playerRating());
	 }












}
