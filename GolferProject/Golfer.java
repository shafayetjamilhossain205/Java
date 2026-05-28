
public class Golfer {
	
	/**
	 * The golfers name
	 */
	private String name;
	
	/**
	 * The name of the Golfers home course
	 */
	private String homeCourse;
	
	/**
	 * The golfers Id number
	 */
	private int idNum;
	
	/**
	 * The golfers recorded number of scores
	 */
	private int numScores;
	
	/**
	 * The golfers list of scores
	 */
	private Score[] scores;
	
	/**
	 * The next golfers Id number
	 */
	private static int nextIDNum = 1000;	
	
	/**
	 * Default constructor 
	 */
	public Golfer() {
		name = "";
		homeCourse = "";
		idNum = 0;
		numScores = 0;
		scores = new Score[10];
	}
	
	/**
	 * Default Constructor with parameters
	 * @param name The golfers name
	 * @param homeCourse the name of the golfer's home course
	 */
	public Golfer(String aName, String aHomeCourse) {
		setName(aName);
		setHomeCourse(aHomeCourse);
		setIdNum();
		setNumScores();
		setScores(new Score[10]);
	}
	
	/**
	 * Finds the score in accordance to the parameterized date
	 * @param date The date of the score to search for
	 * @return The scores index
	 */
	private int findScore(String date) {
		final int NOTFOUND = -1;
		
		for (int i = 0; i < numScores; i++) {
			if (scores[i].getDate().equals(date)) {
				return i;
			}
		}
		return NOTFOUND;
	}
	
	/**
	 * Returns the golfers name
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name of the golfer
	 * @param name The golfers name
	 */
	public void setName(String aName) {
		name = aName;
	}
	
	/**
	 * Returns the name of the golfer's home course
	 * @return The Home courses name
	 */
	public String getHomeCourse() {
		return homeCourse;
	}
	
	/**
	 * Sets the name of the home course
	 * @param homeCourse the name of the home course
	 */
	public void setHomeCourse(String aHomeCourse) {
		homeCourse = aHomeCourse;
	}
	
	/**
	 * Returns the golfer's id number
	 * @return Id number
	 */
	public int getIdNum() {
		return idNum;
	}
	
	/**
	 * Sets the golfers id number
	 */
	public void setIdNum() {
		idNum = nextIDNum++;
	}
	
	/**
	 * Returns the number of recorded golfer scores
	 * @return the number of scores
	 */
	public int getNumScores() {
		return numScores;
	}
	
	/**
	 * Sets the number of scores to 0 for a new golfer
	 */
	public void setNumScores() {
		numScores = 0;
	}
	
	/**
	 * Returns a list of the golfer's scores
	 * @return array list of scores
	 */
	public Score[] getScores() {
		return scores;
	}
	
	/**
	 * Sets the list of scores for a golfer
	 * @param scores the list of scores
	 */
	public void setScores(Score[] theScores) {
		scores = theScores;
	}
	
	/** 
	 * adds a score to the golfer's record
	 * @param courseName the name of the golfer's home course
	 * @param score the score the golfer made
	 * @param date the date of the score
	 * @param courseRating the rating of the course
	 * @param courseSlope the slope (difficulty) of the course
	 */
	public void addScore(String courseName, int score, String date, double courseRating, int courseSlope) {
		scores[getNumScores()] = new Score(courseName, score, date, courseRating, courseSlope);
		numScores++;
	}
	
	/**
	 * deletes a score from the golfer's record
	 * @param date the date of the score
	 * @return true if the score was deleted successfully 
	 */
	public boolean deleteScore(String date) {
		int arrayIndex = findScore(date);
		if (arrayIndex != -1) {
			for (int i = arrayIndex; i < getNumScores() - 1; i++) {
				scores[i] = scores[i + 1];
			}
			scores[getNumScores() - 1] = null;
			numScores--;
			return true;
		}
		return false;
	}
	
	/**
	 * Returns the score recorded on a specific date
	 * @param date the date of the score
	 * @return the score recorded on a specific date, or null if there was no score on that date
	 */
	public Score getScore(String date) {
		int i = findScore(date);
		if (i != -1) {
			return getScores()[i];
		}
		return null;
	}
	
	/**
	 * Returns the lowest score on the golfer's record
	 * @return the lowest score
	 */
	public Score lowestScore() {
		if (getNumScores() == 0) {
			return null;
		}
		
		Score lowest = scores[0];
		for(int i = 1; i < getNumScores(); i++) {
			if (scores[i].getScore() < lowest.getScore()) {
				lowest = getScores()[i];
			}
		}
		return lowest;
	}
	
	/**
	 * Returns a string of the golfers details and scores
	 * @return the golfers details and scores
	 */
	@Override
	public String toString() {
		String golferDetails;
		
		golferDetails = getName() + "	ID number: " + getIdNum() + " Home Course: " + getHomeCourse() + "\n\n";
		golferDetails += "Score	Date	Course		Course Rating	Course Slope\n";
		for(int i = 0; i < getNumScores(); i++) {
			golferDetails += getScores()[i].toString(); 
		}
		return golferDetails;
	}
	
}
