import java.util.*;
class Main{
  public static void main(String[] args){
    
    int[] arr ={5,9,2,4,8,1};
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no.of times to rotate the array: ");
    int d = sc.nextInt();
    d= d % (arr.length);
    LeftByDoptimal obj = new  LeftByDoptimal();
    
    obj.reverse(arr,0,arr.length-d-1);
    obj.reverse(arr,arr.length-d,arr.length-1);
    obj.reverse(arr,0,arr.length-1);
    
    System.out.println(Arrays.toString(arr));
    
    
  }
}