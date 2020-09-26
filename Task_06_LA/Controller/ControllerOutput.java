package Controller;

import Beans.User;
import Service.ServiceException;
import Service.ServiceInterface;
import Service.ServiceInterfaceRead;
import Service.ServiceLogin;
import Service.ServiseReadBooks;

public class ControllerOutput implements ControllerOutputInterface {
	
	
	ServiceInterface login = new ServiceLogin();
	
	ServiceInterfaceRead reading = new ServiseReadBooks();
	
	User i;
	
	public void logination(User u) throws ControllerExeption{
		this.i = u;
		boolean x = false;
		try {
			x = login.logination(u);
			if(x) 
			{System.out.println("\"Successfull logination\"");
			} else {
				System.out.println("failure");
			}throw new ControllerExeption("ss");
		} catch (ServiceException e) {
		
			e.printStackTrace();
			
		}
		
	
	
	}
	public void changeAge(User u, User b ) throws ControllerExeption {
		if( u.getSatus().equals("Adult")) {
			b.setSatus("Adult");
			
		} else throw new ControllerExeption("Who do you think you are!!!)");
	}
	
	public void readBooks(User u)  throws ControllerExeption {
		try {
			reading.readBooks(u);
		} catch (ServiceException e) {
			e.printStackTrace();
			}
		}
	}
	
	
	
	
	

