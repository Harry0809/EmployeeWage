package com.employee.wages.java;

public class EmployeeWages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Welcome to employee wage computation");

		int wagePerHour = 20;
		int numberOfHourPerDay = 8;

		int attandance = 1;
		double randomCheck = Math.floor(Math.random() * 10) % 2;
		if (attandance == randomCheck) {

			if (numberOfHourPerDay == 8) {
				System.out.println("Employee is working Full day");
				int wageOfTheDay = numberOfHourPerDay * wagePerHour;
				System.out.println("Daily wage of the employee is" + " " + wageOfTheDay);

			} else {
				System.out.println("Employee is not working today.");
			}
		}

	}
}


