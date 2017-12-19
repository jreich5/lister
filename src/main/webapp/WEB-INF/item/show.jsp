<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!doctype html>
<html class="no-js" lang="">
<head>
    <%@ include file="/WEB-INF/partials/head.html" %>

    <title>Lister: Item</title>

    <style>

    </style>

</head>
<body>

    <%@ include file="/WEB-INF/partials/navbar.html" %>

    <main class="container">

        <h1>List Item</h1>
        <h3>id #${item.id}</h3>
        <h3>Item name: ${item.name}</h3>
        <a href="/items/edit?id=${item.id}" class="btn btn-warning">Edit</a>
        <form method="POST" action="/items/delete">
            <input type="hidden" value="${item.id}" name="id">
            <button class="btn btn-danger">Delete</button>
        </form>

    </main>

    <%@ include file="/WEB-INF/partials/scripts.html" %>

</body>
</html>

