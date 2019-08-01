package java8sample;

import java.util.HashMap;
import java.util.Map;

public class ObjectCompair {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(1);

		Map<Employee, String> map = new HashMap<Employee, String>();
		map.put(emp1, "vikash");
		map.put(emp2, "vikash");
		System.out.println(map.size());

		Integer int1 = new Integer(1);
		Integer int2 = new Integer(1);
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(int1, "One");
		map1.put(int2, "One");
		System.out.println(map1.size());
	}

}

class Employee {
	int id;

	public Employee(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
}