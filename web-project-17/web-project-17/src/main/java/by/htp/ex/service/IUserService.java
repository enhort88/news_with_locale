package by.htp.ex.service;

public interface IUserService {
	
	String signIn(String login, String password) throws ServiceException;
	void registration(String login, String password) throws ServiceException;

}
