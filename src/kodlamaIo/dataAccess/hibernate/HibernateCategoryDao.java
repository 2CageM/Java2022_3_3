package kodlamaIo.dataAccess.hibernate;

import kodlamaIo.dataAccess.ICategoryDao;
import kodlamaIo.entities.Category;

public class HibernateCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		
		System.out.println("Hibernate ile veritabanına eklendi");
	}

	
	
}
