import java.util.Scanner;


class Book {
    
    String name;
    String author;
    int price;
    int numPages;

    
    Book(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

  
    public String toString() {
        String bookDetails = "Book name: " + this.name + "\n" +
                             "Author name: " + this.author + "\n" +
                             "Price: " + this.price + "\n" +
                             "Number of pages: " + this.numPages + "\n";
        return bookDetails;
    }
} 


public class BookProgram{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
	  System.out.print("AMAL ROY 1BM23CS025\n");		 

        System.out.print("Enter the number of books: ");
        int n = s.nextInt(); 

        
        Book[] books = new Book[n];

        
        for (int i = 0; i < n; i++) {
            
            System.out.print("Enter name of book " + (i + 1) + ": ");
            String name = s.next();
		s.nextLine();
            System.out.print("Enter author of book " + (i + 1) + ": ");
            String author = s.next();
		s.nextLine();
            System.out.print("Enter price of book " + (i + 1) + ": ");
            int price = s.nextInt();
            System.out.print("Enter number of pages in book " + (i + 1) + ": ");
            int numPages = s.nextInt();

            
            books[i] = new Book(name, author, price, numPages);
        }

        
        System.out.println("\nBook Details:");
        for (Book book : books) {
            System.out.println(book); 
        }

        
    }
} 