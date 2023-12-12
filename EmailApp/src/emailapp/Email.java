package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapaity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "codelaboratory.com";

	// Constructor to receive the first name and last name

	public Email() {
		Scanner in = new Scanner(System.in);
		System.out.println("Your first name: ");
		this.firstName = in.next();
		
		System.out.println("Your last name: ");
		this.lastName = in.next();
		

		// Call a method asking for the department - return the department
		this.department = setDepartment();

		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		// Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	}

	// Ask for the department

	private String setDepartment() {
		System.out.println(
				"New worker: " + firstName +" \nDEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:  ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();

		if (depChoice == 1) {
			return department = "sales";
		} else if (depChoice == 2) {
			return department = "dev";
		} else if (depChoice == 3) {
			return department = "acct";
		} else {
			return department = "";
		}
	}

	// Generate a random password

	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char [] password = new char[length];
		for(int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);

		}

		return new String(password);
	}

	// Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapaity = capacity;
		
	}

	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailBoxCapacity() {
		return mailboxCapaity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	 
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailboxCapaity + "mb";
		
	}
}
