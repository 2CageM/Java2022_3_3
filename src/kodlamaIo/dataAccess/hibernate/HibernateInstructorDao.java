package kodlamaIo.dataAccess.hibernate;

import kodlamaIo.dataAccess.IInstructorDao;
import kodlamaIo.entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao{

	@Override
	public void add(Instructor instructor) {
		
		System.out.println("Hibernate ile veritabanına eklendi");
		
	}

}
