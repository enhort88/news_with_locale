<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:if test="${requestScope.presentation eq 'newsList' }">
	<c:import url="/WEB-INF/pages/tiles/newsList.jsp" />
</c:if>

<c:if test="${requestScope.presentation eq 'viewNews' }">
	<c:import url="/WEB-INF/pages/tiles/viewNews.jsp" />
</c:if>

<c:if test="${requestScope.presentation eq 'addNews' }">
	<c:import url="/WEB-INF/pages/tiles/addNews.jsp" />
</c:if>

<c:if test="${requestScope.presentation eq 'editNews' }">
	<c:import url="/WEB-INF/pages/tiles/editNews.jsp" />
</c:if>