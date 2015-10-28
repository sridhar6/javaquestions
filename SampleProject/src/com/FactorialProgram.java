package com;

public class FactorialProgram {
	public void withRecursion(int n){
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
			
		}
		System.out.println("in method with recursion fact is "+fact);
	}
public void withoutRecursion(int n){
System.out.println("in method without recursion fact is"+fact(n));

}
static int  fact(int n){
	if(n<=1){
		return 1;
	}else {return n*fact(n-1);}
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
FactorialProgram testObj=new FactorialProgram();
testObj.withRecursion(10);
testObj.withoutRecursion(6);

	}

}
