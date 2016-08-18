package oop.design;

import java.util.Date;
import java.util.GregorianCalendar;

public class CnnEmployee {

	/**
	 * CnnEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public void employeedetails( String n; double s; int year; int month; int day ){
		name = n;
		double s;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		hireDay = calendar.getTime();
	}

	public String getName()
	{
		return name;
	}

	public double getSalary()
	{
		return salary;
	}

	public Date getHireDay()
	{
		return hireDay;
	}

	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	private String name;
	private double salary;
	private Date hireDay;


	public static double main(String[] args) {


		public static double calculateEmployePension(double monthySalary,int years){
			double yearlySalary = monthySalary*12;
			double total=0;
			if(years==1)
			{
				total = yearlySalary*(.05)*years;
			}
		}


      	double yearlySalary;
		double total;
		if(years==2)
		{
			total = yearlySalary*(.10)*years;
		}
		else if(years==3)
		{
			total = yearlySalary*(.25)*years;
		}
		else if(years==4)
		{
			total = yearlySalary*(.40)*years;
		}
		else  // By Default 1 percent // it may continue n years
		{
			total = yearlySalary*(.65);
		}
		return total;
	}
}

