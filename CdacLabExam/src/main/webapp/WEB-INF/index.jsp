<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>Student Registration</h1>
    <form action="registerStudent" method="post">
        <label for="rollNo">Roll No:</label>
        <input type="number" id="rollNo" name="rollNo" required><br><br>
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        <label for="address">Address:</label>
        <textarea id="address" name="address" required></textarea><br><br>
        <label for="phoneNo">Phone No:</label>
        <input type="tel" id="phoneNo" name="phoneNo" required><br><br>
        <label for="degree">Degree:</label>
        <input type="text" id="degree" name="degree" required><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>