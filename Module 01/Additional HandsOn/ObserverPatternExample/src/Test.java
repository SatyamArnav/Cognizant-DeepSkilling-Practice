
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StockMarket stockMarket = new StockMarket();
	     Observer mobileApp = new MobileApp();
	     Observer webApp = new WebApp();

	     stockMarket.register(mobileApp);
	     stockMarket.register(webApp);

	     stockMarket.setPrice(2050.75f);
	     stockMarket.setPrice(2075.25f);
		
		
	}

}
