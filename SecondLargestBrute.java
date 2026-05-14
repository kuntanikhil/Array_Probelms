import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	
	static int[] Largest(int[] arr){
	    Arrays.sort(arr);
	    int L1 = arr[arr.length-1];
	    for(int i=arr.length-2;i>=0;i--){
	        if(arr[i] == L1)
	            continue;
	        else{
	            return  new int[] { arr[i] , L1};
	        }
	    }
	    return new int[] {0,0};
	}
}
