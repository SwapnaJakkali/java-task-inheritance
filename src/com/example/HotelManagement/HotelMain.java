package com.example.HotelManagement;
import java.util.Scanner;

class Staff {
	private String staffName="hi";
	private int staffId=28;
	private String baseShift="gh";
	
	
//	public void setName(String name) {
//		this.staffName=name;
//	}
//	public String getStaffName() {
//		return staffName;
//	}
//	
//	public void setStaffId(int id) {
//		this.staffId=id;
//	}
//	public int getName() {
//		return staffId;
//	}
//	
//	public void setBaseShift(String shift) {
//		this.baseShift=shift;
//	}
//	
	Staff(){
		
	}
	
	Staff(String name, int id, String shift){
		this.staffName=name;
		this.staffId=id;
		this.baseShift=shift;
	}
	
	void staffDisplay() {
		System.out.println(staffName);
		System.out.println(staffId);
		System.out.println(baseShift);
	}
}
class DepartmentStaff extends Staff{
	private String departmentName;
	private String responsibilityLevel;
	
	DepartmentStaff(String departmentName ,String level ,String name, int id, String shift){
		super(name , id , shift);
		this.departmentName=departmentName;
		this.responsibilityLevel=level;
	}
}
public class HotelMain{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Staff st = new Staff();
		String name=sc.nextLine();
		int id=sc.nextInt();
		sc.nextLine();
		String shift = sc.nextLine();
		
//		st.setName(name);
//		st.setStaffId(id);
//		st.setBaseShift(shift);
		
//		Staff st1=new Staff(name,id,shift);
		
		st.staffDisplay();
		
		
	}
}
