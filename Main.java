class Author {
	String name;
	Author(String name){
		this.name = name;
	}
}

class Book {
	String bookName;
	Book(String bookName) {
		this.bookName = bookName;
	}
}

public class Main {
	public static void main(String args[]) {
		Author a = new Author("Rabindra Nath");
		Book b = new Book("Gitanjali");
		
		System.out.println(a.name + " is the writer of " + b.bookName);
	}
}