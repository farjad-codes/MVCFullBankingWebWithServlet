<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Account Information</title>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
<div class="dashboard-container">
  <h2>Welcome, ${customer.name}!</h2>
  <p>Email: ${customer.email}</p>
  <p>Account Number: ${account.accountNumber}</p>
  <p>Balance: $${account.balance}</p>
  <a href="${pageContext.request.contextPath}/logout" class="btn logout-btn">Logout</a>
</div>
</body>
</html>
