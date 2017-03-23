
import java.io.File;


public class masterWriter extends AssistantClass implements Runnable {
	
	
	
	public void run(){
		
		masterWriting();
		
	}
	
	public void masterWriting() {
		
		//AssistantClass finalWrite = new AssistantClass();
		masterWriter finalWrite = new masterWriter();
		finalWrite.dir = "C:\\Users\\Acer\\Desktop\\result"; // location
		finalWrite.folder = new File(dir);
		finalWrite.listOfFiles = folder.listFiles();
		
		System.out.println(listOfFiles[0]   + " master thread " + listOfFiles[1] + " " + listOfFiles.length);
		
		
		finalWrite.readerWriter("C:\\Users\\Acer\\Desktop\\I am master.txt",0,finalWrite.listOfFiles.length);
		
	}

}
