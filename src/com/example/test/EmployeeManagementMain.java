package com.example.test;
import java.util.Scanner;
import com.example.test.*;

public class EmployeeManagementMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []arr= {80,85,90};
		
		ProjectEmployee em = new ProjectEmployee("Banking app","backend developer",arr,"Rohan",1,"development");
//		em.viewEmployeeProfile();
		boolean b=true;
		while(b) {
			System.out.println("-------Menu Operations------");
			System.out.println("1.Update Project Roles");
			System.out.println("2.Update Project Name");
			System.out.println("3.View Employee Profile");
			System.out.println("4.View Average Performance Score");
			System.out.println("Enter yoour choice : ");
			b=false;
			int choice=sc.nextInt();
			
			switch (choice){
				case 1:
					String role=sc.next();
					em.updateProjectRole(role);
					break;
				case 2:
					String name=sc.next();
					em.updateProjectName(name);
					break;
				case 3:
					em.viewEmployeeProfile();
					break;
				
				case 4:
					em.viewAveragePerformanceScore(em.monthlyScore);
					break;
				
				case 5:
					System.out.println("Exiting..!");
					b=false;
					break;
				
				default:
					System.out.println("Please enter a valid input");		
			}
		}
	}
}
