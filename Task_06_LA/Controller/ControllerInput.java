package Controller;

import Beans.Book;
import Beans.User;
import DAO.DAOAdd;
import DAO.DAOEXception;
import DAO.Lists_of_items;

public class ControllerInput implements ControllerIntefaceInput {
	
	DAOAdd add = new Lists_of_items();
	
	@Override
	public void registration(User u) throws ControllerExeption {
		try {
			add.addUser(u);
			throw new ControllerExeption("Cannot register the user");
		} catch (DAOEXception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void newBookAdult(Book b) throws ControllerExeption {
		try {
			add.addBookAdults(b);
			throw new ControllerExeption("Cannot ADD Book For Adults");
		} catch (DAOEXception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void newBookJunior(Book b) throws ControllerExeption {
		try {
			add.addBookJuniors(b);
			throw new ControllerExeption("Cannot ADD Book For Junions");
		} catch (DAOEXception e) {
			e.printStackTrace();
		}
	}
}
