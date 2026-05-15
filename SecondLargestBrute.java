import java.util.*;
import java.lang.*;
import java.io.*;

class SecondLargestBrute
{
	
	static int Largest(int[] arr){
	    Arrays.sort(arr);
	    int L1 = arr[arr.length-1];
	    for(int i=arr.length-2;i>=0;i--){
	        if(arr[i] == L1)
	            continue;
	        else{
	            return  arr[i];
	        }
	    }
	    return -1;
	}
}
