package com.employee.wages.java;

public class EmployeeWages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Welcome to employee wage computation");

		int numberOfHoursPerPartDay = 4;
		int numberOfHoursPerDayFullDay = 8;
		int wagePerHour = 20;
		int maxWorkingDays = 20;
		int maxWorkingHours = 100;
		int totalDays=0;
		int totalHours = 0;
		int dailyWage = 0;
		int totalWageOfMonth = 0;
		int days = 0;

		while ((totalHours <= maxWorkingHours) && (totalDays <= maxWorkingDays)) {
			int employeeAttendance = (int) (Math.floor(Math.random() * 10)) % 2;

			switch (employeeAttendance) {

			case 1:
				dailyWage = numberOfHoursPerDayFullDay * wagePerHour;
				totalHours += numberOfHoursPerDayFullDay;
				break;

			case 2:
				dailyWage = numberOfHoursPerPartDay * wagePerHour;
				totalHours += numberOfHoursPerPartDay;
				break;

			default:
				break;
			}

			totalWageOfMonth += dailyWage;
			days++;
		}
		System.out.println("Total work hour of employee is" +" "+ totalHours + " " + "And total work days are" +" "+  days
				 +" " + "so the total wage of employee is " +" " +totalWageOfMonth);
		}

	}

