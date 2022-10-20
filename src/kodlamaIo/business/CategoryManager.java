package kodlamaIo.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.ICategoryDao;
import kodlamaIo.entities.Category;

public class CategoryManager {
	
	private ICategoryDao categoryDao;
	public List<String> categories = new ArrayList();
	private List<Logger> loggers;
	
	
	public CategoryManager(ICategoryDao categoryDao,List<Logger> loggers) {
		
		this.categoryDao=categoryDao;
		this.loggers=loggers;
		
	}
	
	
	
	public void add(Category category) throws Exception {
		
		for(String categoryMain : categories) {
			
			if(category.getCategoryName().equals(categoryMain)) {
				
				throw new Exception("bu kategori adı zaten kullanımda");
			}
		}
		
		categories.add(category.getCategoryName());
		
		System.out.println("Kategori kaydedildi : " +category.getCategoryName());
		categoryDao.add(category);
		
		for(Logger logger : loggers ) {
			
			logger.log();
		}
		
		
		
	}

}
