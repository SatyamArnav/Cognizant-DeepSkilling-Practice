import java.util.Arrays;
import java.util.Comparator;

class Book {
    int bookId;
    String title;
    String author;

    public Book(int id, String title, String author) {
        this.bookId = id;
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return "ID: " + bookId + ", Title: " + title + ", Author: " + author;
    }

Book linearSearch(Book[] books, String title) {
    for (Book b : books) {
        if (b.title.equalsIgnoreCase(title)) return b;
    }
    return null;
}
int binarySearch(Book[] books, String title) {
    int left = 0, right = books.length - 1;
    while (left <= right) {
        int mid = (left + right) / 2;
        int cmp = books[mid].title.compareToIgnoreCase(title);
        if (cmp == 0) return mid;
        else if (cmp < 0) left = mid + 1;
        else right = mid - 1;
    }
    return -1;
}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] books = new Book[] {
	            new Book(101, "Java Programming", "James Gosling"),
	            new Book(102, "Data Structures", "Seymour Lipschutz"),
	            new Book(103, "Operating Systems", "Abraham Silberschatz"),
	            new Book(104, "Computer Networks", "Andrew S. Tanenbaum"),
	            new Book(105, "Database Systems", "Ramez Elmasri")
	        };

	        System.out.println("Book List:");
	        for (Book b : books) {
	            System.out.println(b);
	        }
	        Book searcher = new Book(0, "", "");
	        String searchTitle1 = "Operating Systems";
	        Book foundBook = searcher.linearSearch(books, searchTitle1);
	        if (foundBook != null) {
	            System.out.println("\nLinear Search Result:");
	            System.out.println(foundBook);
	        } else {
	            System.out.println("\nLinear Search: Book titled \"" + searchTitle1 + "\" not found.");
	        }
	        Arrays.sort(books, Comparator.comparing(b -> b.title.toLowerCase()));
	        String searchTitle2 = "Data Structures";
	        int index = searcher.binarySearch(books, searchTitle2);
	        if (index != -1) {
	            System.out.println("\nBinary Search Result:");
	            System.out.println(books[index]);
	        } else {
	            System.out.println("\nBinary Search: Book titled \"" + searchTitle2 + "\" not found.");
	        }
	}

}
