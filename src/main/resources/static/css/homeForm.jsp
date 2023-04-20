<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <h1 style="text-align: center;">회원가입</h1>
    <hr / width="1300">
    <form action="/home" method="post">
        <div style="text-align: center;">
            <input type="text" name="username" placeholder="username" /><br />
            <input type="password" name="password" placeholder="password" /><br />
            <input type="email" name="email" placeholder="email" /><br />
            <br>
            <button>회원가입</button>
        </div>
        <hr width="1300">
    </form>
</body>

</html>