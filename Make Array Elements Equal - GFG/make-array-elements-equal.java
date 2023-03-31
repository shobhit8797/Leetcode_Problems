//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int N = Integer.parseInt(br.readLine().trim());

            Solution ob = new Solution();
            System.out.println(ob.minOperations(N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java
// n = 6
// arr = 1 3 5 7 9 11
// i=5 | 6 3 5 7 8 7


class Solution {
    public long minOperations(int N) {
        if(N%2==0)
            return (long)(N/2)*(N/2);
        return (long)(N/2)*(N/2 + 1);
    }
}