package kodlamaIo.dataAccess.jdbc;

import kodlamaIo.dataAccess.IInstructorDao;
import kodlamaIo.entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao{

	@Override
	public void add(Instructor instructor) {
		
		System.out.println("Jdbc ile veritabanına eklendi");
		
	}

}
