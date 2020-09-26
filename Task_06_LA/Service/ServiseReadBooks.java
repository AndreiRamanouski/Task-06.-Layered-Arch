package Service;

import Beans.User;
import DAO.DAOREADFILES;

public class ServiseReadBooks implements ServiceInterfaceRead {
		
	DAOREADFILES read = new DAOREADFILES();
	
	@Override
	public void readBooks(User u) throws ServiceException {
		String str = u.getSatus();
		
			if (str.equals("Adult")) {
				
				System.out.println("Books foe adults");
				
				read.readAdults();
				read.readJuniors();
				
			} else if (str.equals("Junior")){
				
				System.out.println("Books for juniors\n");
				
				read.readJuniors();
				
			} else throw new ServiceException("Something is wrong in service");
		
	}
}
