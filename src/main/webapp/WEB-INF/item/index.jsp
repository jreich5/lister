<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!doctype html>
<html class="no-js" lang="">
<head>
    <%@ include file="/WEB-INF/partials/head.html" %>

    <title>Lister: Items</title>

    <style>

    </style>

</head>
<body>

    <%@ include file="/WEB-INF/partials/navbar.html" %>

    <main class="container">

        <h1>Item List</h1>

        <ul>
            <c:forEach var="item" items="${items}">
                <li><a href="/items/show?id=<c:out value="${item.id}"/>"><c:out value="${item.name}" /></a></li>
            </c:forEach>
        </ul>

    </main>

    <%@ include file="/WEB-INF/partials/scripts.html" %>

</body>
</html>

