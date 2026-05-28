

public class GolferTester {

	

    public static void main(String[] args) {

        Golfer golfer1 = new Golfer("John Smith", "Bay Hill CC");
        
        // Add valid scores
        golfer1.addScore("Bay Hill CC", 75, "6/3/12", 64.5, 121); 
        golfer1.addScore("AC Read 623", 77, "7/23/12", 70.3, 124);  
        golfer1.addScore("St. Andrews", 74, "8/5/12", 74.3, 129);   

        System.out.println(golfer1.toString());
        System.out.println("Lowest Score:");
        System.out.println(golfer1.lowestScore());

        golfer1.deleteScore("7/23/12");
        System.out.println("Display after deleting score:");
        System.out.println(golfer1.toString());

        System.out.println("Testing golfer with invalid data:");
        Golfer golfer2 = new Golfer("Mary Higgins", "St. Andrews");
  
        golfer2.addScore("AC Read 700", 72, "4/27/12", 71.4, 125);  
        golfer2.addScore("Bay Hill CC",  20, "1/3/12", 20.3, 40);     

        System.out.println(golfer2.toString());

        System.out.println("Testing the default constructor with no parameters (golfer with no data):");
        Golfer golfer3 = new Golfer();
        System.out.println(golfer3.toString());

        System.out.println("Testing Golfer with maximum number of scores:");
        Golfer golfer4 = new Golfer("Tiger Woods", "Augusta National");

        for (int i = 1; i <= 10; i++) {
            golfer4.addScore("Augusta National", 70 + i, "1/" + i + "/22", 74.5, 130);
        }
        
        System.out.println(golfer4.toString());
        
        golfer4.addScore("Augusta National", 68, "2/1/22", 74.5, 130);  // This should not be added as the array is full
        System.out.println("After attempting to add an 11th score:");
        System.out.println(golfer4.toString());
    }
}
