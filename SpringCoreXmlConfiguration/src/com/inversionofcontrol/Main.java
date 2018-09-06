package com.inversionofcontrol;

public class Main {
	public static void main(String[] args) {
		
		//Create object
		Coach coach = new TrackCoach();
		
		//Use object
		System.out.println(coach.getDailyWorkout());
	}
}
