package com.christopherneedham;

public class App {

	public static void main(String[] args) {
		
		Logger Logger = new AsterickLogger();
		
		Logger.log("Hello");
		Logger.error("Hello");
		
		Logger Logger2 = new SpacedLogger();
		
		Logger2.log("Hello");
		Logger2.error("Hello");
	}

}
