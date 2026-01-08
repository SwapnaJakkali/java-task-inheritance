package com.employeeSalse;
import java.util.Scanner;


class SalesEmployee{
	String employeeName;
	int employeeId;
	
	public SalesEmployee(String employeeName,int employeeId) {
		this.employeeId=employeeId;
		this.employeeName=employeeName;
	}
}
class PerformanceEmployee extends SalesEmployee{
	double totalSales;
	double averageSales;
	String performanceGrade;
	
	public PerformanceEmployee(double totalSales,double averageSales, String performanceGrade , String employeeName, int employeeId) {
		super(employeeName,employeeId);
		this.totalSales=totalSales;
		this.averageSales=averageSales;
		this.performanceGrade=performanceGrade;
	}
	
	public void addSales(double sales) {
		if(sales<0) {
			System.out.println("enter valid amount to add .");
		}else {
			totalSales+=sales;
		}
	}
	
	public void recalculatePerformance(double sales) {
		if(sales>=10 && sales<=20) {
			performanceGrade="good";
		}else if(sales<10) {
			performanceGrade="bad";
		}else {
			performanceGrade="Super , fantastic , mind blowing";
		}
	}
	public void display() {
		System.out.println("employee name : "+employeeName);
		System.out.println("employee Id : "+employeeId);
		System.out.println("total sales : "+totalSales);
		System.out.println("average sales : "+averageSales);
		System.out.println("performance grade : "+performanceGrade);
	}
}

public class EmployeeSalsesTracking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter employee name : ");
		String name=sc.nextLine();
		System.out.println("enter employee id : ");
		int id= sc.nextInt();
		System.out.println("enter total sales : ");
		double totalSales=sc.nextDouble();
		System.out.println("enter average sales : ");
		double averageSales=sc.nextDouble();
		sc.nextLine();
		System.out.println("enter performance grade : ");
		String grade = sc.nextLine();
		
		PerformanceEmployee pe = new PerformanceEmployee(totalSales,averageSales,grade,name,id);
		
		boolean status = true;
		
		while(status) {
			System.out.println("--- Menu ---\r\n"
					+ "1. Add Sales\r\n"
					+ "2. Recalculate Result\r\n"
					+ "3. View Summary\r\n"
					+ "4. Exit\r\n");
			System.out.println("enter a number to choose an option : ");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("enter sales to be added : ");
				double sales=sc.nextDouble();
				pe.addSales(sales);
				break;
			case 2:
				pe.recalculatePerformance(pe.totalSales);
				break;
			case 3:
				pe.display();
				break;
			case 4:
				status=false;
				System.out.println("Thank you!");
				break;
			default:
				System.out.println("please choose valid options!!!");
				break;
			}
		}
		
		
		sc.close();
	}
}
