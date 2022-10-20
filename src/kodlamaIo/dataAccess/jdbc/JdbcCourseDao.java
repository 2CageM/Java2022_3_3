package kodlamaIo.dataAccess.jdbc;

import kodlamaIo.dataAccess.ICourseDao;
import kodlamaIo.entities.Course;

public class JdbcCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile veritabanına eklendi");
		
	}

}
