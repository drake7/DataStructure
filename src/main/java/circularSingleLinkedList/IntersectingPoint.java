package circularSingleLinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class IntersectingPoint {

	   static long mod = 1000000007;
	    static int MAXN = 1001;
	    static long factorial[] = new long[MAXN],
	                inverse[] = new long[MAXN];
	 
	    // Function to find (a^b)%mod in log b
	    static long power(long a, long b)
	    {
	        long res = 1;
	 
	        // Till power becomes 0
	        while (b > 0) {
	 
	            // If power is odd
	            if (b % 2 == 1) {
	                res = (res * a) % mod;
	            }
	 
	            // Multiply base
	            a = (a * a) % mod;
	 
	            // Divide power by 1
	            b >>= 1;
	        }
	        return res;
	    }
	 
	    // Function to find nCk
	    static long nCk(int n, int k)
	    {
	 
	        // Base case
	        if (k < 0 || k > n) {
	            return 0;
	        }
	 
	        // Apply formula to find nCk
	        long ans = factorial[n];
	        ans = (ans * inverse[n - k]) % mod;
	        ans = (ans * inverse[k]) % mod;
	 
	        return ans;
	    }
	 
	    // Function to find the number of ways
	    static void numberOfWays(ArrayList<int[]> lines, int K,
	                             int N)
	    {
	 
	        // sort the given lines
	        Collections.sort(lines, (a, b) -> a[0] - b[0]);
	 
	        // Find the number of total case
	        long total_case = nCk(N, K);
	 
	        // Declare a multiset
	        PriorityQueue<Integer> m = new PriorityQueue<>();
	 
	        // Loop till N
	        for (int i = 0; i < N; i++) {
	 
	            // Check if smallest element is
	            // smaller than lines[i]
	            while (!m.isEmpty()
	                   && (m.peek() < lines.get(i)[0])) {
	 
	                // Erase first element
	                m.poll();
	            }
	 
	            // Exclude the odd cases
	            total_case -= nCk(m.size(), K - 1);
	 
	            // Modulus operation
	            total_case += mod;
	            total_case %= mod;
	 
	            // Insert into multiset
	            m.add(lines.get(i)[1]);
	        }
	        System.out.println(total_case);
	    }
	 
	    // Function to precompute
	    // factorial and inverse
	    static void preCompute()
	    {
	        long fact = 1;
	 
	        factorial[0] = 1;
	        inverse[0] = 1;
	 
	        // Pre-compute factorial and inverse
	        for (int i = 1; i < MAXN; i++) {
	            fact = (fact * i) % mod;
	            factorial[i] = fact;
	 
	            inverse[i] = power(factorial[i], mod - 2);
	        }
	    }
	 
	    // Driver code
	    public static void main(String[] args)
	    {
	        int N = 5, K = 2;
	        ArrayList<int[]> lines = new ArrayList<>();
	 
	        // Function to pre-compute
	        // factorial and inverse
	        preCompute();
	 
	        lines.add(new int[] { 1, 3 });
	        lines.add(new int[] { 4, 5 });
	        lines.add(new int[] { 5, 7 });
	        lines.add(new int[] { 7, 9 });
	        lines.add(new int[] { 10, 11 });
	   	 
	        numberOfWays(lines, K, N);
	    }
}
