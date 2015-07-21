/* Binary Search Algorithm */
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		int[] arrayNum = {1,2,4,6,10,11}; // Declared a array in variable. Binary Search works only if it is sorted in ascending order.
		int searchTerm = 11, returnValue;
		
		returnValue = search(arrayNum, searchTerm);
		if(returnValue==-1){
			System.out.println("Search Value "+searchTerm+" was not found!");
		}
		else {
			System.out.println("Search Value "+searchTerm+" was found at position number: "+(returnValue+1));
		}
		

		

	}

	public static int search(int[] arrayNum, int searchTerm){
		int start = 0;
        int end = arrayNum.length - 1;
        int middle;
        while (start <= end) {
            middle = Math.round((start + end) / 2);
            if (arrayNum[middle] == searchTerm) {
                return middle;
            } else if (arrayNum[middle] < searchTerm) {
                start = middle + 1;
            } else if (arrayNum[middle] > searchTerm) {
                end = middle - 1;
            }
        }
        return -1;
	}

}
