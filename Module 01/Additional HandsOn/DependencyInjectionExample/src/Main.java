
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerRepository repo = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repo);
        service.showCustomer(1001);
	}

}
