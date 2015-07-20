import java.lang.reflect.Array;

/* Linear Search Algorithm */
public class LinearSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		int[] arrayNum = {1,4,6,9,10,11}; // Declared a array in variable
		int i, target; // Declaring target and loop variable.
		target = 11; // Fixing target value to find
		for(i = 0; i < arrayNum.length; ++i){ // Loop start
		    if (arrayNum[i] == target) {
		    	System.out.print("The position of "+target+" is at "+ (i+1));
		    	}
		    else {
		    	System.out.print("Unable to find the target value");
		    }
		  }//Loop Ends
		  
		

	}

}
