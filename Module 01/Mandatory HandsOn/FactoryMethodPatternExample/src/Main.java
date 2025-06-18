 class WordDoc implements document{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Word document is open");
	}
	
}
 class PdfDoc implements document{

		@Override
		public void open() {
			// TODO Auto-generated method stub
			System.out.println("PDF document is open");
		}
		
	}
 class ExcelDoc implements document{

		@Override
		public void open() {
			// TODO Auto-generated method stub
			System.out.println("Excel document is open");
		}
		
	}
abstract class DocumentFactory{
	abstract document createDocument();
}
class WordFactory extends DocumentFactory{

	@Override
	document createDocument() {
		// TODO Auto-generated method stub
		return new WordDoc();
	}
	
}
class PdfFactory extends DocumentFactory{

	@Override
	document createDocument() {
		// TODO Auto-generated method stub
		return new PdfDoc();
	}
	
}
class ExcelFactory extends DocumentFactory{

	@Override
	document createDocument() {
		// TODO Auto-generated method stub
		return new ExcelDoc();
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentFactory obj1=new WordFactory();
		document doc1=obj1.createDocument();
		doc1.open();
		DocumentFactory obj2=new PdfFactory();
		document doc2=obj2.createDocument();
		doc2.open();
		DocumentFactory obj3=new ExcelFactory();
		document doc3=obj3.createDocument();
		doc3.open();
		

	}

}
