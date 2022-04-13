package com.BookStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class User {
	

	private String userName;
	private String userPassword;
	private int userId;
	private String emailId;

	ArrayList<User> userList = new ArrayList<User>();


	public User(String userName, String userPassword, int userId, String emailId) {
	this.userName = userName;
	this.userPassword = userPassword;
	this.userId = userId;
	this.emailId = emailId;
	}

	User()
	{

	}

	public String getUserName() {
	return userName;
	}

	public void setUserName(String userName) {
	this.userName = userName;
	}

	public String getUserPassword() {
	return userPassword;
	}

	public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
	}

	public int getUserId() {
	return userId;
	}

	public void setUserId(int userId) {
	this.userId = userId;
	}

	public String getEmailId() {
	return emailId;
	}

	public void setEmailId(String emailId) {
	this.emailId = emailId;
	}

	Scanner input =  new Scanner(System.in);

	public void userSignUp()
	{
	System.out.println("Enter the user name: ");
	userName = input.next();

	System.out.println("Enter the password: ");
	userPassword = input.next();

	userId += 1;
	System.out.println("Auto generated Id: "+userId);

	System.out.println("Enter the email id: ");
	emailId = input.next();

	User newUser = new User(userName,userPassword,userId,emailId);

	userList.add(newUser);
	}

	public void userLogIn(Book book)
	{

	int count = 0;

	System.out.println("Enter the user name: ");
	userName = input.next();

	for(User u : userList)
	{
	if(userName.equals(u.userName))
	{
	System.out.println("Matched");
	book.showBooks();
	book.showBookDetails();
	break;
	}
	else
	{
	count++;
	}
	}
	if(count>0)
	{
	System.out.println("Invalid user name");
	}

	}
	}

		
