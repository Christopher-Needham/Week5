package com.christopherneedham;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		StringBuilder spaced = new StringBuilder();
		for(int i = 0; i < log.length();i++) {
			spaced.append(log.charAt(i) + " ");
			
		}
		System.out.println(spaced);
	}

	@Override
	public void error(String error) {
		StringBuilder spaced = new StringBuilder();
		for(int i = 0; i < error.length();i++) {
			spaced.append(" " + error.charAt(i));
			
		}
		System.out.println("Error:" + spaced);
		
		
	}

}
