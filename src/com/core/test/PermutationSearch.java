package com.core.test;

import java.util.*;
public class PermutationSearch {

	public static void main(String[] args) {		
		//int[] A = {4,1,3,2};
		int[] A = {4,1,3};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		Arrays.sort(A);
	    for(int i=0; i<A.length;i++) {
	        if (A[i]!=i+1) {
	        	System.out.println("i+1"+(i+1));
	        	System.out.println("Ai"+A[i]);
	            System.out.println("0");
	            return 0;
	        }
	    }
	    System.out.println("1");
	    return 1;
	}

}
