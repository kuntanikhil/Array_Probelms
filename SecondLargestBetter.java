class SecondLargestBetter{
  int belargest(int[] arr){
    int L1 = arr[0];
    for(int i=0;i<arr.length;i++){
      if(arr[i] > L1 ){
        L1 = arr[i];
      }
    }
    // Finding L2 using L1 
    int L2 = arr[0];
    for(int i = 0;i<arr.length;i++){
      if(arr[i] > L2 && arr[i] != L1){
        L2 = arr[i];
      }
    }
    return L2;
  }
}