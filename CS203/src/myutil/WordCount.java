package myutil;

public class WordCount {
	private int counter=0;
	private String sentence;
	
	
	public WordCount(String sentence){
		this.sentence= sentence;
	}
	
       public int  wordCounter() {
    	   
    	   char ch[]= new char[sentence.length()];     
           for(int i=0;i<sentence.length();i++)  
           {  
               ch[i]= sentence.charAt(i);  
               if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                   counter++;  
           }  
           return counter;  
       }  
    	  
    	   
    	   
       

	public int getCount() {
		if(counter >0) {
			return counter;
			}
		return 0;
	
	}


	public void setCount() {
		counter = 0;
		}
		
	public void incrementCounter() {
		counter= counter+1;
		
	
		}
	public void decrementCounter() {
		
		if(sentence.startsWith("a")||sentence.startsWith("A")) {
			counter=counter-1;
			}
			System.out.println(counter);
		
	}
	
public void coounterDisplay() {
	System.out.println(counter);
}

}
	 
	
	
		
	


