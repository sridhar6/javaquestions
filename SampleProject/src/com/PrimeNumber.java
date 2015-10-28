package com;

public class PrimeNumber {
	public boolean isPrimeNumber(int number){
	for(int i=2;i<=number/2;i++){
		if(number%i==0){
			return false;
		}
	}
	return true;
	}public static void main(String[] args){
		PrimeNumber testobj=new PrimeNumber();
	boolean result=	testobj.isPrimeNumber(29);
	System.out.println("result is "+ result);
	}

}
