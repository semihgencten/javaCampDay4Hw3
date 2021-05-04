package day3wh3;

public class BaseUserManager implements IUserManager {

	
	ICustomerCheckService customerCheckManager;
	public BaseUserManager(ICustomerCheckService customerCheckManager) {
		super();
		this.customerCheckManager = customerCheckManager;
	}

	@Override
	public void addUser(User user)  {
		if(customerCheckManager.checkIfRealPerson(user)) {
		System.out.println("User added: "+ user.getFirstName());}
		else {
			System.out.println(user.getFirstName()+"cannot added because the unsuccessed validation.");
		}
		
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("User deleted: "+ user.getFirstName());	
		
	}

	@Override
	public void updateUser(User user) {
		System.out.println("User updated: "+ user.getFirstName());
		
	}
	
}
