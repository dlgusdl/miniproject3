<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
            <style>
                .qButton {
                    font-size: 0.5em;
                    font-weight: bold;
                    width: 100px;
                    height: 22px;
                    display: inline;
                    margin-right: 2px;
                    background-color: rgb(10, 18, 31);
                    cursor: pointer;
                    color: rgb(255, 255, 255);
                    border: none;
                    padding: 0.2em 2em;
                }
            </style>
        </head>

        <body>
            <h1 style="text-align: center;">회원가입</h1>
            <hr / width="1300">
            <form>
                <div style="text-align: center;">
                    <input type="text" name="username" placeholder="username" /><br />
                    <input type="password" name="password" placeholder="password" /><br />
                    <input type="email" name="email" placeholder="email" /><br />
                    <br>
                    <button type="submit" class="qButton"
                        style="border-radius: 30px; padding: 1.5px 20px; margin-right: 1em;">
                        <a style="text-decoration: none; color: rgb(253, 255, 255);"> 회원가입</a>
                    </button>
                </div>
                <hr width="1300">
            </form>
        </body>

        </html>
        <%@ include file="../layout/footer.jsp" %>