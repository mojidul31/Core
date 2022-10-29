package com.core.test;

import java.util.*;

public class MissingInteger {

	public static void main(String[] args) {
		//int[] A = {1, 3, 6, 4, 1, 2};
		//int[] A = {1, 2, 3};
		int[] A = {-1, -3};
		System.out.println(solution(A));

	}
	
	public static int solution(int[] A) {
		int N = A.length;
		Set<Integer> set = new HashSet<>();
		for (int a : A) {
		    if (a > 0) {
		        set.add(a);
		    }
		}
		for (int i = 1; i <= N + 1; i++) {
		    if (!set.contains(i)) {
		        return i;
		    }
		}
		return 1;
	}

}
