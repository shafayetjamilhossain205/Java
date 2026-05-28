/**
 * A car class storing informations out the rental cars
 * 
 * @author Mohammad Shafayet Jamil Hossain
  */
public class RentalCarCompany {
	/**
	 * maximum number of cars initiated to 20
	 */
	public static final int NUM_CARS = 20;
	/**
	 * an array storing car objects
	 */
	private Car[] theCars;
	/**
	 * Name of the company
	 */
	private String name;
	/**
	 * Number of cars currently rented
	 */
	private int rentCnt;

	/**
	 * No args constructor or it is the default constructor
	 */
	public RentalCarCompany() {
		name = "";
		theCars = new Car[NUM_CARS];
		rentCnt = 0;

	}

	/**
	 * Constructs a company with a name
	 * 
	 * @param c_Name the name of
	 */

	public RentalCarCompany(String c_Name) {
		this.name = c_Name;
		this.theCars = new Car[NUM_CARS];
		this.rentCnt = 0;
	}

	/**
	 * returns company name
	 * 
	 * @return company name
	 */
	public String getName() {
		return name;
	}

	/**
	 * sets company name
	 * 
	 * @param c_Name company name
	 */

	public void setName(String c_Name) {
		this.name = c_Name;
	}

	/**
	 * adding a new reservation to the array
	 * 
	 * @param renter  renter name
	 * @param num     car number
	 * @param carName car model
	 * @param type    cat types
	 * @param rate    the rental rates
	 * @param days    number of days rented
	 */

	public void addReservation(String renter, int num, String carName, String type, double rate, int days) {

		if (rentCnt < NUM_CARS) {
			theCars[rentCnt] = new Car(renter, num, carName, type, rate, days);
			rentCnt++;
		} else {
			System.out.println("cannot add more reservations and array is full.");
		}
	}

	/**
	 * calculate the total rental sales
	 * 
	 * @return total sales
	 */

	public double getTotalRentalSales() {
		double total = 0.0;
		for (int i = 0; i < rentCnt; i++) {
			double rate = theCars[i].getCarRate();
			int days = theCars[i].getNumOfDays();
			total += rate * days;
		}
		return total;
	}

	/**
	 * calculates the avg days rented
	 * 
	 * @return average days
	 */
	public double getAvgDays() {
		if (rentCnt == 0) {
			return 0.0;
		}
		int totalDays = 0;
		for (int i = 0; i < rentCnt; i++)
			totalDays += theCars[i].getNumOfDays();
		double average = totalDays;
		average = average / rentCnt;
		return average;
	}

	/**
	 * calculates the average rates
	 * 
	 * @return average rate
	 */

	public double getAvgRate() {
		if (rentCnt == 0) {
			return 0.0;
		}
		double totalRate = 0.0;
		for (int i = 0; i < rentCnt; i++) {
			totalRate += theCars[i].getCarRate();
		}

		return totalRate / rentCnt;
	}

	/**
	 * find a reservation using car number, if found shows car info
	 * 
	 * @param carNum the number of car
	 */
	public void findReservation(int carNum) {
		for (int i = 0; i < rentCnt; i++) {
			if (theCars[i].getCarNum() == carNum) {
				System.out.println("Found reservarion for car number: " + carNum);
				System.out.println("Car information:");
				System.out.println(theCars[i]);
				System.out.println();
				return;
			}
		}
		System.out.println("Counld not find reservation for this car number: " + carNum);
		System.out.println();

	}

	/**
	 * returns all the information of the cars in a formatted string
	 * 
	 * @return formatted strings
	 */
	public String toString() {
		String result = "Rental Car Company: " + name + "\n";

		for (int i = 0; i < rentCnt; i++) {
			result += theCars[i] + "\n" + "\n";
			// result = result + theCars[i] + System.lineSeparator();
		}
		return result;

	}

}
