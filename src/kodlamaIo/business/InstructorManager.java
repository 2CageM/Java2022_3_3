package kodlamaIo.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.IInstructorDao;
import kodlamaIo.entities.Instructor;

public class InstructorManager {
	
	private IInstructorDao instructorDao;
	
	private List<Logger> loggers;
	
	private List<String> instructors = new ArrayList();
	
	public InstructorManager(IInstructorDao instructorDao, List<Logger> loggers) {
		
		this.instructorDao=instructorDao;
		this.loggers=loggers;
				
	}
	

	 public void add(Instructor instructor) throws Exception {
		 
		 for(String instructorMain : instructors) {
			 
			 if(instructor.getInstructorName()==(" ")) {
				 
				 throw new Exception("Eğitmen adı boş olamaz");
			 }
		 }
		 
		 instructors.add(instructor.getInstructorName());
		 
		 System.out.println("Eğitmen Kaydedildi : " + instructor.getInstructorName());
		 instructorDao.add(instructor);
		 
	 }
}
