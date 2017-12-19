<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!doctype html>
<html class="no-js" lang="">
<head>

    <title>Lister: Edit Item</title>

    <%@ include file="/WEB-INF/partials/head.html" %>

    <style>

    </style>

</head>
<body>

    <%@ include file="/WEB-INF/partials/navbar.html" %>

    <main class="container">

        <h1>Edit Item</h1>

        <form method="POST" action="/items/edit">
            <input type="hidden" value="<c:out value="${item.id}"/>" name="id">
            <label for="name">Name</label>
            <input id="name" name="name" type="text" placeholder="Type item name" value="<c:out value="${item.name}"/>">
            <button>Submit</button>
        </form>

    </main>

    <%@ include file="/WEB-INF/partials/scripts.html" %>

</body>
</html>

