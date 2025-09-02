<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Dashboard Page</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
<div class="dashboard-container">
    <h2>Welcome, ${currentUser.username}!</h2>
    <p>Your role: <span class="role">${currentUser.role}</span></p>
    <a href="${pageContext.request.contextPath}/logout" class="btn logout-btn">Logout</a>
</div>
</body>
</html>
