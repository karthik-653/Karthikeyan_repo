package exceptiondemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class EmployeeDaoImp1 implements EmployeeDao {

	@Override
	public void EmployeeData(Employee emp) throws DataAccessException {
		// TODO Auto-generated method stub
		try {
			FileOutputStream f = new FileOutputStream("c://users//new");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new DataAccessException("error! Try again", e);
			//e.printStackTrace();
		}
		
		
		
	}

}
