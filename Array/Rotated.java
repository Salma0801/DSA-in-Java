import java.util.Scanner;

public class Rotated {
  static void rotate(int[] nums, int k) {
    int n=nums.length;
    k=k%n;
    if(k<0){
        k=k+n;
    } 
    //Divid two parts
    reverse(nums,0,n-k-1);//first part
    reverse(nums,n-k,n-1);//second part
    reverse(nums,0,n-1); //After that total part
  }
  //Using reverse function. TC= O(n) and SC =O(1)
  static void reverse(int[] nums, int start, int end){
      while(start<end){
          int temp=nums[start];
          nums[start]=nums[end];
          nums[end]=temp;
          start++;
          end--;
      }
  }
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of Array= ");
    int size=sc.nextInt();
    int [] arr=new int[size];
    System.out.print("\nEnter the elements ");
    for(int i=0;i<size;i++){
      arr[i]=sc.nextInt();
    }
    rotate(arr, 3);
    for(int i=0;i<size;i++){
      System.out.print(arr[i]+ " ");
    }
  }
}
