package by.htp.ex.dao;

import by.htp.ex.bean.NewUserInfo;

public interface IUserDAO {
	
	boolean logination(String login, String password) throws DaoException;
	void registration(String login, String password) throws DaoException;
	String getRole(String login, String password) throws DaoException;
	NewUserInfo user() throws DaoException;

}
