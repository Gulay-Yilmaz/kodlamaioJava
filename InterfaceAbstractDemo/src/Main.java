import java.time.LocalDate;
import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1, "Gulay", "Yilmaz",new Date(2001, 4, 21),"11111222222"));
		
		BaseCustomerManager customerManager2 = new NeroCustomerManager();
		customerManager2.Save(new Customer(1, "Gulay", "Yilmaz",new Date(2001, 4, 21),"22222111111"));
		
	}

}
