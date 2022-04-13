package com.BookStore;
import java.util.Scanner;


public class MainClass {
	
public static void main(String[] args) {
	
	        
	        User user = new User();
	        Book book = new Book();
	        book.initializeBooks();
	        
	        System.out.println("MAGIC OF BOOKS");
	        System.out.println(" \n[2] User \n[3] Exit");
	        
	        Scanner input = new Scanner(System.in);
	        int options1 = input.nextInt();
	        
	        while(true)
	        {
	            
	            if(options1 == 2)
	            {
	                System.out.println("\n[1] SIGNUP \n[2] LOGIN \n[3] EXIT");
	                int options2 = input.nextInt();
	                if(options2 == 1)
	                {
	                    user.userSignUp();
	                }
	                else if(options2 == 2)
	                {
	                    user.userLogIn(book);
	                    //book.showBooks();
	                }
	                else if(options2 == 3)
	                {
	                    System.exit(0);
	                }
	            }
	            else if(options1 == 3)
	            {
	                System.exit(0);
	            }
	        }
	        
	    }

	
}


