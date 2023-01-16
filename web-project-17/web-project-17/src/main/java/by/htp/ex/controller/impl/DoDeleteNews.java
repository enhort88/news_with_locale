package by.htp.ex.controller.impl;

import by.htp.ex.controller.Command;
import by.htp.ex.service.INewsService;
import by.htp.ex.service.ServiceProvider;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class DoDeleteNews implements Command {
    private final INewsService newsService = ServiceProvider.getInstance().getNewsService();
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] newsIds = request.getParameterValues("idNews");
        if (newsIds != null) {
            newsService.deleteNews(newsIds);
            response.sendRedirect("controller?command=go_to_news_list");
        } else {
            request.getRequestDispatcher("/WEB-INF/pages/tiles/error.jsp").forward(request, response);
                    }
        }
}
