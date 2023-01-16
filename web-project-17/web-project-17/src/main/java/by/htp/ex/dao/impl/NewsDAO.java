package by.htp.ex.dao.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import by.htp.ex.bean.News;
import by.htp.ex.dao.INewsDAO;
import by.htp.ex.dao.NewsDAOException;

public class NewsDAO implements INewsDAO {

	List<News> result = new ArrayList<News>();
	{
		result.add(new News(1, "title1", "brief1brief1brief1brief1brief1brief1brief1", "contect1", "11/11/22"));
		result.add(new News(2, "title2", "brief2brief2brief2brief2brief2brief2brief2", "contect2", "11/11/22"));
		result.add(new News(3, "title3", "brief3brief3brief3brief3brief3brief3brief3", "contect3", "11/11/22"));
		result.add(new News(4, "title4", "brief4brief4brief4brief4brief4brief4brief4", "contect4", "11/11/22"));
		result.add(new News(5, "title5", "brief5brief5brief5brief5brief5brief5brief5", "contect5", "11/11/22"));

	}

	@Override
	public List<News> getLatestsList(int count) throws NewsDAOException {

		return result.size() < count ? result : result.subList(0, count);
	}

	@Override
	public List<News> getList() throws NewsDAOException {

		return result;
	}

	@Override
	public News fetchById(int id) throws NewsDAOException {
		return result.stream().filter(i -> i.getIdNews().equals(id)).findFirst().get();

	}

	@Override
	public void addNews(News news) throws NewsDAOException {
		result.add(news);

	}

	@Override
	public void updateNews(News news) throws NewsDAOException {
		if (news.getIdNews().equals(result.indexOf(news))) {
			result.remove(news.getIdNews());
		}
		result.add(news);

	}

	@Override
	public void deleteNews(String[] idNews) throws NewsDAOException {

		int arr[] = Arrays.stream(idNews).mapToInt(Integer::parseInt).toArray();
		for (int i = 0; i < result.size(); i++) {
			News r = result.get(i);
			for (int j : arr) {
				if (r.getIdNews() == j) {
					this.result.remove(r);
				}

			}

		}

	}

}
