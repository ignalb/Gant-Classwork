package chapter06;

public class Project6_6 {

	public static void main(String[] args){
		Book daVinci = new Book("The DaVinci Code", "Dan Brown");
		Book hobbit = new Book("The Hobbit", "J.R.R Tolkien");
		Book martian = new Book("The Martian", "Andy Weir");
		Book thief = new Book("The Book Thief", "Markus Zusak");
		Patron me = new Patron("Ignacio Pacheco");
		
		System.out.println(me);
		me.borrow(daVinci);
		me.borrow(hobbit);
		System.out.println(me);
		me.borrow(thief);
		me.borrow(martian);
		me.returnBook("The DaVinci Code");
		System.out.println(" Has borrowed \"The Maritian\"? " + me.hasBorrowed("The Martian"));	//expected value: false
		System.out.println(me);
		me.borrow(martian);
		
		System.out.println("\n" + me);
	}
	
}

class Patron {
	private String name;
	private Book book1, book2, book3;
	
	public Patron(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public boolean hasBorrowed(String title){
		if(book1 != null)
			if(title.equals(book1.getTitle())){  return true;  }
		if(book2 != null)
			if(title.equals(book2.getTitle())){  return true;  }
		if(book3 != null)
			if(title.equals(book3.getTitle())){  return true;  }
		return false;
	}
	public void returnBook(String title){
		if(hasBorrowed(title)){
			if(book1 != null)
				if(title.equals(book1.getTitle())){  book1 = null;  }
			if(book2 != null)
				if(title.equals(book2.getTitle())){  book2 = null;  }
			if(book3 != null)
				if(title.equals(book3.getTitle())){  book3 = null;  }
		}
	}
	public void borrow(Book book){
		if(book1 == null){  book1 = book; return;  }
		if(book2 == null){  book2 = book; return;  }
		if(book3 == null){  book3 = book; return;  }
	}
	
	public String toString(){
		return "Name: " + name + "\n1. " + book1 + "\n2. " + book2 + "\n3. " + book3;
	}
	
}

class Book {
	private String author;
	private String title;
	
	public Book(String title, String author){
		this.author = author;
		this.title = title;
	}
	
	public String getAuthor(){
		return author;
	}
	public String getTitle(){
		return title;
	}
	
	public String toString(){
		return title + " by " + author;
	}
}