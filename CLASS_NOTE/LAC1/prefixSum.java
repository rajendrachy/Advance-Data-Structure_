package LAC1;
import java.util.*;

public class prefixSum
{
    
    public static boolean continuousSubArr(int[] arr, int k, int n) {
        HashSet<Integer> cont = new HashSet<>();
        int ps = 0;
         
         for(int i=0; i<n; i++) {
             ps += arr[i];
             if(ps == k) {
                 return true;
             }
             
             if(cont.contains(ps - k)) {
                 return true;
             }
             cont.add(ps);
         }

         return false;
    }
 

	
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		int[] arr = new int[n];
		
		System.out.println("Enter array: ");
		for(int i=0; i<n; i++) {
		    arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter k: ");
		int k = sc.nextInt();
		sc.nextLine();
		
		
		boolean res = continuousSubArr(arr, k, n);
		System.out.println(res);
		
	}
}









