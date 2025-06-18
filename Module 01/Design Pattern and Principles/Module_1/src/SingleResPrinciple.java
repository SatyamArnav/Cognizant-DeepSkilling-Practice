import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
public class SingleResPrinciple {
	public static class Book{
		private String name;
		private String author;
		private String text;
		public Book(String name,String author,String text) {
			this.name=name;
			this.author=author;
			this.text=text;
			}
		public void setName(String name) {
			this.name=name;
		}
		public void setAuthor(String author) {
			this.author=author;
		}
		public void setText(String text) {
			this.text=text;
		}
		public String getName() {
			return name;
		}
		public String getAuthor() {
			return author;
		}
		public String getText() {
			return text;
		}
		public String replaceWordinText(String word,String replaceword) {
			return text.replaceAll(word, replaceword);
		}
		public boolean isWordinText(String word) {
			return text.contains(word);
		}

	}
	public static class BookPrint{
		public void PrintToConsole(String text) {
			System.out.println(text);
		}
		public void PrintTextToAnotherMedium(String text) {
			String file="Output.txt";
			try(FileWriter writer=new FileWriter(file)){
				writer.write(text);
			}
			catch(IOException e) {
				System.out.println("Error Occurres");
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Book obj1 = new Book("Harry Potter and the Philosopher's Stone","J. K. Rowling","Mr and Mrs Durley...");
		BookPrint print = new BookPrint();
		print.PrintToConsole(obj1.getText());
		print.PrintTextToAnotherMedium(obj1.getText());
		obj1.setText(obj1.replaceWordinText("Durley","Dursley"));
		print.PrintToConsole(obj1.getText());
		print.PrintTextToAnotherMedium(obj1.getText());
		if (obj1.isWordinText("Dursley")) {
		    System.out.println("Found");
		} else {
		    System.out.println("Not Found");
		}
		

	}

}
