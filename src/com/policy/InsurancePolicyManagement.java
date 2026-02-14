package com.policy;
import java.util.Scanner;
class InsurancePolicy{
	String customerName;
	String policyType;
	double policyAmount;
	double approvedAmount;
	String policyStatus;
	
	public InsurancePolicy(String cn, String pt, double pa, double aa,String ps) {
		this.customerName=cn;
		this.policyType=pt;
		this.policyAmount=pa;
		this.approvedAmount=aa;
		this.policyStatus=ps;
		System.out.println("Policy has been created.");
	}
	
	public void updateApprovedAmount(double newAmount) {
		if(newAmount==0 || newAmount>policyAmount) {
			System.out.println("enter valid . amount should less than or equal to policy amount . ");
		}else {
			approvedAmount=newAmount;
			System.out.println("approved amount succefully updated . ");
		}
	}
	
	public void changePolicyStatus(String newPolicyStatus) {
		if(newPolicyStatus==null || newPolicyStatus.equals("")) {
			System.out.println("enter correct policy stats . ");
		}else {
			policyStatus=newPolicyStatus;
			System.out.println("policy status is updated successfully . ");
		}
	}
	public void display() {
		System.out.println("customer name : "+customerName +"\r\n"+
	"policy type : "+policyType+"\r\n"+"policy amount : "+ policyAmount+"\r\n"+"approved amount : "+approvedAmount+"\r\n"+"policy status : "+policyStatus);
	}
}

public class InsurancePolicyManagement {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter customer name : ");
		String cn=sc.nextLine();
		System.out.println("enter policy type : ");
		String pt=sc.nextLine();
		System.out.println("enter policy amount : ");
		double pa=sc.nextDouble();
		System.out.println("enter approved amount : ");
		double aa=sc.nextDouble();
		sc.nextLine();
		System.out.println("enter policy status : ");
		String ps=sc.nextLine();
		
		
		InsurancePolicy ip = new InsurancePolicy(cn,pt,pa,aa,ps);
		
		boolean status = true;
		
		while(status) {

			System.out.println("======menu=======");
			System.out.println("1 . Update Approved Amount\r\n"
					+ "2 . Change Policy Status\r\n"
					+ "3 . View Policy Summary\r\n"
					+ "4 . Exit the program\r\n");
			System.out.println("enter a number to choose one option.");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				double d = sc.nextDouble();
				ip.updateApprovedAmount(d);
				break;
			case 2:
				sc.nextLine();
				String s=sc.nextLine();
				ip.changePolicyStatus(s);
				break;
			case 3:
				ip.display();
				break;
			case 4:
				status=false;
				System.out.println("you are exiting .\r\nThank you!");
				break;
			default:
				System.out.println("you enterd a wrong option , please enter a valid option!!!");
				break;
			}
		}
		sc.close();
	}

}
