package com;

public class FindCommonArrays {
	public void findCommonElement(int array1[],int array2[]){
		for(int i=0;i<array1.length;i++){
			for(int j=0;j<array2.length;j++){
				if(array1[i]==array2[j]){
					System.out.println(array1[i]);
				}
			}
		}
	}
	public static void main(String[] args){
		 FindCommonArrays testObj=new FindCommonArrays();
		 int array1[]={2,4,5,7,5};
		 int array2[]={7,2,8,9,4};
		 
		 testObj. findCommonElement(array1,array2);
	}

}
