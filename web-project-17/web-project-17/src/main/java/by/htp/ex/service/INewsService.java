package by.htp.ex.service;

import java.util.List;

import by.htp.ex.bean.News;

public interface INewsService {
	void save();

	void find();

	void update(News news);

	void deleteNews(String[] newsIds);

	void addNews(News news);

	List<News> latestList(int count) throws ServiceException;

	List<News> list() throws ServiceException;

	News findById(int id) throws ServiceException;
}
