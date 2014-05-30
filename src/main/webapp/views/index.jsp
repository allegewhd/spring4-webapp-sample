<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Start new webapp age!</title>

    <!-- Bootstrap -->
    <link href='<c:url value="/resources/css/bootstrap.min.css" />' rel="stylesheet">
</head>
<body>

<h1>Oops! It's works.</h1>
<br />
<h3>
    <a href='<c:url value="/home" />'>Start with Github</a>
</h3>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src='<c:url value="/resources/js/bootstrap.min.js" />'></script>

</body>
</html>
