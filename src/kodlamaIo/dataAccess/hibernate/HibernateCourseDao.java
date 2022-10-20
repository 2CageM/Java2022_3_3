package kodlamaIo.dataAccess.hibernate;

import kodlamaIo.dataAccess.ICourseDao;
import kodlamaIo.entities.Course;

public class HibernateCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		
		System.out.println("Hibernate ile veritabanına eklendi");
	}

}
