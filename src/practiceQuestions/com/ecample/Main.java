package practiceQuestions.com.ecample;

class Person{
	String name;
	
	public Person(String name){
		this.name=name;
	}
}
class Student extends Person{
	String name;
	
	public Student(String name) {
		super("jakkali");
		this.name=name;
	}
	public void display() {
		System.out.println(super.name);
		System.out.println(name);
	}
}
public class Main {
	public static void main(String[] args) {
		Student st = new Student("swapna");
		st.display();
	}
}
