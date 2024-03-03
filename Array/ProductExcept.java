import java.util.Arrays;
import java.util.Scanner;

public class ProductExcept {
  static int []productExceptSelf(int []nums){
    int n=nums.length;
    int []right=new int[n];
    int prod=1;
     //suffix product array. TC= O(n) and PC= O(n).
    for(int i=n-1;i>=0;i--){
      prod*=nums[i];
      right[i]=prod;
    }
    //Make answare with maintaining of prefix product.
    int []ans=new int[n];
    prod=1;
    for(int i=0;i<n-1;i++){
      int lp=prod;
      ans[i]=lp*right[i+1];
      prod*=nums[i];
      
    }
    ans[n-1]=prod;
    return ans;
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
   int []res=productExceptSelf(arr);
   for(int i=0;i<arr.length;i++){
    System.out.print(res[i]+ " ");
   }
   
  }
}
