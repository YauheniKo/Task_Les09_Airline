package by.htp.airline.entity;

import java.util.ArrayList;
import java.util.List;

public class AirlineList {

	private List<Airline> list;

	public AirlineList() {
		list = new ArrayList<Airline>();
	}

	public void add(Airline airline) {
		list.add(airline);
	}

	public List<Airline> getList() {
		return list;
	}

	public void setList(List<Airline> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "AirlineList [list=" + list + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
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
		AirlineList other = (AirlineList) obj;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		return true;
	}

}
