
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Notifier email = new EmailNotifier();
	        Notifier emailWithSMS = new SMSNotifierDecorator(email);
	        Notifier emailWithSlack = new SlackNotifierDecorator(email);
	        emailWithSMS.send("Order dispatched!");
	        emailWithSlack.send("Order dispatched!");
	        
	}

}
