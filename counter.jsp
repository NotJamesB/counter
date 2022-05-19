<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>counter</title>
    </head>
<body>
	<h3>You have visited this page <c:out value="${showCount}"/> times. </h3>
	<p> <a href="/your_server/counter">Test another visit?</a> </p>
</body>
</html>

