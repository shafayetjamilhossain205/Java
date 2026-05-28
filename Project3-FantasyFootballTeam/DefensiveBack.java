/**
 * COP 5007 Project 3 
 * @author Mohammad Shafayet Jamil Hossain
 */
/**
 * The DefensiveBack class represents a defensive back.
 */
public class DefensiveBack implements FootballPlayer {
	/** Player name */
	private String name;
	 /** NFL team name */
	private String nflTeam;
	/** Number of games played */
	private int noGamesPlayed;
	 /** Number of tackles */
	private int tackles;
	/** Number of interceptions */
	private int interceptions;
	/** Number of forced fumbles */
	private int forcedFumbles;
	
	
	
	/**
	 * default constructor
	 */
	
	public DefensiveBack() {
		name ="";
		nflTeam = "";
		 noGamesPlayed = 0;
		 tackles = 0;
		 interceptions = 0;
		 forcedFumbles = 0;
		 //touchDowns = 0;
		
	}
	
	 /**
     * Parameterized constructor.
     * @param name player name
     * @param nflTeam NFL team
     * @param noGamesPlayed number of games played
     * @param tackles number of tackles
     * @param interceptions number of interceptions
     * @param forcedFumbles number of forced fumbles
     */
	public DefensiveBack(String name,String nflTeam,int noGamesPlayed,int tackles,
			int interceptions,int forcedFumbles	) {
		
		setName(name);
		setNflTeam(nflTeam);
		setNoGamesPlayed(noGamesPlayed);
		setTackles(tackles);
		setInterceptions( interceptions);
		setForcedFumbles(forcedFumbles);
		//setTouchDowns(touchDowns);
		
		
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
	 * get the name of the nfl team
	 * @return nfl team name
	 */
	
	public String getNflTeam() {
		return nflTeam;
	}
	/**
	 * set the nfl team 
	 * @param nflTeam
	 */
	
	public void setNflTeam(String nflTeam) {
		if(nflTeam != null) {
			this.nflTeam = nflTeam;
		}else {
			this.nflTeam = "";
		}
	}
	/**
	 * g4etting the no games played
	 * @return noGamesPlayed
	 */
	
	
	public int getNoGamesPlayed() {
		return noGamesPlayed;
	}
	/**
	 *  set the number of the games
	 * @param noGamesPlayed
	 */

	public void setNoGamesPlayed(int noGamesPlayed) {
		if(noGamesPlayed >= 0) {
			this.noGamesPlayed = noGamesPlayed;
		}else {
			this.noGamesPlayed = 0;
		}
	}
	/**
     * Gets tackles.
     * @return tackles
     */
	public int getTackles() {
		return tackles;
	}
	/**
     * Sets tackles by defensive back.
     * @param tackles number of tackles
     */
	public void setTackles(int tackles ) {
		if(tackles >= 0 ) {
			this.tackles = tackles;
		}else {
			this.tackles = 0;
		}
	}
	/**
     * Gets interceptions.
     * @return interceptions
     */
	public int getInterceptions() {
		return interceptions;
		
	}
	/**
     * Sets interceptions.
     * @param interceptions number of interceptions
     */

	public void setInterceptions( int interceptions) {
		if(interceptions >= 0) {
			this.interceptions = interceptions;
		}else {
			this.interceptions = 0;
		}
	}

//	public int getTotalYard(int totalYard) {
//		return totalYard;
//	}
//	 public void setTotalYard(int totalYard) {
//		 
//		 if( totalYard >= 0) {
//			 this.totalYard = totalYard;
//		 }else {
//			 this.totalYard = 0;
//		 }
//	 }


	 public int getForcedFumbles(int forcedFumbles) {
		 return forcedFumbles;
	 }
	 /**
	     * Gets forced fumbles.
	    
	     * @return forced fumbles
	     */
	 public void setForcedFumbles(int forcedFumbles) {
		 if( forcedFumbles >= 0) {
			 this.forcedFumbles = forcedFumbles;
		 }else {
			 this.forcedFumbles = 0;
		 }
	 }
	 
//                  1. averageTacklesPerGame
     //2. averageInterceptionsPerGame
    // 3. averageForcedFumblesPerGame()

	 /**
	  * average tackle
	  * @return	average tavkle
	  */
	 public double averageTacklesPerGame() {
		 if(  noGamesPlayed == 0 ) {
			 return 0.0;
		 }
		 return (double ) tackles /   noGamesPlayed;
	 }
	 /**
	  * average interceptions
	  * @return	average interceptions
	  */
	 public double averageInterceptionsPerGame() {
		 if( noGamesPlayed == 0 ) {
			 return 0.0;
		 }
		 return (double ) interceptions /  noGamesPlayed ;
	 }
	 /**
	  * average forced fumbles per game	
	  * @return average forced fumbles
	  */
	 public double averageForcedFumblesPerGame() {
		 if( noGamesPlayed == 0 ) {
			 return 0.0;
		 }
		 return (double ) forcedFumbles /  noGamesPlayed ;
		 
	 }
	 /**
	  * return player rating
	  * @return playerrating
	  */

	 public int playerRating() {
		 
		// Average Touch Downs Per Game + (Completion Percentage * 100) + (Average Passing Yards Per Game/5);
		 double rating = (averageTacklesPerGame() + averageInterceptionsPerGame() 
		 +  (averageForcedFumblesPerGame()/5)) * 10;
		 return (int ) rating; 
		 }
	 
	 /**
	  * return compare to 
	  * @return compareTo
	  */
	 public int compareTo(FootballPlayer other) {
		 return this.playerRating() - other.playerRating();
	 }


	 public String getPosition() {
		 return " Defensive Back";
	 }
	 /**
	  *  return formated string
	  *  @return string
	  */
	 public String toString() {
		 return "Name: " + name + " Position: " + getPosition() +  " NFL Team: " + nflTeam + "\n"
			+ String.format(" Tackles Per game: %.2f, Interception  Per Game: %.2f\n",averageTacklesPerGame(), averageInterceptionsPerGame() )
			+ String.format(" Forced Per Game: %.2f, Player's Rating: %d",  averageForcedFumblesPerGame(),playerRating());
	 }








}
