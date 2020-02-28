import org.junit.Test;

import com.ibm.entities.Employee;
import com.ibm.repos.EmployeeRepository;



public class TestEmployeeRepository {
	EmployeeRepository repo = new EmployeeRepository();
	

//	@Test
	public void testEmployeeAdd() {
		Employee emp = new Employee("Priya", 444444.33);
		
		repo.addEmployee(emp);
	}
	
//	@Test
	public void testEmployeeFind() {
		
//		EmployeeRepository repo = new EmployeeRepository();
		Employee emp = repo.findEmployee(3);
		System.out.println(emp);
	}
	
//	@Test
	public void testEmployeeRemove() {
		
//		EmployeeRepository repo = new EmployeeRepository();
		repo.removeEmployee(3);

	}
//	@Test
	public void testEmployeeUpdate() {
		Employee emp = new Employee(1,"Ravi", 444444.33);
		
		repo.updateEmployee(emp);
	}
	
	@Test
	public void testEmployeeFindAll() {
		
		
		System.out.println(repo.fetchAllEmployees("Ravi"));
	}

}
