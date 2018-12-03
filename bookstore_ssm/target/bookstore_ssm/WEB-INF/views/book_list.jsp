<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
<link href="/css/book_list.css" rel="stylesheet">
</head>
<body>

<table>

 所有书籍：
    <thead>
    <tr>
        <th>编号</th>
        <th>书名</th>
        <th>库存</th>
        <th>其他</th>
    </tr>

    </thead>

    <tbody>
<c:forEach items="${books}" var="b">
    <tr>
        <td>${b.bookid}</td>
        <td>${b.name}</td>
        <td>${b.cnt}</td>
        <td>
            <a href="/book/del?bookid=${b.bookid}">删除</a>
            <%--<a href="/book/update?bookid=${b.bookid}">修改</a>--%>
        </td>
    </tr>

</c:forEach>

    </tbody>

</table>
</body>
</html>
