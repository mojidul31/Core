package com.core.test;

public class PassingCars {

	public static void main(String[] args) {
		int[] A = {0,1,0,1,1};
		System.out.println(solution(A));

	}
	
	public static int solution(int[] A) {
		int countOfZeros=0, count=0;
		for(int i=0;i<A.length; i++) {
			if(A[i]==0) countOfZeros++;
			if(A[i]==1) count+=countOfZeros;
			if(count > 1000000000) return -1;
		}
		return count;
	}

}
