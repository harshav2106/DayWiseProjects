package collections;

import java.util.Comparator;

public class SortByEmpName implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getEmpName().compareTo(e2.getEmpName());
	}

}
