package com;
import java.util.BitSet;
public class MissingNumber {
	public void findMissingNumber(int numbers[],int count){
		int missingcount=count-numbers.length;
		BitSet bitSetobj=new BitSet(count);
		for(int i:numbers){
			bitSetobj.set(i-1);
		}
		int missingindex=0;
		for(int i=0;i<missingcount;i++){
			
		missingindex=bitSetobj.nextClearBit(missingindex);
		System.out.println("missingnumber is"+(missingindex+1));	
		}
	}
	public static void main(String[] args){
		MissingNumber testObj=new MissingNumber();
		testObj.findMissingNumber(new int[]{1,2,3,4,6,7,8},8);
	}

}
