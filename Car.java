/**
 * A car class storing informations out the rental cars
 * 
 * @author Mohammad Shafayet Jamil Hossain
 
 */
public class Car {

	/**
	 * the renter's name
	 */
	private String carRenter;
	/**
	 * The car number
	 */

	private int carNum;
	/**
	 * the name of the model
	 */
	private String carName;
	/**
	 * the type of the car like midsize, suv, sedan, etc.
	 */
	private String carType;
	/**
	 * daily rental rate
	 */
	private double rate;
	/**
	 * the number of days rented
	 */
	private int days;

	/**
	 * DEfault constructor value of all instance variables to default values.
	 */
	public Car() {

		carRenter = "";
		carNum = 0;
		carName = "";
		carType = "";
		rate = 0.0;
		days = 0;
	}

	/**
	 * Constructs a car object with parameters
	 * 
	 * @param rent  the name of the renter
	 * @param num     the number of the car
	 * @param name    the name of the car model
	 * @param type    the car type
	 * @param cRate   the rental daily rate
	 * @param numDays the number of days rented
	 */
	public Car(String rent, int num, String name, String type, double cRate, int numDays) {

		carRenter = rent;
		carNum = num;
		carName = name;
		carType = type;
		rate = cRate;
		days = numDays;

	}

	/**
	 * returns the renters name
	 * 
	 * @return renter's name
	 */
	public String getCarRenter() {
		return carRenter;
	}

	/**
	 * returns the car numbers
	 * 
	 * @return car number
	 */
	public int getCarNum() {
		return carNum;
	}

	/**
	 * returns the car name
	 * 
	 * @return car's name
	 */
	public String getCarName() {
		return carName;
	}

	/**
	 * returns the car type
	 * 
	 * @return cars type
	 */
	public String getCarType() {
		return carType;
	}

	/**
	 * returns the cars rate
	 * 
	 * @return cars rate
	 */
	public double getCarRate() {
		return rate;
	}

	/**
	 * returns the numbers days for rent
	 * 
	 * @return number of days
	 */
	public int getNumOfDays() {
		return days;
	}

	/**
	 * sets the car renters name to the parameter value
	 * 
	 * @param rent renter's name
	 */
	public void setCarRenter(String rent) {
		carRenter = rent;
	}

	/**
	 * sets the car number to the parameter value
	 * 
	 * @param num cars number
	 */
	public void setCarNum(int num) {
		carNum = num;
	}

	/**
	 * sets the car name to the parameter value
	 * 
	 * @param name cars name
	 */
	public void setCarName(String name) {
		carName = name;
	}

	/**
	 * sets the car type/ brand to the parameter value
	 * 
	 * @param type cars type
	 */
	public void setCarType(String type) {
		carType = type;
	}

	/**
	 * sets the car rate to the parameter value
	 * 
	 * @param cRate cars rate
	 */
	public void setCarRate(double cRate) {
		rate = cRate;
	}

	/**
	 * sets the number of the days to the parameter value
	 * 
	 * @param numDays number of days
	 */
	public void setNumOfDays(int numDays) {
		days = numDays;
	}
// toString(): String

	/**
	 * shows all the information for each rental car
	 * 
	 * @return string
	 */
	public String toString() {
		return "Car renter's name: " + carRenter + "\nCar number: " + carNum + "\nCar name: " + carName + "\nCar type: "
				+ carType + String.format("\nRate: $%.2f", rate) + "\nRented for: " + days + " days";
	}

}
