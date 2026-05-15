class SecondLargestOptimal{
  
  int Secondlargest(int[] arr){
    int l1 = arr[0];
    int l2 = Integer.MIN_VALUE;
    for(int i=1;i<arr.length;i++){
      if(arr[i] > l1){
        l2 = l1;
        l1 = arr[i];
      }else if(arr[i] < l1 && arr[i] > l2){
        l2 = arr[i];
      }
    }
    return l2;
  }
  int SecondSmallest(int[] arr){
    int s1 = arr[0];
    int s2 = Integer.MAX_VALUE;
    for(int i=1;i< arr.length;i++){
      if(arr[i] < s1){
        s2 = s1;
        s1 = arr[i];
      }else if(arr[i] != s1 && arr[i] < s2){
        s2 = arr[i];
      }
    }
    return s2;
  }
}