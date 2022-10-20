package kodlamaIo;

import java.util.List;

import kodlamaIo.business.CategoryManager;
import kodlamaIo.business.CourseManager;
import kodlamaIo.business.InstructorManager;
import kodlamaIo.core.logging.DatabaseLogger;
import kodlamaIo.core.logging.EmailLogger;
import kodlamaIo.core.logging.FileLogger;
import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.hibernate.HibernateCourseDao;
import kodlamaIo.dataAccess.jdbc.JdbcCategoryDao;
import kodlamaIo.dataAccess.jdbc.JdbcInstructorDao;
import kodlamaIo.entities.Category;
import kodlamaIo.entities.Course;
import kodlamaIo.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		List<Logger> loggers = List.of(new FileLogger(), new EmailLogger(), new DatabaseLogger());

		Category category1 = new Category(1, "Bilişim");
		Category category2 = new Category(2, "Programlama");
		Category category3 = new Category(3, "Yapay Zeka");

		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);

		categoryManager.add(category1);
		categoryManager.add(category2);
		categoryManager.add(category3);

		Course course1 = new Course(1, "Phyton", 5);
		Course course2 = new Course(1, "C#", 33);
		Course course3 = new Course(1, "Cplusplus", 120);

		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);

		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);

		Instructor instructor1 = new Instructor(1, "Celal Şengör");
		Instructor instructor2 = new Instructor(2, "Celal Şengör");
		Instructor instructor3 = new Instructor(3, "İlber Ortaylı");

		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);

		instructorManager.add(instructor1);
		instructorManager.add(instructor2);
		instructorManager.add(instructor3);

	}

}
