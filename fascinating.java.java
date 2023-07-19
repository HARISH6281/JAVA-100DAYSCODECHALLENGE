// Given a number N. Your task is to check whether it is fascinating or not.
// Fascinating Number: When a number(should contain 3 digits or more) is multiplied by 2 and 3, and when both these products are concatenated with the original number, then it results in all digits from 1 to 9 present exactly once.

// Example 1:

// Input: 
// N = 192
// Output: Fascinating
// Explanation: After multiplication with 2
// and 3, and concatenating with original
// number, number will become 192384576 
// which contains all digits from 1 to 9.

//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Solution ob = new Solution();

        int T = sc.nextInt();

        while (T != 0) {
            long n = sc.nextLong();
            if (ob.fascinating(n))
                System.out.println("Fascinating");
            else
                System.out.println("Not Fascinating");
            T--;
        }
    }
}
// } Driver Code Ends


class Solution {
    boolean fascinating(long n) {
        // code here
        String a = String.valueOf(n*2);
		String b = String.valueOf(n*3);
		String str1 = n+a+b;
		char ch[] = str1.toCharArray();
		int[] ar = new int[str1.length()];
		int j=0;
		for(char c:ch){
		   int d = Integer.parseInt(String.valueOf(c));
		   ar[j]=d;
		   j++;
		}
		Arrays.sort(ar);
		int[] br = {1,2,3,4,5,6,7,8,9};
		if(Arrays.equals(ar,br)){
		    return true;
		}else{
		    return false;
		}
        
    }
}