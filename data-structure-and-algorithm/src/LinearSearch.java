/* Linear Search Algorithm */
public class LinearSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		int[] arrayNum = {1,14,6,9,10,11}; // Declared a array in variable
		int i, target, position = -1; // Declaring target, position and loop variable.
		target = 1; // Fixing target value to find
		for(i = 0; i < arrayNum.length; ++i){ // Loop start
		    if (arrayNum[i] == target) {
		    	position = i+1;
		    	break;
		    	} 
		    
		  }//Loop Ends
		
		if(position == -1){
			System.out.print("Target value "+target+" was not found");
		}else {
	    	System.out.print("Target value "+target+" was found at position: "+position);
	    }
		  
		

	}

}
