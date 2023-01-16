package by.htp.ex.dao.impl;

import java.sql.SQLException;
import java.util.Random;

import by.htp.ex.bean.NewUserInfo;
import by.htp.ex.dao.DaoException;
import by.htp.ex.dao.IUserDAO;

public class UserDAO implements IUserDAO{
	String login = "";
	String password = "";
	NewUserInfo newUser = new NewUserInfo(login, password);
	

	@Override
	public boolean logination(String login, String password) throws DaoException {
		
		/*
		 * Random rand = new Random(); int value = rand.nextInt(1000);
		 * 
		 * if(value % 3 == 0) { try { throw new SQLException("stub exception");
		 * }catch(SQLException e) { throw new DaoException(e); } }else if (value % 2 ==
		 * 0) { return true; }else { return false; }
		 */
		
		if(login.equals(user().getLogin()) && password.equals(user().getPassword()) || login.equals("admin") && login.equals("admin")) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public String getRole(String login, String password) {
		if(login.equals("admin") && password.equals("admin")) {
			return "admin";
		}
		else {
			return "user";
		}
	}
	
	@Override
	public NewUserInfo user() {
		return newUser;
	}

	@Override
	public void registration(String login, String password) throws DaoException  {
		newUser.setLogin(login);
		newUser.setPassword(password);
	}

}
