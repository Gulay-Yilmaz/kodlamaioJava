package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter  implements ICustomerCheckService {

	@SuppressWarnings("deprecation")
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result = true;
		
		try {
			return proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
					customer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}

		return result;
	}

}
