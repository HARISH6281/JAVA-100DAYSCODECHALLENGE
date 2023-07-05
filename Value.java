import java.util.*;
public class Value
{
	public static void main(String[] args) {
	    int[] arr={11,3,5};
	    int n=3;
	    ArrayList<Integer> ar =new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if((i+1)==arr[i]){
                ar.add(i+1);
            }else{
                continue;
            }
        }
        System.out.println(ar); 
    
}
	
}
