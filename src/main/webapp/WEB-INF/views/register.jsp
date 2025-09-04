<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Customer Registration</title>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
<div class="form-container">
  <h2>New Customer Registration</h2>
  <form action="${pageContext.request.contextPath}/register" method="post" class="form">
    <div class="form-group">
      <label>Name:
      <input type="text" name="name" required></label>
    </div>
    <div class="form-group">
      <label>Email:
      <input type="email" name="email" required></label>
    </div>
    <div class="form-group">
      <label>Password:
      <input type="password" name="password" required></label>
    </div>
    <button type="submit" class="btn">Register</button>
  </form>
  <a href="${pageContext.request.contextPath}/login">Login</a>

  <p class="error">${error}</p>
  <p class="success">${success}</p>
</div>
</body>
</html>
