package lab7;

public class lab7 {
	public static <M> void printRevArray( M[] inputArray) {
		// Display array elements
		for(int i=inputArray.length -1; i>= 0; i--) {
			System.out.print(inputArray[i]+" ");
			} 
		System.out.println();
		}
	
	public static void main(String args[]) {
		Integer [] intArray = {1,2,3,4,5,6,7};
		Double[] doubleArray = {2.2,4.4,6.6,8.8};
		Character[] charArray = {'R','A','M','E','E','Z'};
		
		System.out.println("Reverse Integer Array contains:");
		printRevArray(intArray);
		System.out.println("\nReverse doubleArray contains:");
		printRevArray (doubleArray);
		System.out.println("\nReverse characterArray contains");
		printRevArray (charArray);
		}
}
