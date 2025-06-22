
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.pay(1000);

        context.setPaymentStrategy(new PayPalPayment());
        context.pay(2000);
	}

}
