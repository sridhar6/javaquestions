package com;

public class FibonaciSeries {
	public void printFibonaciSeries(int length){
		int fiblist[]=new int[length];
		fiblist[0]=0;
		fiblist[1]=1;
		for ( int i=2; i<length;i++)
		{
			 fiblist[i]=fiblist[i-1]+fiblist[i-2];		
				
		}
		for (int i=0;i<length;i++){
		System.out.print(fiblist[i]+" ");
		}
		
	}
	public static void main(String[] args){
	FibonaciSeries testObject=new FibonaciSeries();
	testObject.printFibonaciSeries(10);	
	}

}
