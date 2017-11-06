<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<sql:query var="rs" dataSource="jdbc/spring">
select id, foo, bar from testdata
</sql:query>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	hi,there. Session
	<%=session.getAttribute("name") %>
	Request
	<%=request.getAttribute("name") %>

	<p>Request(EL) ${name}</p>
	<c:out value="${name}"></c:out>
	
	<c:forEach var="row" items="${offers}">
    Id ${row.id}<br/>
    Name ${row.name}<br/>
    Email ${row.email}<br/>
    Text ${row.text}<br/>
</c:forEach>
	
	
	
</body>
</html>