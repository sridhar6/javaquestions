package com;

public class LargestNumber {
	public int findLargestNumber(int numbers[]){
		int largest=numbers[0];
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]>largest){
				largest=numbers[i];
			}
		
		}
		return largest;
	}public static void main(String[] args){
		LargestNumber testObj=new LargestNumber();
		int numbers[]={57,23,89,67,56,84};
	int result=	 testObj.findLargestNumber(numbers);
	System.out.println(result);
	}

}
