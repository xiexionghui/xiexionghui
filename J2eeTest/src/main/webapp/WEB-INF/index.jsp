<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <%
  int i=11;
  %>
  
    This is my JSP page. <br>
    <c:set var="i" value="2"></c:set>
    <c:if test="${request.i==10 }">
    	启用
    </c:if>
    <c:if test="${i==20 }">
    	停用
    </c:if>
    <c:choose>
    	<c:when test="${i==10 }">
    		启用
    	</c:when>
    	<c:when test="${i==11 }">
    		启用
    	</c:when>
    	<c:otherwise>
    		停用
    	</c:otherwise>
    </c:choose>
    
    
    	<p style='${i==1?"":"display: none"}'>i=1;</p>
  </body>
</html>
