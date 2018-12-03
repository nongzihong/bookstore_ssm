<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/book/update">
    书籍名称：<input type="text" value="${book.name}" name="name" placeholder="书籍名称"><br>
    库存：    <input type="number" value="${book.cnt}" name="cnt" placeholder="库存"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
