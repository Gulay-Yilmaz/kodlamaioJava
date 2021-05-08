package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Adapters.MernisServiceAdapter;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService CustomerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService CustomerCheckService) {
		this.CustomerCheckService = CustomerCheckService;

	}



	@Override
	public void Save(Customer customer) {
		if (CustomerCheckService.CheckIfRealPerson(customer)) {

			this.Save(customer);
			System.out.println("Person verified");

		} else {

			System.out.println("Not a valid person");
		}
	}

}
