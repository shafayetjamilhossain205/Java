
public class Score {
	
	/**
	 * the name of the course
	 */
	private String courseName;
	
	/**
	 * the score the golfer made
	 */
	private int score;
	
	/**
	 * the date the score was made
	 */
	private String date;
	
	/**
	 * the rating of the course
	 */
	private double courseRating;
	
	/**
	 * the slope (difficulty) of the course
	 */
	private int courseSlope;
	
	/**
	 * Default Constructor with no parameters
	 */
	public Score() {
		courseName = "";
		score = 9999;
		date = "";
		courseRating = 9999;
		courseSlope = 9999; 
	}
	
	/**
	 * Default Constructor with parameters
	 * @param courseName the name of the course
	 * @param score the score the golfer made
	 * @param date the date of the score
	 * @param courseRating the rating of the course
	 * @param courseSlope the slope (difficulty) of the course
	 */
	public Score(String courseName, int score, String date, double courseRating, int courseSlope) {
		setCourseName(courseName);
		setDate(date);
		
		if(score >= 40 && score <= 200) {
			setScore(score);
		}
		else {
			System.out.println("Error, score must be between 40 and 200 (inclusive)");
			setScore(9999);
		}
		
		if(courseRating >= 60 && courseRating <= 80) {
			setCourseRating(courseRating);
		}
		else {
			System.out.println("Error, course rating must be between 60 and 80 (inclusive)");
			setCourseRating(9999);
		}
		
		if(courseSlope >= 55 && courseSlope <= 155) {
			setCourseSlope(courseSlope);
		}
		else {
			System.out.println("Error, course slope must be between 55 and 155 (inclusive)");
			setCourseSlope(9999);
		}
	}
	
	/**
	 * Returns the name of the course
	 * @return the name of the course
	 */
	public String getCourseName() {
		return courseName;
	}
	
	/**
	 * Sets the name of the course
	 * @param courseName the name of the course
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	/**
	 * Returns the score
	 * @return the scores
	 */
	public int getScore() {
		return score;
	}
	
	/**
	 * Sets the score
	 * @param score the score
	 */
	public void setScore(int score) {
			this.score = score;
	}
	
	/**
	 * Returns the date of the score
	 * @return the date of the score
	 */
	public String getDate() {
		return date;
	}
	
	/**
	 * Sets the date of the score
	 * @param date the date of the score
	 */
	public void setDate(String date) {
		this.date = date;
	}
	
	/**
	 * Returns the rating of the course
	 * @return the rating of the course
	 */
	public double getCourseRating() {
		return courseRating;
	}
	
	/**
	 * Sets the rating of the course
	 * @param courseRating the rating of the course
	 */
	public void setCourseRating(double courseRating) {
			this.courseRating = courseRating;
	}

	/**
	 * Returns the course slope
	 * @return the course slope
	 */
	public int getCourseSlope() {
		return courseSlope;
	}
	
	/**
	 * Sets the slope of the course
	 * @param courseSlope the course slope
	 */
	public void setCourseSlope(int courseSlope) {
			this.courseSlope = courseSlope;
	}
	
	/**
	 * Returns a string of details of the score
	 * @return the details of the score
	 */
	@Override
	public String toString() {
		return getScore() + "	" + getDate() + "	" + getCourseName() + "	" + getCourseRating() + "		" + getCourseSlope() + "\n";
	}
}
