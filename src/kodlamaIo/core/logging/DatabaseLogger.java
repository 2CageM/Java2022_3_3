package kodlamaIo.core.logging;

public class DatabaseLogger implements Logger{

	@Override
	public void log() {
		
		System.out.println("Veritabanına Loglandı");
	}

}
