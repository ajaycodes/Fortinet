package fortinet;

public class MultiDimensionArray {
	// This is a provided function, Assume it works
    public static Long getValue(int... indexOfDimension) {
        //... 
        return value;
    }
    // lengthOfDeminsion: each dimension's length, assume it is valid: lengthOfDeminsion[i]>0.
    public static Long sum(MultiDimensionArray mArray, int[] lengthOfDeminsion) { 
    	//to find number of dimension
    	int numberOfDimension = lengthOfDeminsion.length; 
    	// index value to be sent with getValue(int... ), all zeroes initially 
    	int[] index = new int[numberOfDimension];
    	int nextindex = numberOfDimension-2;    
    	//variable for sum
    	long sum = 0;
    	// first iteration without condition to handle 2D arrays
    	do
    	{
    		// for loop to start with lowest dimension, gets 001,002,003 value for a 3d array in first traversal
    	    for (index[numberOfDimension-1] = 0; index[numberOfDimension-1] < lengthOfDeminsion[numberOfDimension-1]; index[numberOfDimension-1]++)
    	    {
    	        sum += getValue(index);
    	    }
    	    // Incrementing the second last dimension value with respect to dimension traversed in the above for loop
    	    while (nextindex >= 0 && ++index[nextindex] == lengthOfDeminsion[nextindex])
    	    {
    	        index[nextindex--] = 0;  // changing the next index value and also making the index[nextindex] value 0 again before change
    	    }
    	    if (nextindex >= 0)
    	    	{
    	    		nextindex = numberOfDimension-2;
    	    	}
    	}
    	while (nextindex >= 0);
    	return sum;
       }

}
