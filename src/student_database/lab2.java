package student_database;

public class lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu1 = new Student("Janelle", "23553422");
		Student stu2 = new Student("Thomas", "453453453");
		Student stu3 = new Student("Liz", "88665343");

		stu1.enroll("Math251");
		stu1.enroll("Eng255");
		stu1.enroll("His525");
		
		//stu1.showCourses();
		//stu1.checkBalance();
		stu1.payTuition(50);
		//stu1.checkBalance();
		System.out.println(stu1.toString());
	}

}

/**
 * @author Allan
 *
 */
class Student{
	
	// propertys
	private static int id=0;
	private String userID;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String course; 
	private static final int costOfCourse = 800;
	private int balance = 0;
	
	public Student(String name, String ssn) {
		id++;
		this.name = name;
		this.ssn = ssn;
		setUserID();
		setEmail();
	}
	
	private void setEmail() {
		email = name.toLowerCase() + "." + id + "@sdetuni.com";
		System.out.println("Your email: " + email);
	}
	public String getEmail() {
		return email;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	private void setUserID() {
		int max = 9000;
		int min = 1000;
		
		int randNum = (int)(Math.random() * ((max - min)));
		randNum = randNum + min;
		userID = id + "" + randNum + ssn.substring(5);
		System.out.println("Your user ID:" + userID);
	}
	
	public void enroll(String course) {
		this.course = this.course + ", " + course; 
		//System.out.println(course);
		balance = balance + costOfCourse;
	}
	public void payTuition(int amount) {
		balance = balance - amount;
		System.out.println("Payment: £" + amount + " recieved.");
	}
	public void checkBalance() {
		System.out.println("Balance: £" + balance);
		System.out.println("adding code to project...222222");
	}

	public void showCourses() {
		System.out.println(course);
	}
	public String toString() {
		return "[NAME: " + name + " ]\n[COURSES: " + course + " ]\nBALANCE: £" + balance + " ]";
	}

}
