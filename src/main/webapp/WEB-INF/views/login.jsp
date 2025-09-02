<%
  if (session != null && session.getAttribute("currentUser") != null) {
    response.sendRedirect(request.getContextPath() + "/dashboard");
    return;
  }
%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Login Page</title>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
<div class="login-container">
  <h2>Login</h2>
  <form action="${pageContext.request.contextPath}/login" method="post" class="login-form">
    <div class="form-group">
      <label>Username:</label>
      <input type="text" name="username" required>
    </div>

    <div class="form-group">
      <label>Password:</label>
      <input type="password" name="password" required>
    </div>

    <button type="submit" class="btn">Login</button>
  </form>

  <p class="error">${error}</p>
</div>
</body>
</html>
