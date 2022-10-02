package com.christopherneedham;

public class AsterickLogger implements Logger{

	@Override
	public void log(String log) {
		
		System.out.println("*** " + log + " ***");
	}

	@Override
	public void error(String error) {
		
		StringBuilder row = new StringBuilder();
		for(int i = 0; i < error.length(); i++) {
			row.append("*");
		}
		System.out.println("***********" + row + "****");
		System.out.println("*** " + "ERROR: " + error + " ***");
		System.out.println("***********" + row + "****");
		
	}
	
		
	
	

}
