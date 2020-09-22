package spring.beans;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

	public void save() {
		System.out.println("--------------Save--------------");
	}
}
