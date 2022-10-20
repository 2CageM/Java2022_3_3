package kodlamaIo.dataAccess.jdbc;

import kodlamaIo.dataAccess.ICategoryDao;
import kodlamaIo.entities.Category;

public class JdbcCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile veritabanına eklendi");
		
	}

}
