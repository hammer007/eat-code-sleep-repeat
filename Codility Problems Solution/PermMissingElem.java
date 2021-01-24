package com.hammer.codilitylessons;

import java.util.HashSet;

public class PermMissingElem {

	public static void main(String[] args) {
		int A[]= {};
		System.out.println("the missing element is:" + solution(A));
	}
	
	public static int solution(int[] A){
		HashSet<Integer> hSet = new HashSet<>();
		for(int i=0; i<A.length;i++) {
			hSet.add(A[i]);
		}
		
		for(int j=1; j<=A.length+1; j++) {
			if(!hSet.contains(j)) {
				return j;
			}
		}
		return 1;
	}
}
