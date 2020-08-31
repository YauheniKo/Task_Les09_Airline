package by.htp.airline.entity;

//пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
public class Airline {
	private String destination;
	private int number;
	private String typePlane;
	private int timeHour;
	private int timeMinuts;
	private String day;
	
	public Airline(String destination, int number, String typePlane, int timeHour, int timeMinuts, String day) {
		super();
		this.destination = destination;
		this.number = number;
		this.typePlane = typePlane;
		this.timeHour = timeHour;
		this.timeMinuts = timeMinuts;
		this.day = day;
	}
	
	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTypePlane() {
		return typePlane;
	}

	public void setTypePlane(String typePlane) {
		this.typePlane = typePlane;
	}

	public int getTimeHour() {
		return timeHour;
	}

	public void setTimeHour(int timeHour) {
		this.timeHour = timeHour;
	}

	public int getTimeMinuts() {
		return timeMinuts;
	}

	public void setTimeMinuts(int timeMinuts) {
		this.timeMinuts = timeMinuts;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", number=" + number + ", typePlane=" + typePlane + ", timeHour="
				+ timeHour + ", timeMinuts=" + timeMinuts + ", day=" + day + "]";
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + number;
		result = prime * result + timeHour;
		result = prime * result + timeMinuts;
		result = prime * result + ((typePlane == null) ? 0 : typePlane.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (number != other.number)
			return false;
		if (timeHour != other.timeHour)
			return false;
		if (timeMinuts != other.timeMinuts)
			return false;
		if (typePlane == null) {
			if (other.typePlane != null)
				return false;
		} else if (!typePlane.equals(other.typePlane))
			return false;
		return true;
	}
	
	

}
