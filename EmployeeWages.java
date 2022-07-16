package com.employee.wages.java;

public class EmployeeWages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Welcome to employee wage computation");
		int attandance = 1;
		double randomCheck = Math.floor(Math.random() * 10) % 2;
		if (attandance == randomCheck) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}
	}


	}


