<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
            <meta charset="UTF-8">
            <title>상품목록보기</title>
        </head>


        <body>
            <table border="1" align="content">
                <caption>상품 목록</caption>
                <thead>
                    <tr>
                        <th>상품명</th>
                        <th>상품 가격</th>
                        <th>상품 수량</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="product" items="${product}">
                        <tr>
                            <td>${product.productName}</td>
                            <td>${product.productPrice}</td>
                            <td>${product.productPrice}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </body>

        </html>
        <%@ include file="../layout/footer.jsp" %>