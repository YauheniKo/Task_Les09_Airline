package by.htp.airline.print;

import java.util.List;

import by.htp.airline.entity.Airline;


//String destination, int number, String typePlane, int timeHour, int timeMinuts, String day

public class Print {

	public void print(List<Airline> list) {

		for (int i = 0; i < list.size(); i++) {
			Airline a = list.get(i);
			System.out.println(a.getDestination() + " " + a.getNumber() + " " + a.getTypePlane() + " " + a.getTimeHour()
					+ ":" + a.getTimeMinuts() + " " + a.getDay());
		}
		System.out.println();
	}

}
