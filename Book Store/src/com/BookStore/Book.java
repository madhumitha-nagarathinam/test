package com.BookStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Book {
	private String bookName;
    private int bookId;
    private String authorName;
    private String bookDescription;
    
    ArrayList<Book> bookList = new ArrayList<Book>();
    HashMap<Integer,Book> bookList2 = new HashMap<Integer,Book>();
    
    public Book(String bookName, int bookId, String authorName, String bookDescription) {
        this.bookName = bookName;
        this.bookId = bookId;
        this.authorName = authorName;
        this.bookDescription = bookDescription;
    }

    Book()
    {
        
    }
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }
    
    Scanner input = new Scanner(System.in);
    
    public void initializeBooks()
    {
        Book book1 = new Book("A TIME TO KILL ",1,"JOHN GRISHAm","This one is from 3:3 in the Ecclesiastes, again part of the Old Testament. ");
        Book book2 = new Book("My Journey",2,"Dr.APJ Abdul Kalam","The book reveals the famous story of how a simple child from Rameshwaram became the President of the world's largest democracy.2");
        Book book3 = new Book("Whispers of Time",3,"Dr. Krishna Saksena"," It was a dreadful dismal night. Dark clouds were running from all directions to cover the sky and terrific sounds ");
        Book book4 = new Book("Vile Bodies",4,"Evelyn Waugh","Waugh took the title for his 1930 novel from Philippians, full name Epistle to the Philippians, which is part of the New Testament and generally attributed to Paul the Apostle.");
        Book book5 = new Book("Moab is my Washpot",5,"Stephen Fry","Undoubtedly an odd quotation; it comes from line 60:8 of the Book of Psalms in the Old Testament, which reads in full Moab is my washpot");
        
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        
        bookList2.put(1, book1);
        bookList2.put(2, book2);
        bookList2.put(3, book3);
        bookList2.put(4, book4);
        bookList2.put(5, book5);
    }
    
    public void showBooks()
    {
        System.out.println("BOOK NAME     ID");
        for(Book b : bookList)
        {
            System.out.println("  "+b.bookName+"       "+b.bookId);
        }
            
    }
    
    public void showBookDetails()
    {
        System.out.println("Select the book by entering book id: ");
        int options = input.nextInt();
        
        for(Integer i : bookList2.keySet())
        {
            if(options == i)
            {
                System.out.println("AUTHOR NAME     DESCRIPTION");
                System.out.println("   "+bookList2.get(i).authorName+"         "+bookList2.get(i).bookDescription);
            }
        }
    }
}

