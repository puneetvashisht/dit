import org.junit.Test;

import com.ibm.entities.Employee;
import com.ibm.repos.EmployeeRepository;



public class TestEmployeeRepository {

//	@Test
	public void testEmployeeAdd() {
		Employee emp = new Employee("Priya", 444444.33);
		EmployeeRepository repo = new EmployeeRepository();
		repo.addEmployee(emp);
	}
	
	@Test
	public void testEmployeeFind() {
		
		EmployeeRepository repo = new EmployeeRepository();
		Employee emp = repo.findEmployee(3);
		System.out.println(emp);
	}

}
