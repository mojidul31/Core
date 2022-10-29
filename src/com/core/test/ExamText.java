package com.core.test;
import java.util.*;

public class ExamText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String tc1 = "(()())(())";		
		//String tc3 = "()()";
		String tc2 = "(()())(())(()(()))";
		System.out.println(TestSolution(tc2));
	}
	
	public static String TestSolution(String S) {
		char[] cArr = S.toCharArray();
        int n = 0;
        List<Integer> indx = new ArrayList<>();
        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] == '(') {
                n++;
            } else if (cArr[i] == ')') {
                n--;
            }
            if (indx.size() % 2 == 0 && n == 1) {
                indx.add(i + 1);
            } else if (indx.size() % 2 != 0 && n == 0) {
                indx.add(i);
            }
        }
        String result = "";
        for (int i = 0; i < indx.size(); i += 2) {
        	result += S.substring(indx.get(i), indx.get(i + 1));
        }
        return result;
    }
	

}
