package apslabsession1;

public class Employee {

	String emailid;
	String department;
	String password;
	String firstName;
	String lastName;
	private String ajay;
	private String singh;
	public void displayEmployeedata() {
		
		System.out.println("Employee email id" +emailid);
		System.out.println("Employee department" +department);
		System.out.println("employee password" +password);
		System.out.println("employee firstname" +firstName);
		System.out.println("employee lastName" +lastName);
		
		
		}
	public Employee(String emailid, String department, String password,String firstName,String lastName) {
		super();
		this.emailid = emailid;
		this.department = department;
		this.password = password;
		this.firstName= firstName;
		this.lastName= lastName;
		
	}
		
	
}

		
