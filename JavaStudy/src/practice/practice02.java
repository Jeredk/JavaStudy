package practice;

import java.util.Scanner;

public class practice02 {
	public static void main(String[] args) {
		int[] arr= {5,4,4,2,2,8};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[i]>arr[j+1]) {
					temp=arr[i];
					arr[i]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}	//배열 정렬
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
//		int[] arr= {5,4,4,2,2,8};
//		int temp=0;
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=i;j<arr.length-1;j++) {
//				System.out.println("i " + i + " " + j);
//				if(arr[i]>arr[j+1]) {
//					temp=arr[i];
//					arr[i]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//			
//		}
		
		
	}
	
	static void wood() {
		
	}
}