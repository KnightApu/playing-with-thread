

public class FirstHalfMerger extends AssistantClass implements Runnable{
	
	
	String path;
	int firstFileToScan;
	int lastFileToScan;
	
	
	public void run(){
			
		setStates("C:\\Users\\Acer\\Desktop\\result\\master1.txt", 0, (listOfFiles.length)/2);	
		writingFirstHalf();
			
		}
	
	
	
	public void setStates(String path, int firstFileToScan, int lastFiletoScan) {
		
		this.path = path;
		this.firstFileToScan = 0;
		this.lastFileToScan = (listOfFiles.length)/2;
		
	}
	
	
	public void writingFirstHalf(){
		
				FirstHalfMerger writer = new FirstHalfMerger();
				writer.readerWriter(path,firstFileToScan,lastFileToScan);
				
			

	}
	
	

}
