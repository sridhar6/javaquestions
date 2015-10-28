package com;

public class PingPong {
	public String printAnalyse(int number) {
		String result;
		if (number % 3 == 0 && number % 5 == 0) {
			result = "ping pong";

		} else if (number % 3 == 0) {
			result = "ping";

		} else if (number % 5 == 0) {
			result = "pong";

		} else {
			result = new Integer(number).toString();
		}
		return result;
	}
public static void main(String[] args){
	PingPong testObj=new PingPong();
	String result=testObj.printAnalyse(15);
	System.out.println(result);
}
}

