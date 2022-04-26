<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--
try {
	Class.forName("com.mysql.cj.jdbc.Driver"); 
	String url="jdbc:mysql://localhost:3306/sampleProjectDB?useSSL=false" ; 
	String userName="root";
	String passWord="rootroot";
	Connection con = DriverManager.getConnection(url,userName,passWord); 
	Statement st = con.createStatement();
	
	PreparedStatement pstmt;
	
	 //sql안의 데이터 보여주기
	String sql="select c_comment from Comment where c_content_no = 3 order by c_no;";
	pstmt = con.prepareStatement(sql);
	pstmt.setString(1, "3");
	ResultSet rs = st.executeQuery(sql);
	String strXML="";
	
		while(rs.next()){ 
			String s = rs.getString("c_comment"); 
			strXML += s;
			strXML += "<br>";
		}
	out.write(strXML);
	} catch (Exception e) {
		System.out.println(e);
	}

--%>