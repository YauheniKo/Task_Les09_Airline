package by.htp.airline.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.airline.entity.Airline;
import by.htp.airline.entity.AirlineList;

public class Logic {

	public List<Airline> flight_destination(AirlineList list, String destination) {
		List<Airline> res = new ArrayList<Airline>();

		List<Airline> air = list.getList();

		for (int i = 0; i < air.size(); i++) {
			Airline a = air.get(i);
			if (a.getDestination().equals(destination)) {
				res.add(a);
			}
		}

		return res;
	}

	public List<Airline> flight_day(AirlineList list, String day) {
		List<Airline> res = new ArrayList<Airline>();

		List<Airline> air = list.getList();

		for (int i = 0; i < air.size(); i++) {
			Airline a = air.get(i);
			if (a.getDay().equals(day)) {
				res.add(a);
			}
		}

		return res;
	}

	public List<Airline> flight_day_time(AirlineList list, String day, int hour) {
		List<Airline> res = new ArrayList<Airline>();

		List<Airline> air = list.getList();

		for (int i = 0; i < air.size(); i++) {
			Airline a = air.get(i);
			if (a.getDay().equals(day) & (double) (a.getTimeHour() + (double) (a.getTimeMinuts()) / 60) > hour) {
				res.add(a);
			}
		}

		return res;
	}

}
