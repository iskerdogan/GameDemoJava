
public class CustomerManager implements CustomerService{
	private CustomerCheckService customerCheckService;

	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		if (customerCheckService.Check(customer)) {
			System.out.println("Ba�ar�yla kay�t olundu " + customer.getFirstName());
		}else {
			System.out.println("Kay�t ba�ar�s�z.");
		}
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kullan�c� silindi "+customer.getFirstName()+" "+customer.getLastName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Kullan�c� g�ncellendi");
		
	}
	
}
