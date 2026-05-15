import java.util.*;
class LeftRotateByD{
  void LeftByD(int[] arr,int d){
    d = d % (arr.length);
    List<Integer> list = new ArrayList<>();
    for(int i=0;i<d;i++){
      list.add(arr[i]);
    }
    System.out.println(list);
    for(int j=d;j<arr.length;j++){
      arr[j-d] = arr[j];
    }
    int index=0;
    for(int i=arr.length-d;i<arr.length;i++){
      arr[i] = list.get(index);
      index++;
    }
    System.out.println(Arrays.toString(arr));
  }
}