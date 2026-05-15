import java.util.*;
class RemoveDuplicatesBrute{
  int RemoveDuplicates(int[] arr){
    Set<Integer> set = new LinkedHashSet();
    for(int i : arr)
      set.add(i);
    int index=0;
    for(int i : set){
      arr[index] = i;
      index++;
    }
    return index;
  }
}