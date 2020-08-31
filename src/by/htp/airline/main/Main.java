package by.htp.airline.main;

import java.util.List;

import by.htp.airline.entity.Airline;
import by.htp.airline.entity.AirlineList;
import by.htp.airline.logic.Logic;
import by.htp.airline.print.Print;

/*
 * String destination, int number, String typePlane, String time, String day
 */
public class Main {

	public static void main(String[] args) {
		Airline airline1 = new Airline("Minsk", 1, "Airbus", 10, 23, "Monday");
		Airline airline2 = new Airline("Vitebsk", 2, "An-2", 11, 30, "Sunday");
		Airline airline3 = new Airline("Minsk", 3, "Cy-100", 10, 23, "Friday");
		Airline airline4 = new Airline("Grodno", 4, "Airbus", 15, 23, "Sunday");

		AirlineList list = new AirlineList();
		list.add(airline1);
		list.add(airline2);
		list.add(airline3);
		list.add(airline4);

		Logic logic = new Logic();
		List<Airline> list1 = logic.flight_destination(list, "Minsk");
		List<Airline> list2 = logic.flight_day(list, "Monday");
		List<Airline> list3 = logic.flight_day_time(list, "Sunday", 11);

		Print print = new Print();
		print.print(list1);
		print.print(list2);
		print.print(list3);

	}

}
