<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>(2) JSTL Core Tag : if</title>
</head>
<body>
<%--
	<c:if>
	===================================================================
	if 구문과 같이 논리 결과에 따라 선택을 분기하는 기능<br />
	test 속성 값에 true/false 인지에 따라 분기<br />
	test 속성 값에 EL 을 사용할 수 있다. <br />
	else 구문은 없다. <br />
--%>

<h3>&lt;c:if&gt; 태그</h3>
<br />

<%-- 1. request 에 name 속성을<c:set> 으로 추가 --%>
<c:set var="name" scope="request" value="길동"/>


<%-- 2. <c:if> 로 name 속성 값이 존재하는지 여부를 기준으로 분기 --%>
<h4>EL 과 c:if 의 test 속성을 조합</h4>
<c:if test="${not empty requestScope.name}">
	${name}
</c:if>	
<br />
<br />
<c:if test="${empty requestScope.name}">
	request 에 name attribute 가 없습니다.	
</c:if>

<%-- 3. <c:if test="not empty ..."> <c:if test="empty .. 
		와 동일한 스크립트릿 코드 작성
--%>
<%
	String name = (String)request.getAttribute("name");
	if (name != null) {		
%>
		name=<%=name %> <br />
<% 	
	} else {
%>
		request 에 name attribute 가 없습니다.		
<%	} %>
<hr />



</body>
</html>