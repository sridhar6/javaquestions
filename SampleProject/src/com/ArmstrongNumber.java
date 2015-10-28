package com;

public class ArmstrongNumber {
public boolean isArmstrongNumber(int number){
	int temp=number;
	int numberofdigits=String.valueOf(number).length();
int sum=0;
int div=0;
while(temp>0){
	div=temp%10;
	int j=1;
	for(int i=0;i<numberofdigits;i++){
		j=j*div;
	}sum=sum+j;
	temp=temp/10;
	
}
if(number==sum){
	return true;	
	
	
}else{
	return false;
}	
}
public static void main(String[] args){
	ArmstrongNumber testObj=new ArmstrongNumber();
	boolean result=testObj.isArmstrongNumber(371);
	System.out.println("isArmstromgnumber "+ result);
}








}
