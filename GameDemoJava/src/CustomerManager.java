
public class CustomerManager implements CustomerService{
	private CustomerCheckService customerCheckService;

	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		if (customerCheckService.Check(customer)) {
			System.out.println("Baþarýyla kayýt olundu " + customer.getFirstName());
		}else {
			System.out.println("Kayýt baþarýsýz.");
		}
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kullanýcý silindi "+customer.getFirstName()+" "+customer.getLastName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Kullanýcý güncellendi");
		
	}
	
}
