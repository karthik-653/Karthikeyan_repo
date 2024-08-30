package exceptiondemo;

import java.io.FileNotFoundException;

public interface EmployeeDao {
	
	public abstract void EmployeeData(Employee employee) throws DataAccessException;

}
