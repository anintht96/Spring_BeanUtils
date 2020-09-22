package spring.app;

import spring.beans.BeanUtils;
import spring.beans.UserDAO;

public class MainApp {

	public void save() {
		UserDAO userDAO=BeanUtils.getBean(UserDAO.class);
		userDAO.save();
	}
}
