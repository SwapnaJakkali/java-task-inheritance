package com.example.test;

public class Employee {
	private String employeeName;
	private int employeeId;
	private String department;
	
	public Employee(String name, int id , String dept) {
		this.employeeName=name;
		this.employeeId=id;
		this.department=dept;
	}
	
	public void setEmployeeName(String name) {
		this.employeeName=name;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeId(int id) {
		this.employeeId=id;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setDepartment(String dept) {
		this.department=dept;
	}
	public String getDepartment() {
		return department;
	}
	
	public void display() {
		System.out.println(getEmployeeName());
	}
}

class ProjectEmployee extends Employee{
	private String projectName;
	private String role;
	 int monthlyScore[] = {0,0,0};
	
	public ProjectEmployee(String projectName, String role, int[] monthlyScore , String employeeName, int employeeId , String department) {
		super(employeeName, employeeId , department);
		this.projectName=projectName;
		this.role=role;
		this.monthlyScore=monthlyScore;
		
		System.out.println("Profile created successfully..");
	}
	
	public void setProjectName(String projectName) {
		this.projectName=projectName;
	}
	public String getProjectName() {
		return projectName;
	}
	
	public void setProjectRole(String role) {
		this.role=role;
	}
	public String getProjectRole() {
		return role;
	}
	
	public void updateProjectRole(String role) {
		if(!role.equals(" ")) {
			this.role=role;
			System.out.println("role updated succesfully");
		}else {
			System.out.println("role is invald");
		}
	}
	public void updateProjectName(String projectName) {
		if(!projectName.equals(" ")) {
			this.projectName=projectName;
		}else {
			System.out.println("inavlid project name");
		}
	}
	
	public void viewEmployeeProfile(){
		System.out.println("Employee details ");
		System.out.println("Name : "+getEmployeeName());
		System.out.println("Employee ID : "+getEmployeeId());
		System.out.println("Department :"+getDepartment());
		System.out.println("Project name :"+getProjectName());
		System.out.println("Poject Role :"+getProjectRole());
		System.out.print("Project Scores : ");
		for(int i=0; i<3; i++) {
			System.out.print(" 1");
		}
		System.out.println();
	}
	
	public void viewAveragePerformanceScore(int arr[]) {
		int n=arr.length;
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("average performaance score : "+sum/n);
	}
	
	
}
