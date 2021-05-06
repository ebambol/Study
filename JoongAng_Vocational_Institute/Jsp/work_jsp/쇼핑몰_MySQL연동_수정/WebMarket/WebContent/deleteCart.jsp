<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>

<%
	String id = request.getParameter("cartId");
	if (id == null || id.trim().equals("")) {
		response.sendRedirect("cart.jsp");
		return;
	}
	// 장바구니에 있는 모든 상품을 삭제
	session.invalidate();
	
	response.sendRedirect("cart.jsp");
%>
