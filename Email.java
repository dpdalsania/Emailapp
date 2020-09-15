package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int defaultPasswordLength = 8;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "company.com";

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created:" + this.firstName + " " + this.lastName);
		this.department = setDepartment();
		System.out.println("Department:" + this.department);
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Password:" + this.password);

		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
		System.out.println("Your Email is: " + email);
	}

	private String setDepartment() {
		System.out.print(
				"Department:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter the department code:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {
			return "Sales";
		} else if (depChoice == 2) {
			return "Development";
		} else if (depChoice == 3) {
			return "Accounting";
		} else {
			return "";
		}

	}

	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);

		}
		return new String(password);

	}
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	public void changePassword(String password) {
		this.password = password;
	}
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	public String getAlternativeEmail() {
		return alternateEmail;
	}
	public String getPassword() {
		return password;
	}
	
}
