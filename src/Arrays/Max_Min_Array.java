package Arrays;

// Write a Java program to find the maximum and minimum value of an array.

public class Max_Min_Array {

	public static void main(String[] args) {

        double[] decimals = {3.4, 2.8, 90.3, 178.6, 1.4, 204.5};
        
        double max = Double.MIN_VALUE; //0
        double min = Double.MAX_VALUE;
        
        for(int d = 0; d < decimals.length; d++) {
            
        	if(decimals[d] > max) {
                max = decimals[d]; //up-grading
            }
            
        	if(decimals[d] < min) {
                min = decimals[d]; //down-grading
            }
        }
        System.out.println("The Maximum in array decimals is " + max);
        System.out.println("The Minimum in array decimals is " + min);
	}
}
