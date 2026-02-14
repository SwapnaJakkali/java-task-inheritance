package practiceQuestions.com.ecample;

class Hotel{
	int hotelId;
	
	public Hotel(int id) {
		this.hotelId=id;
	}
}
class Room extends Hotel{
	int days;
	double roomRentPerDay;
	
	public Room(int days , double roomRent, int id) {
		super(id);
		this.days=days;
		this.roomRentPerDay=roomRent;
	}
}
class LuxuryRoom extends Room{
	double serviceChallenge;
	double foodCharge;
	
	public LuxuryRoom(double serviceCharges , double foodCharges, int days , double roomRent, int id) {
		super(days , roomRent,id);
		this.serviceChallenge=serviceCharges;
		this.foodCharge=foodCharges;
	}
	
	public void calculateBill(double serviceCharges , double foodCharges, double roomRent, int days) {
		double totalCharges=serviceCharges+foodCharges+roomRent;
		totalCharges*=days;
		System.out.println(totalCharges);
		
	}
}
public class HotelBillingSystem {
	public static void main(String[] args) {
		LuxuryRoom lx = new LuxuryRoom(10,10,1,10,1);
		lx.calculateBill(10,10,10,2);
	}
}
