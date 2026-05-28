/**
 * COP 5007 Project 3 
 * @author Mohammad Shafayet Jamil Hossain
 */

/**
 * represents a fantasy football team 
 */
public class FantasyFootballTeam {
	/**
	 * name of the team
	 */
private String teamName;
/**
 * name of the team owner
 */
private String teamOwner;
/**
 * array of the footballplayer objects
 */
private FootballPlayer[] players;
/**
 *  counts the number of the players
 */
private int count;

/**
 * parameterized constructor
 * @param teamName
 * @param teamOwner
 * @param size
 */


public FantasyFootballTeam(String teamName, String teamOwner, int size) {
	this.teamName = teamName;
	this.teamOwner = teamOwner;
	 players = new FootballPlayer[size];
	  count = 0;
}

/**
 * get team name
 * @return	team name;
 */
public String getTeamName() {
    return teamName;
}

/**
 * get the team owner;
 * @return team owner;
 */
public String getTeamOwner() {
    return teamOwner;
}

/**
 *  gets the number of the player
 * @return number of the players
 */
public int getCount() {
    return count;
}
/**
 * adds player to the team
 * @param player
 * @throws ArrayFullException
 * @throws NullPlayerException
 */

public void addPlayer(FootballPlayer player) throws ArrayFullException, NullPlayerException{
	if(player == null) {
		throw new NullPlayerException("football player object is null");
	}
	if(count >= players.length) {
		throw new ArrayFullException("Array is full");
	}
	players[count] = player;
	count++;
}
/**
 * finds player by the position where he plays;
 * @param position
 * @return
 */

public String findPlayerbyPosition(String position) {
	String result ="";
	boolean location =false;
	
	
	for(int i =0; i < count; i++) {
		if(players[i].getPosition().equalsIgnoreCase(position)) {
			result += players[i].getName() + "\n";
			location = true;
		}
	}
	if(!location) {
		return "No player at " + position + "found.";
	}
	return result;
}
/**
 * returns string representation of the team.
 * @return formatted string of the details.
 */

public String toString() {
	String result = "Team Name: " + teamName + "OWner: " + teamOwner + "\n\n";
	
	for(int i = 0; i< count; i++) {
		result += players[i].toString() + "\n\n";
	}
	return result;
}




















}
