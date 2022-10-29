package com.core.test;

public class MissingArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,3,7};
		
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		int n = A.length +1;
		long sEx = n * (n+1)/2;
		long sSu = sumOfArray(A);
		return (int) (sEx - sSu);
	}
	
	private static long sumOfArray(int[] A) {
		long sum = 0L;
		for(int i : A) {
			sum += i;
		}
		return sum;
	}

}
