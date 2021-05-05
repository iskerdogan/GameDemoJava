
public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean Check(Customer customer) {
		if (customer.getFirstName().length()>0) {
			return true;
		}else {
			return false;
		}
		
	}

}
