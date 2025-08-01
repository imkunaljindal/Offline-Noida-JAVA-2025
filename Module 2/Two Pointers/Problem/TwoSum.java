package Problem;

import java.util.*;
import java.lang.*;
import java.io.*;

class TwoSum {

    public static int[] twoSum(int[] A, int target) {
        int n = A.length;
        int s = 0;
        int e = n-1;

        while(s<e) {
            int currSum = A[s] + A[e];
            if(currSum < target) s++;
            else if(currSum > target) e--;
            else return new int[] {A[s],A[e]};
        }

        return new int[]{-1,-1};
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        int[] arr = new int[(int)n];
        for(int i=0; i<n; i++)arr[i]=Integer.parseInt(inputLine[i]);
        int m = Integer.parseInt(br.readLine().trim());
        int[] ans = (twoSum(arr, m));
        System.out.println(ans[0] + " " + ans[1]);
    }
}



