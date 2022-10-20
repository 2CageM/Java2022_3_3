package kodlamaIo.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.ICourseDao;
import kodlamaIo.entities.Course;

public class CourseManager {
	
	
	private ICourseDao courseDao;
	private List<Logger> loggers;
	
	public List<String> courses = new ArrayList();
	
	public CourseManager(ICourseDao courseDao, List<Logger> loggers) {
		
		this.courseDao=courseDao;
		this.loggers=loggers;
	}
	
	public void add(Course course) throws Exception {
		
		for(String courseMain : courses) {
			
			if(course.getCourseName().equals(courseMain)) {
				
				throw new Exception("Kurs adı zaten mevcut");
			}
		}
		
		if(course.getCoursePrice()<0) {
			
			throw new Exception("Kurs fiyatı 0 dan küçük olamaz");
		}
		
		courses.add(course.getCourseName());
		
		System.out.println("Kurs kaydedildi : " + course.getCourseName());
		
		courseDao.add(course);
		
		for(Logger logger : loggers ) {
			
			logger.log();
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
