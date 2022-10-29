package com.core.test;

import java.util.Arrays;

public class MaxCounters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {3,4,4,6,1,4,4};
		int[] res = solution(5,A);
		System.out.println(Arrays.toString(res));
	}
	
	public static int[] solution(int N, int[] A) {

        final int count = N + 1;
        int currMax = 0;
        int lUpdate = 0;
        int countsArr[] = new int[N];

        for (int i = 0; i < A.length; i++) {
            int currVal = A[i];
            if (currVal == count) {
                lUpdate = currMax;
            } else {
                int pos = currVal - 1;
                if (countsArr[pos] < lUpdate)
                    countsArr[pos] = lUpdate + 1;
                else
                    countsArr[pos]++;

                if (countsArr[pos] > currMax) {
                    currMax = countsArr[pos];
                }
            }

        }

        for (int i = 0; i < N; i++) {
           if (countsArr[i] < lUpdate)
               countsArr[i] = lUpdate;
        }

        return countsArr;
    }

}
