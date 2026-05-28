/**
 * A car class storing informations out the rental cars
 * 
 * @author Mohammad Shafayet Jamil Hossain
  */

//RentalCarCompany company = new RentalCarCompany("EL Paso");
//		company.addReservation("doe",100, "Honda", "Seda",10,5);
//	
//		System.out.println(company);	

public class RentalCarTester {
	
	/**
	 * main method to test the constructor and public method.
	 * 
	 * @param args take the command line arguments
	 */

	public static void main(String[] args) {

		/**
		 * Creating a rental car company object
		 */
		RentalCarCompany company = new RentalCarCompany("EL Cheapo");
		/**
		 * add several car reservations to the company.
		 */
		company.addReservation("Blake", 123, "Nissan", "Compact", 23.99, 5);
		company.addReservation("Smith", 222, "Mazda", "midsize", 44.50, 4);
		company.addReservation("Joe", 352, "Chevy", "Suv", 54.99, 7);
		company.addReservation("Jane", 333, "Ford", "convertible", 39.99, 5);
		/**
		 * display all the rental reservations currently stored
		 */
		System.out.println(company);
		/**
		 * display tbe avg number of days the cars were rented.
		 */
		System.out.printf("Average day rented out is: %.2f\n", company.getAvgDays());
		/**
		 * shows the avg rental rate for all the cars
		 */
		System.out.printf("Average rate is: %.2f\n", company.getAvgRate());
		/**
		 * shows the total rental income generated from all the reservation
		 */
		System.out.printf("Total rental income is: %.2f\n", company.getAvgDays());
		/**
		 * find the reservation of that car number, if found then displays all the car
		 * info
		 */
		company.findReservation(222);
		/**
		 * same as previous method, but if the reservation of the car is not found,
		 * display reservation could not be found.
		 */
		company.findReservation(200);

	}

}
