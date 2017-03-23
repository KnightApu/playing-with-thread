



public class ThreadManager  {
	
	
	
	public void startThreads(){
		
		
		
		
		
		
		Runnable firstHalfMerger = new FirstHalfMerger();
		Thread firstHalfWriter = new Thread(firstHalfMerger);
		
	
	
		
		
		
		Runnable secondHalfMerger = new SecondHalfMerger();
		Thread secondHalfWriter = new Thread(secondHalfMerger);
		
		Runnable masterThread = new masterWriter();
		Thread masterWriter = new Thread(masterThread);
		
		firstHalfWriter.setName("First Thread");
		secondHalfWriter.setName("Second Thread");
		masterWriter.setName("Master Thread");
		
		
		firstHalfWriter.start(); 
		
		
		
		try {
			
			firstHalfWriter.join();
			
			
		} catch (InterruptedException e) {
			
			
			e.printStackTrace();
			
		}
		
		secondHalfWriter.start();
		
		try {
			
			secondHalfWriter.join();
		} catch (InterruptedException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		masterWriter.start();
		
		
		
	}
	
	

}
