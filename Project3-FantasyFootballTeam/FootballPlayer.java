
/**
 * COP 5007 Project 3 
 * @author Mohammad Shafayet Jamil Hossain
 */

/**
 * Interface representing a generic of football player.
 * All player types must implement these methods.
 */

public interface FootballPlayer {
	
	 /**
     * Calculates  the player rating.
     * @return player rating 
     */
	int playerRating();
	 /**
     * Compares this player with another player based on rating.
     * @param other another FootballPlayer object
     * @return positive if this player is better
     */
	int compareTo(FootballPlayer other);
	/**
     * Returns string representation of player.
     * @return formatted string
     */
	
	String toString();
	/**
     * Returns the player name.
     * @return player name
     */
	String getName();
	/**
     * Returns the player's position.
     * @return position as String
     */
	String getPosition();

}
