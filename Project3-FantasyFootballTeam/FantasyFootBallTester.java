/**
 * COP 5007 Project 3 
 * @author Mohammad Shafayet Jamil Hossain
 */


import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class FantasyFootBallTester {
	 public static void main(String[] args) {
	        try {
	        	/**
	        	 * create Quarterback objects;
	        	 */
	        	QuarterBack qb1 = new QuarterBack("Phil Sims", "Giants", 8, 100, 25,4000, 12);
	        	QuarterBack qb2 = new QuarterBack("Steve Young", "49 ers", 8, 100, 25,3000, 12);
	        	/**
	        	 * create Runningback objects;
	        	 */
	        	RunningBack rb1 = new RunningBack("Jim Brown", "Browns", 12, 128, 1250, 8);
	        	RunningBack rb2 = new RunningBack("Saquon Barkley", "Giants", 12, 110, 1254, 8);
	        	/**
	        	 * create RDefensive objects;
	        	 */
	        	DefensiveBack db1 = new DefensiveBack("Spider Lockhart", "Giants", 14, 20, 5, 3);
	        	DefensiveBack db2 = new DefensiveBack("Aqib Talib", "Rams", 14, 30, 7, 6);
	        	/**
	        	 * create team
	        	 */
	        	FantasyFootballTeam team1 = new FantasyFootballTeam("UWF Argos", "Mr. Pinto", 5);
	        	FantasyFootballTeam team2 = new FantasyFootballTeam("Cantonment Stompers", "Mrs. Pinto", 5);
	        	/**
	        	 * add players to the teams
	        	 */
	        	team1.addPlayer(qb1);
	            team1.addPlayer(rb1);
	            team1.addPlayer(db1);

	            team2.addPlayer(qb2);
	            team2.addPlayer(rb2);
	            team2.addPlayer(db2);

	            System.out.println(team1);
	            System.out.println(team2);
	            
	            /**
	             * add players to the position.
	             */
	            System.out.println("Testing finding the player by position");
	            System.out.println(team1.findPlayerbyPosition("Quarter Back"));
	            
	            System.out.println("Testing comparing two players rating");
	            System.out.println("Comparing " + qb1.getName() + " with" + qb2.getName());
	            
	            if (qb1.compareTo(qb2) > 0) {
	                System.out.println(qb1.getName() + " has a higher rating.");
	            } else if (qb1.compareTo(qb2) < 0) {
	                System.out.println(qb2.getName() + " has a higher rating.");
	            } else {
	                System.out.println("Both players have equal ratings.");
	            }
	            readPlayersFromFile("src/footballData.txt");
	          //  readPlayersFromFile("C:\\Users\\Shafayet\\eclipse-workspace\\Project3\\src\\footballData.txt");
	            /**
	             * catches exception
	             */
	        } catch (ArrayFullException e) {
	            System.out.println(e.getMessage());
	        } catch (NullPlayerException e) {
	            System.out.println(e.getMessage());
	        } catch (FileNotFoundException e) {
	            System.out.println("File was not found.");
}
	 }
	 /**
	  * filename name from the file containing players data
	  * @param fileName
	  * @throws FileNotFoundException
	  */
	 public static void readPlayersFromFile(String fileName) throws FileNotFoundException {
		// s = s.replaceAll("\\s+", "")
		 File file = new File("src/footballData.txt");
	        Scanner inputFile = new Scanner(file);

	        while (inputFile.hasNextLine()) {
	            String type = inputFile.nextLine().trim();
	            if (type.equalsIgnoreCase("QB")) {
	                String name = inputFile.nextLine().trim();
	                String team = inputFile.nextLine().trim();
	                int games = Integer.parseInt(inputFile.nextLine().trim());
	                int attempts = Integer.parseInt(inputFile.nextLine().trim());
	                int completed = Integer.parseInt(inputFile.nextLine().trim());
	               
	                int yards = Integer.parseInt(inputFile.nextLine().trim());
	                int touchdowns = Integer.parseInt(inputFile.nextLine().trim());

	                QuarterBack qb = new QuarterBack(name, team, games, attempts, completed,  yards, touchdowns);
	                System.out.println(qb);
	                System.out.println();
	            } else if (type.equalsIgnoreCase("RB")) {
	                String name = inputFile.nextLine().trim();
	                String team = inputFile.nextLine().trim();
	                int games = Integer.parseInt(inputFile.nextLine().trim());
	                int attempts = Integer.parseInt(inputFile.nextLine().trim());
	                int yards = Integer.parseInt(inputFile.nextLine().trim());
	                int touchdowns = Integer.parseInt(inputFile.nextLine().trim());

	                RunningBack rb = new RunningBack(name, team, games, attempts, yards, touchdowns);
	                System.out.println(rb);
	                System.out.println();
	            } else if (type.equalsIgnoreCase("DB")) {
	                String name = inputFile.nextLine().trim();
	                String team = inputFile.nextLine().trim();
	                int games = Integer.parseInt(inputFile.nextLine().trim());
	                int tackles = Integer.parseInt(inputFile.nextLine().trim());
	                int interceptions = Integer.parseInt(inputFile.nextLine().trim());
	                int forcedFumbles = Integer.parseInt(inputFile.nextLine().trim());

	                DefensiveBack db = new DefensiveBack(name, team, games, tackles, interceptions, forcedFumbles);
	                System.out.println(db);
	                System.out.println();
	            }
	        }

	        inputFile.close();
	    }
	 }
	 
