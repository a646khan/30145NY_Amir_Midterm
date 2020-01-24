package design;

import java.util.Scanner;

public class EmployeeInfo implements Employee {

	/*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
	 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
	 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
	 * go to FortuneEmployee class to apply all the fields and attributes.
	 *
	 * Important: YOU MUST USE the
	 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
	 * Use all kind of keywords(super,this,static,final........)
	 * Implement Nested class.
	 * Use Exception Handling.
	 *
	 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	private static String companyName;
	private int employeeId;
	private String employeeName;
	private String employeeDepartment;
	private int employeeSalary;


	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo() {}

	public EmployeeInfo(int employeeId){

		this.employeeId = employeeId;
	}
	public EmployeeInfo(String name, int employeeId){

		this.employeeName = name;
		this.employeeId = employeeId;
	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public int calculateEmployeeBonus(int performance){
		int total=0;
		return total;
	}

	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 *
	 */
	public double calculateEmployeePension(){

		double total = 0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
		String convertedJoiningDate = DateConversion.convertDate(joiningDate);
		String convertedTodaysDate = DateConversion.convertDate(todaysDate);

		int numberOfYears = Integer.valueOf(convertedTodaysDate.split("/")[1]) -
				Integer.valueOf(convertedJoiningDate.split("/")[1]);

		for(int i = 1; i <= numberOfYears; i++)
			total += calculateSalary() * 0.05 * i;

		return total;
	}
	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}

	public void setEmployeeId(int employeeId) {

		this.employeeId = employeeId;
	}

	public int employeeId() {

		return this.employeeId;
	}

	public void setEmployeeName(String employeeName) {

		this.employeeName = employeeName;
	}

	public String employeeName() {

		return this.employeeName;
	}

	@Override
	public void assignDepartment() {

	}


	public void assignDepartment(String department) {

		this.employeeDepartment = department;
	}


	public String getEmployeeDepartment() {

		return this.employeeDepartment;
	}

	public void setEmployeeSalary(int employeeSalary) {

		this.employeeSalary = employeeSalary;
	}

	public int calculateSalary() {

		return this.employeeSalary;
	}

	@Override
	public void benefitLayout() {

	}

	static void setCompanyName(String companyName) {

		EmployeeInfo.companyName = companyName;
	}

	String getCompanyName() {

		return EmployeeInfo.companyName;
	}
}
