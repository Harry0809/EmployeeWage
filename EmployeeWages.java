package com.employee.wages.java;

public class EmployeeWages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Welcome to employee wage computation");

		int wagePerHour=20;
		int numberOfHoursPerFullDay=8;
		int numberOfHoursPerPartDay=4;
		int numberOfWorkingDaysInMonth=20;
		int wageOfTheMonth=0;
		
int employeeAttendance = (int) (Math.floor(Math.random() * 10))%2;
		
		switch (employeeAttendance) {
		
		case 1:
			System.out.println("Emoloyee is working full day");
		  wageOfTheMonth = numberOfHoursPerFullDay *  wagePerHour *  numberOfWorkingDaysInMonth ;
			System.out.println("monthly wage of the employee is" +  " " + wageOfTheMonth);
			break;
			
		case 2:
			System.out.println("Employee is working part day");
		   wageOfTheMonth = numberOfHoursPerPartDay *  wagePerHour * numberOfWorkingDaysInMonth ;
		   System.out.println("montghly "
		   		+ "wage of employee is" + wageOfTheMonth);
		   break;
		default:
			System.out.println("employee is absent");
			break;
			

		}

	}
}
