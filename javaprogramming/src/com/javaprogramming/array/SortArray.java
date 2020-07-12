package com.javaprogramming.array;

public class SortArray {

	public static void main(String[] args) {
		int[]arr= {5,2,3,1,7,9,4};
		int []sortarr;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				arr[i]=arr[i+1];
				System.out.println(arr[i]);
			}
		}

	}

}
