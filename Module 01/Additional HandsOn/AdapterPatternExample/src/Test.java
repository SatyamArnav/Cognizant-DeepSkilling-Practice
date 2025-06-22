
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PayPal pay = new PayPal();
        PaymentProcessor processor = new PayPalAdapter(pay);
        processor.processPayment();

	}

}
