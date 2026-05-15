class CheckIfSorted{
  void CheckSorted(int[] arr){
    boolean isSorted = true;
    for(int i=1;i<arr.length;i++){
      if(!(arr[i] >= arr[i-1])){
        System.out.println("Array is not Sorted");
        isSorted = false;
        break;
      }
    }
    if(isSorted)
      System.out.println("Array is Sorted");
  }
}