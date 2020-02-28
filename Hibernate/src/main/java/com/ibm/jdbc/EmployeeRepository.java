package com.ibm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ibm.entities.Employee;

public class EmployeeRepository {

	public static void main(String[] args) {
		try {
//			1. Load releveant driver implementation class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. User DriverManager to get connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/appdb", "root", "rootroot");
//			3. Create & Fire sql statements
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Employee");
			
			List<Employee> employees = new ArrayList<>();
//			4. Fetch result using result set
			while (rs.next()){
//				System.out.println(rs.getInt(1) + "  " + rs.getString(3) + "  " + rs.getDouble(4));
				Employee emp = new Employee(rs.getInt(1), rs.getString(3), rs.getDouble(4) );
				employees.add(emp);
			}
				
			System.out.println(employees);
			
//			5. Close connection
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
