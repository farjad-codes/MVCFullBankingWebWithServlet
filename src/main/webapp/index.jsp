<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Home - Hello World</title>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
<div class="home-container">
  <h1>Hello World!</h1>
  <p>Welcome to our JSP application.</p>
  <a href="${pageContext.request.contextPath}/login" class="btn">Go to Login</a>
</div>
</body>
</html>
