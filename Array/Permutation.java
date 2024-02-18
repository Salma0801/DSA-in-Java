//Build Array from permutation
import java.util.Scanner;
public class Permutation {

  //Print Array
  static void printArray(int [] ans){
    for(int i=0;i<ans.length;i++){
      System.out.print(ans[i]+ " ");
    }
    System.out.println();
  }
//1st approche: Bruteforce solution TC=O(n) and SC=O(n).
// static int [] basicPermutation (int [] num){
//   int []ans=new int[num.length];
//   for(int i=0;i<num.length;i++){
//     ans[i]=num[num[i]];
   
//   }
//   return ans;
// }


// 2nd approche: Optimal solution TC=O(n) or SC=O(1).
    static int[] PermutationArray(int []arr){
      int n=arr.length;
      for(int i=0;i<n;i++){
        arr[i]+= n*(arr[arr[i]]%n);
      }
      for(int i=0;i<n;i++){
      arr[i]/=n;
      }
      return arr;
    }
    public static void main(String[] args) {
        System.out.print("Enter the Array size: ");
        Scanner kb= new Scanner(System.in);
        int size=kb.nextInt();
         int [] arr= new int[size];
         System.out.println("Enter the number the Elements = ");
         for(int i=0;i<size;i++){
            arr[i]=kb.nextInt();
         }
        //  int []ans=PermutationArray(arr);
        //  printArray(ans);
        
        int []ans=basicPermutation(arr);
        printArray(ans);
      }


    
}
