package com.sg.foundations.javabasics.assessments;

public class SummativeSums {
	
	public static int sumOfArrayElements(int[] arr) {
		int sum = 0;
		for(int i =0;i<arr.length;i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {

		int[] arr1 = new int []{ 1, 90, -33, -55, 67, -16, 28, -55, 15 };
		int[] arr2 = new int []{ 999, -60, -77, 14, 160, 301 };
		int[] arr3 = new int []{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
				140, 150, 160, 170, 180, 190, 200, -99 } ;

		System.out.println("#1 Array Sum: "+sumOfArrayElements(arr1));
		System.out.println("#2 Array Sum: "+sumOfArrayElements(arr2));
		System.out.println("#3 Array Sum: "+sumOfArrayElements(arr3));
	}

}
