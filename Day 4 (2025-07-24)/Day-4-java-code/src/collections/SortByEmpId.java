package collections;

import java.util.Comparator;

public class SortByEmpId implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return Integer.compare(e1.getEmpId(), e2.getEmpId());
	}

}
