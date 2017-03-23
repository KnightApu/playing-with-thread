


public class SecondHalfMerger extends AssistantClass implements Runnable{
	
	public void run() {
		writingSecondHalf();
	}
	
	public void writingSecondHalf() {
		
		SecondHalfMerger writer = new SecondHalfMerger();
		writer.readerWriter("C:\\Users\\Acer\\Desktop\\result\\master2.txt",(listOfFiles.length)/2,listOfFiles.length);
		
		
		
	}

}
