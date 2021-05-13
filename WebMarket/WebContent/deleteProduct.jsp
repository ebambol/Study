<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*"%>
<%@ include file="dbconn.jsp"%>
<%
	String productId = request.getParameter("id");	

	String sql = "select * from product";
	pstmt = conn.prepareStatement(sql);
	rs = pstmt.executeQuery();
	// product 테이블의 상품 레코드만 삭제하며, 업로드한 파일 삭제처리는 구현되지 않음.
	if (rs.next()) {
		sql = "delete from product where p_id = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, productId);
		pstmt.executeUpdate();
	} else
		out.println("일치하는 상품이 없습니다");
	
	if (rs != null)
		rs.close();
 	if (pstmt != null)
 		pstmt.close();
 	if (conn != null)
		conn.close();
	
 	response.sendRedirect("editProduct.jsp?edit=delete");
%>
