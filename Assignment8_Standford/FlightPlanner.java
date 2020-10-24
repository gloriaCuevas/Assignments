import acm.program.*; 
import acm.util.*; 
import java.io.*; 
import java.util.*;

@SuppressWarnings("serial")
public class FlightPlanner extends ConsoleProgram
{

		public void run()
		{
			menu();
		}
		
		private void menu()
		{
				
				println("Welcome to Flight Planner");
				getFlightData("flights.txt");
				println("Here's a list of all the cities in our database: " );
				printCityList(cities);
				println("Let's plan a round-trip route!");
				String startingCity = readLine("Enter the starting city:  ");
				ArrayList<String> trip = new ArrayList<String>();
				trip.add(startingCity);
				String presentCity = startingCity;
				
				while (true)
					{
						String nextCity = getNextCity(presentCity);
						trip.add(nextCity);
						if(nextCity.equals(startingCity)) break;
						presentCity = nextCity;
					}
				printTrip(trip);
				}
		private void getFlightData(String filename)
		{
			flights = new HashMap<String,ArrayList<String>>(); 
			cities = new ArrayList<String>();
			try 
			{
			BufferedReader
			rd = new BufferedReader(new FileReader(filename)); 
			while (true) {
			String line = rd.readLine(); 
			if (line == null) break;
			if (line.length() != 0)
				{
			            readFlightEntry(line);
			        }
			}
			rd.close();
			} catch (IOException ex) {
			      throw new ErrorException(ex);
			   }
		}
		
		private void readFlightEntry(String line)
		{ 
			int arrow = line.indexOf("->");
			if (arrow == -1) 
			{
				throw new ErrorException("Illegal flight entry " + line); 
			}
			String comingFrom = line.substring(0, arrow).trim();
			String goingTo = line.substring(arrow + 2).trim(); 
			defineCity(comingFrom);
			defineCity(goingTo); 
			getDestinations(comingFrom).add(goingTo);
		}
		private void defineCity(String cityName) 
		{ 
			if (!cities.contains(cityName))
			{
			cities.add(cityName);
			flights.put(cityName, new ArrayList<String>());
			}
		}
		private ArrayList<String> getDestinations(String comingFrom) 
		{ 
			return flights.get(comingFrom);
		}
		private void printCityList(ArrayList<String> cityList)
		{ 
			for(int i = 0; i < cityList.size(); i++)
			{
			String city = cityList.get(i);
			      println(" " + city);
			   }
			}

		private String getNextCity(String city) 
		{
			ArrayList<String> destinations = getDestinations(city); 
			String nextCity = null;
			while (true) 
			{
			println("From " + city + " you can fly directly to:"); 
			printCityList(destinations);
			String prompt = "Where do you want to go from " + city + "? "; nextCity = readLine(prompt);
			if (destinations.contains(nextCity)) break;
			println("You can't get to that city by a direct flight.");
			}
			      return nextCity;
			  }
		private void printTrip(ArrayList<String> trip)
		{ 
			println("The route you've chosen is: ");
			for (int i = 0; i < trip.size(); i++) 
			{
				if (i > 0) print(" -> ");
				print(trip.get(i)); 
			}
			println(); 
		}
		private HashMap<String,ArrayList<String>> flights; 
		private ArrayList<String> cities;
		
		
			}