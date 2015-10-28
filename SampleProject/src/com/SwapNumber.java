package com;

public class SwapNumber {
	public void withoutThirdVariable(int a,int b){
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("in method without third variable a is "+a+" b is "+b );
	}
	public void withThirdVariable(int a,int b){
		int temp=a;
		a=b;
		b=temp;
		System.out.println("in method with third variable a is "+a+"b is "+b);
	}
public static void main(String[] args){
SwapNumber testObj=new SwapNumber();
testObj.withoutThirdVariable(5,10);
testObj.withThirdVariable(15,20);
}
}
